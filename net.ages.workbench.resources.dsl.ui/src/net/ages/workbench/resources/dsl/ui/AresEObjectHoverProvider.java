package net.ages.workbench.resources.dsl.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

import net.ages.workbench.resources.dsl.ares.AresModel;
import net.ages.workbench.resources.dsl.ares.Definition;

public class AresEObjectHoverProvider extends DefaultEObjectHoverProvider{
		@Override
		protected String getFirstLine(EObject o) {
			if (o instanceof Definition) {
				Definition d = (Definition) o;
				return "<b>Resource:</b> " + ((AresModel)d.eContainer()).getName() + ".ares<br><b>Key: </b>"  + d.getName();
			}
			return super.getFirstLine(o);
		}

	}
