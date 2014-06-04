package net.ages.workbench.templates.dsl.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import net.ages.workbench.resources.dsl.ares.Definition;
import net.ages.workbench.templates.dsl.atem.AtemModel;
import net.ages.workbench.templates.dsl.atem.ElementType;
import net.ages.workbench.templates.dsl.atem.ResourceText;
import net.ages.workbench.templates.dsl.atem.Section;

public class AtemEObjectDocumentationProvider implements IEObjectDocumentationProvider {

			@Override
			public String getDocumentation(EObject o) {
/*
				if (o instanceof ResourceText) {
					return "Use <i>sid</i> to indicate a specific value to use when generating a document.";
				}
				if (o instanceof ElementType) {
					return "Use <i>sid</i> to indicate a specific value to use when generating a document.";
				}
*/
				return null;
			}
}
