package net.ages.workbench.templates.dsl.utils;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceProxy;
import org.eclipse.core.resources.IResourceProxyVisitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;


class VisitorSeekingFiles implements IResourceProxyVisitor {  
	private String platformScheme = "platform:/resource";
	private IProject[] theProjects;
	private String[] projectPaths;
	private ResourceSet resourceSet;
	private Map<String, org.eclipse.emf.common.util.URI> fileResourceMap = 
			new HashMap<String, org.eclipse.emf.common.util.URI>();
	private String [] fileExtensions;
	private URIConverter converter = new ExtensibleURIConverterImpl();
	
    public VisitorSeekingFiles(String [] extensions) {
    	fileExtensions = extensions;
    }
    
    public void setProjects(IProject[] projects) {
    		this.theProjects = projects;
    		projectPaths = new String[theProjects.length];
    		for (int i = 0; i < theProjects.length; i++) {
    			projectPaths[i] = theProjects[i].getFullPath().toString();
    		}
    }
    
    public String getMatchingProject(String fileUri) {
    	  String result = null;
    	  for (String s : projectPaths) {
    		  if (fileUri.contains(s)) {
    			  return s;
    		  }
    	  }
    	  return result;
    }
    
    public String createPlatformUri(String fileUri) {
    		String result = null;
    		String matchingProject = getMatchingProject(fileUri);
    		String[] theParts = fileUri.split(matchingProject);
    		result = matchingProject + theParts[1];
    		return result;
    }
    
    public void setResourceSet(ResourceSet set) {
    	resourceSet = set;
    }
    
	public boolean visit (IResourceProxy proxy) { 
        if (proxy.getType() == 1) { // a file
        		IFile file = (IFile) proxy.requestResource();
        		try {
            		if (desiredExtension(file.getFileExtension())) {
            			String uri = createPlatformUri(proxy.requestResource().getLocationURI().toString());
               		fileResourceMap.put(proxy.getName(), URI.createPlatformResourceURI(uri,true));
            		}
        		} catch (Exception e) {
        			// ignore
        		}
        }
        return true;  
    } 
	
	/**
	 * Checks filename extension against array of desired extensions
	 * @param filename
	 * @return true of filename ends with an extension in the array
	 */
	public boolean desiredExtension(String extension) {
		for (String e : fileExtensions) {
			if (extension.startsWith(e)) {
				return true;
			}
		}
		return false;
	}
    
    public Map<String, org.eclipse.emf.common.util.URI> getFileResourceMap() {
    	return fileResourceMap;
    }
    
    public ResourceSet getResourceSet() {
    	return resourceSet;
    }
    
	public org.eclipse.emf.common.util.URI createEmfUri(String uri) {
		// return URI.createURI(uri);
		return URI.createPlatformResourceURI(uri,true);
	}

	public java.net.URI createJavaUri(String uri) {
		return toJavaUri(URI.createURI(uri));
	}
	
	public org.eclipse.emf.common.util.URI toEmfUri(java.net.URI javaURI) {
		return org.eclipse.emf.common.util.URI.createPlatformResourceURI(javaURI.toString(),true);
	}

	public java.net.URI toJavaUri(org.eclipse.emf.common.util.URI emfURI) {
		return java.net.URI.create(emfURI.toString());
	}

} 


