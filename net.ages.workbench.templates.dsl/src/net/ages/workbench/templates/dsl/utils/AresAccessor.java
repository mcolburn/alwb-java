package net.ages.workbench.templates.dsl.utils;

import org.eclipse.core.resources.IProject; 
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI; 
import org.eclipse.emf.ecore.resource.Resource; 
import org.eclipse.emf.ecore.resource.ResourceSet; 
import org.eclipse.xtext.generator.IGenerator; 
import org.eclipse.xtext.resource.IResourceDescriptions; 
import org.eclipse.xtext.ui.resource.IResourceSetProvider; 
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;

import net.ages.workbench.templates.dsl.atem.AtemModel;

import com.google.inject.Inject; 
import com.google.inject.Provider;

@SuppressWarnings("deprecation")
public class AresAccessor  {
	
//	@Inject
//	IResourceSetProvider resourceSetProvider;
	@Inject
	private XtextResourceSetProvider provider;
	
	ResourceSet rs;
	
	public AresAccessor() {
		rs = provider.get(getProject("library"));
	}
	public ResourceSet getAresResourceSet() {
		return rs;
	}

	public IProject[] getProjects(){
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		return projects;
	}

	public IProject getProject(String name) {
		IProject p = null;
		IProject[] theProjects = getProjects();
		for (IProject project: theProjects) {
			if (project.getName().contains(name)) {
				return project;
			}
		}
		return p;
	}

}


