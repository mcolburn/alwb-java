package net.ages.workbench.templates.dsl.ui.decorators;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;



/**
 * The purpose of this class is to add a status to the templates displayed
 * in the Eclipse Package Explorer.  The status is set via the key word Status
 * from the template DSL, e.g. Status Final.
 * 
 * This class "decorates" the template name by adding a suffix that shows the status.
 * The status is read from the file.  
 * 
 * There are four challenges about Eclipse decorators.
 * 1. For some reason, each template gets "decorated" three times. 
 *    In order to prevent this, I added a HashMap to keep track of
 *    whether the template has already been decorated.
 * 2. The methods provided through Eclipse only allow you to append a
 *    suffix or prefix.  And, I can't find a way to clear them.
 * 3. There is not means that I can find that allows you to see what the suffixes
 *    are.  They are visible through the debugger, but the developers of Eclipse
 *    did not provide a method to get to them.
 * 4. This class was only getting called when Eclipse started up.  I needed a way
 *    to also have it called when a resource (template) gets saved.  In order to 
 *    do this, I created SavePostProcessor.java.  When it invokes the decorator
 *    it resets all the decorations.  So, I needed a way to tell this class to
 *    reset the map. That is accomplished using the clearMap public boolean.
 *    
 * @author mac002
 *
 */
public class AlwbDecorator  implements ILightweightLabelDecorator {

	private Map<String,String> files = new HashMap<String,String>();
	private final String unknown = " (unknown)";
	private final String draft = " (draft)";
	private final String review = " (review)";
	private final String finalized = " (final)";
	public static boolean clearMap = true;
	private ImageDescriptor imgDraft;

	 @Override
	 public void decorate(Object element, IDecoration decoration) {
		 
		 // clearMap gets set to true by SavePostProcessor.java
		 if (clearMap) {
			 files = new HashMap<String,String>();
		 }
		 IResource objectResource = (IResource) element;
		
		 String filename = objectResource.getName();
		 if (objectResource.getType() == objectResource.FILE 
				 && objectResource.getFileExtension().contains("atem")) {
			 String status = getStatus( objectResource.getLocation().toOSString());
			  if (! files.containsKey(filename)) {
					  decoration.addSuffix(status);
					  files.put(filename, status);
					  clearMap = false;
					  decoration.addOverlay(imgDraft);
			 }
		 }
	 }

	 @Override
	 public void addListener(ILabelProviderListener listener) {
	 }

	 @Override
	 public void dispose() {
	  // nothing to do
	 }

	 @Override
	 public boolean isLabelProperty(Object element, String property) {
	  return false;
	 }

	 @Override
	 public void removeListener(ILabelProviderListener listener) {
	 }
	 
	 private String getStatus(String filename) {
		 String status = unknown;
		 BufferedReader br = null;
		 
		try {
			String line;
			br = new BufferedReader(new FileReader(filename));
			while ((line = br.readLine()) != null) {
				if (line.contains("Status")) {
					if (line.toLowerCase().contains("draft")) {
						status = draft;
					} else if (line.toLowerCase().contains("review")) {
						status = review;
					} else if (line.toLowerCase().contains("final")) {
						status = finalized;
					} else {
						status = unknown;
					}
					break;
				} else if (line.contains("import")) {
					status = unknown;
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}	 
	    return status;
	}

}


