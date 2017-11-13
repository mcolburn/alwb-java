package net.ages.workbench.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import net.ages.workbench.utils.AlwbLogger;
import org.apache.logging.log4j.Logger;
import java.net.URI;
import java.net.URL;

import javax.xml.transform.stream.StreamSource;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public class AlwbPlugInHelper {
	public IPath platformLocation;
	public Bundle bundle;
	public String bundleLocation;
	private Logger logger;
	
	public AlwbPlugInHelper(String symbolicName) {
		try {
			AlwbLogger.initialize();
			logger = AlwbLogger.getLogger(AlwbPlugInHelper.class.getName());
			logger.entry();
			bundle = Platform.getBundle(symbolicName);
			platformLocation = Platform.getLocation();
			bundleLocation = bundle.getLocation();
		} catch (Exception e) {
			logger.catching(e);
		} finally {
			logger.exit();
		}
		
	}
	
	public URL getResourceFromBundle(String path) {
		logger.entry(path);
		URL theUrl = null;
		try {
			theUrl = bundle.getEntry(path);
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return theUrl;
	}
	
	public File getResourceInputFile(String resource) {		
		logger.entry();
		File f = null;
		try {
			f = new File(FileLocator.resolve(getResourceFromBundle(resource)).toURI());
			if (! f.exists()) {
			  throw new java.io.FileNotFoundException(resource);
			}
		} catch (FileNotFoundException fe) {
			logger.catching(fe);
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return f;
	}
	
	/**
	 * A wrapper for new InputStream() to ensure that if the input file does not exist, an error will get logged with the name of the file
	 * <p>Note that this method 
	 * @param file
	 * @return
	 */

	public StreamSource getInputStream(String file) {
		logger.entry();
		File f = getResourceInputFile(file);
		StreamSource s = null;
		try {
			s = new StreamSource(new FileInputStream(f));
			s.setSystemId(f);
			logger.trace("System ID is: " + s.getSystemId());
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return s;
	}
	public URI getResourceUri(String path) {
		logger.entry(path);
		URI uri = null;
		try {
			uri = getResource(path).toURI();
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return uri;
	}
	
	public String getBundleAbsolutePath() {
		String [] theParts = bundleLocation.split(":");
		return theParts[2];
	}
	public URL getResource(String path) {
		logger.entry(path);
		URL theUrl = null;
		try {
			theUrl = new URL("platform:/plugin/" + bundle.getSymbolicName() + "/" + path);
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
		return theUrl;
	}

	public void toLog() {
		logger.entry();
		logger.trace("User Data Location: " + Platform.getUserLocation());
		logger.trace("User Operation System: " + Platform.getOS());
		logger.trace("User Architecture: " + Platform.getOSArch());
		logger.trace("Platform Location (OS String): " + platformLocation.toOSString());
		logger.trace("Platform Log Location: " + Platform.getLogFileLocation());
		logger.trace("Bundle Symbolic Name: " + bundle.getSymbolicName());
		logger.trace("Bundle Location: " + bundleLocation);
		logger.exit();
	}
		

}
