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

import org.eclipse.core.runtime.CoreException; 
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IDecoratorManager;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;

import net.ages.workbench.templates.dsl.ui.decorators.AlwbDecorator;

/**
 * The sole purpose of this class is to trigger a refresh of the decorators
 * on atem files after a save of the file.
 * @author mac002
 *
 */
public class SavePostProcessor implements IXtextBuilderParticipant {

	@Override
	public void build(IBuildContext context, IProgressMonitor monitor)
			throws CoreException {
		AlwbDecorator.clearMap = true;
		Display.getDefault().asyncExec(new Runnable() {
		    public void run() {
		    		IDecoratorManager idm = PlatformUI.getWorkbench().getDecoratorManager();
		    		idm.update("net.ages.workbench.templates.dsl.ui.decorator"); 
			}
		});

	}


}

