package net.ages.workbench.templates.dsl.ui.handler;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Whitelist;
import org.jsoup.Jsoup;

import net.ages.workbench.utils.AlwbLogger;

import org.apache.logging.log4j.Logger;

/**
 * @author mac002
 *
 */
public class Utilities {

	private static Logger logger = AlwbLogger.getLogger("Utilities");
	
	/**
	 * Open an Editor for the given file
	 * @param filePath
	 */
	public static void openEditor(String filePath) {
		logger.entry();
		try {
			final IFile inputFile = getFileForLocation(filePath);
			if (inputFile != null) {
			    IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			    try {
				    IEditorPart openEditor = IDE.openEditor(page, inputFile);
			    } catch (PartInitException e) {
			    		logger.catching(e);
			    }
			}
		} catch (Exception e) {
			logger.catching(e);
		}
	}

	/**
	 * Get the IFile handle for the given file
	 * @param filePath
	 * @return
	 */
	public static IFile getFileForLocation(String filePath) {
		logger.entry();
		IFile result = null;
		try {
			result = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(Path.fromOSString(filePath));
		} catch (Exception e) {
			logger.catching(e);
			result = null;
		}
		logger.exit();
		return result;
	}
	
	/**
	 * Beautify (format) the HTML file
	 * <p>Reads the HTML file in, formats it via Jsoup, then writes it back out
	 */
	public static void beautifyHtml(String filePath) {
		logger.entry();
		try {
			final IFile inputFile = getFileForLocation(filePath);
			final IPath location = inputFile.getLocation();
			if (location != null) {
			    try {
				    	File input = location.toFile();
				    	Document.OutputSettings settings = new Document.OutputSettings();
				    	settings.charset("utf-8");
				    	settings.indentAmount(4);
				    	settings.outline(true);
				    	settings.prettyPrint(true);
				    Document doc = Jsoup.parse(input, "UTF-8", "http://example.com/");
				    doc.outputSettings(settings);
					input.delete();
					FileUtils.writeStringToFile(new File(filePath), doc.html());
			    } catch (Exception e) {
			    		logger.catching(e);
			    }
			}
		} catch (Exception e) {
			logger.catching(e);
		}
		logger.exit();
	}
}

