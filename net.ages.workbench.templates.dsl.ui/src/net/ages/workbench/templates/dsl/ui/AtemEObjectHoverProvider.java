package net.ages.workbench.templates.dsl.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import net.ages.workbench.resources.dsl.ares.Definition;
import net.ages.workbench.templates.dsl.atem.AtemModel;
import net.ages.workbench.templates.dsl.atem.ElementType;
import net.ages.workbench.templates.dsl.atem.ResourceText;
import net.ages.workbench.templates.dsl.atem.Section;

public class AtemEObjectHoverProvider extends DefaultEObjectHoverProvider{
		@Override
		protected String getFirstLine(EObject o) {
/*
			if (o instanceof ResourceText) {
				return "Specific ID";
			} 
			if (o instanceof ElementType) {
				return "Specific ID";
			} 
			*/
			return super.getFirstLine(o);
		}

	}
