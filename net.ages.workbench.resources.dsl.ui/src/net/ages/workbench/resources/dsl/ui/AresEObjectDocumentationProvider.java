package net.ages.workbench.resources.dsl.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;

import net.ages.workbench.resources.dsl.ares.AresModel;
import net.ages.workbench.resources.dsl.ares.Definition;

public class AresEObjectDocumentationProvider implements IEObjectDocumentationProvider {

			@Override
			public String getDocumentation(EObject o) {
				if (o instanceof Definition) {
					Definition d = (Definition) o;
					if (d.getDsl_Definition_Text() != null) {
						return "<b>Value:</b> " + ((Definition)o).getDsl_Definition_Text();
					} else {
						if (d.getDsl_Definition_Ref() != null) {
							AresModel m = (AresModel) d.getDsl_Definition_Ref().eContainer();
							return "<b>Primary Value:</b> " + m.getName() + "." + d.getDsl_Definition_Ref().getName() + "<br><b>Indirect Value: </b>" + d.getDsl_Definition_Ref().getDsl_Definition_Text();
						} else {
							return null;
						}
					}
				}
				return null;
			}
}
