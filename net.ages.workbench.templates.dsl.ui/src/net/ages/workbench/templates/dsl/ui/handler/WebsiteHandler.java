package net.ages.workbench.templates.dsl.ui.handler;

/**
 * This file was created by Michael Colburn
 * but, except for some minor adaptations, is from
 * http://christiandietrich.wordpress.com/2011/10/15/xtext-calling-the-generator-from-a-context-menu/#comment-167
 *
 * The main adaptation was to combine into a single handler the two
 * use cases: 1) right-clicking a closed file that is listed in the navigation pane.
 * 2) within an opened AGES DSL file, right-click.
 * In both cases, there is a menu item to generate an AGES file.
 */

import org.eclipse.core.commands.AbstractHandler; 
import org.eclipse.core.commands.ExecutionEvent; 
import org.eclipse.core.commands.ExecutionException; 
import org.eclipse.core.commands.IHandler; 
import org.eclipse.core.resources.IFile; 
import org.eclipse.core.resources.IFolder; 
import org.eclipse.core.resources.IProject; 
import org.eclipse.core.runtime.CoreException; 
import org.eclipse.core.runtime.NullProgressMonitor; 
import org.eclipse.emf.common.util.URI; 
import org.eclipse.emf.ecore.resource.Resource; 
import org.eclipse.emf.ecore.resource.ResourceSet; 
import org.eclipse.jface.viewers.ISelection; 
import org.eclipse.jface.viewers.IStructuredSelection; 
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil; 
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess; 
import org.eclipse.xtext.generator.IGenerator; 
import org.eclipse.xtext.resource.IResourceDescriptions; 
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.resource.IResourceSetProvider; 
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject; 
import com.google.inject.Provider;

import net.ages.workbench.templates.dsl.ui.handler.Utilities;
import net.ages.workbench.utils.AlwbGeneralUtils;
import net.ages.workbench.utils.AlwbLogger;

import org.apache.logging.log4j.Logger;


@SuppressWarnings("deprecation")
public class WebsiteHandler extends AbstractHandler implements IHandler {

	@Inject
	private IGenerator generator;

	@Inject
	private Provider<EclipseResourceFileSystemAccess> fileAccessProvider;
	
	@Inject
	IResourceDescriptions resourceDescriptions;
	
	@Inject
	IResourceSetProvider resourceSetProvider;

	private Logger logger = AlwbLogger.getLogger("GenerationHandler");
	

	public Object execute(ExecutionEvent event) throws ExecutionException {
		logger.entry();
		IFile file = null;
		Resource r = null;
		URI uri = null;
		ResourceSet rs = null;
		IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
		
		if (activeEditor == null) {
			ISelection selection = HandlerUtil.getCurrentSelection(event);
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				Object firstElement = structuredSelection.getFirstElement();
				if (firstElement instanceof IFile) {
					file = (IFile) firstElement;
				}
			}
		} else {
			file = (IFile) activeEditor.getEditorInput().getAdapter(IFile.class);
		}
		if (file != null) {
			final String outputRootFolder = "src-gen";
			IProject project = file.getProject();
			final IFolder srcGenFolder = project.getFolder(outputRootFolder);
			if (!srcGenFolder.exists()) {
				try {
					srcGenFolder.create(true, true,
							new NullProgressMonitor());
				} catch (CoreException e) {
					logger.catching(e);
					return null;
				}
			}
			final String outputPath = srcGenFolder.getFullPath().toString();
			final String projectPath = project.getLocation().toOSString() + "/" + outputRootFolder;
			AlwbGeneralUtils.absolutePathToSrcGen = projectPath;
			AlwbGeneralUtils.websiteOnly = true;
			AlwbGeneralUtils.copyAssets = true;
			final EclipseResourceFileSystemAccess fsa = fileAccessProvider.get();
			fsa.setOutputPath(outputPath);
			if (activeEditor == null) {
				uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				rs = resourceSetProvider.get(project);
				r = rs.getResource(uri, true);
				generator.doGenerate(r, fsa);
			} else {
				if (activeEditor instanceof XtextEditor) {
					((XtextEditor)activeEditor).getDocument().readOnly(new IUnitOfWork<Boolean, XtextResource>() {
					
						public Boolean exec(XtextResource state)
								throws Exception {
							generator.doGenerate(state, fsa);
							return Boolean.TRUE;
						}
					});
				}
			}
		}
		logger.exit();
		return null;
	}
		
	@Override
	public boolean isEnabled() {
		return true;
	}
	
}

