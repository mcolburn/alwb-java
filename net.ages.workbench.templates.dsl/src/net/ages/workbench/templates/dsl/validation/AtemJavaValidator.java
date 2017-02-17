package net.ages.workbench.templates.dsl.validation;
 

	import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.validation.Check;

import net.ages.workbench.resources.dsl.ares.AresPackage;
import net.ages.workbench.templates.dsl.atem.AtemModel;
import net.ages.workbench.templates.dsl.atem.AtemPackage;
import net.ages.workbench.templates.dsl.atem.DayNameRange;
import net.ages.workbench.templates.dsl.atem.DayRange;
import net.ages.workbench.templates.dsl.atem.DaySet;
import net.ages.workbench.templates.dsl.atem.HeadComponent;
import net.ages.workbench.templates.dsl.atem.SectionFragment;
import net.ages.workbench.templates.dsl.atem.TemplateFragment;

	public class AtemJavaValidator extends AbstractAtemJavaValidator {
		
		final public static String NAME_MISMATCH = "Template name does not match filename. Resource name must be identical in characters and case, except it leaves off the .ares extension.";
		// Verify that the template name matches the filename.
		@Check
		public void verifyTemplateAndFilenamesMatch (AtemModel atemModel) {
	        URI uri = atemModel.eResource().getURI();
	        String normalizedFilename = uri.lastSegment().replace("." + uri.fileExtension(), "");
			if (!atemModel.getName().matches(normalizedFilename)) {
				error(NAME_MISMATCH, AtemPackage.Literals.ATEM_MODEL__NAME,NAME_MISMATCH,normalizedFilename);
			}		
		}

		final public static String MISSING_SET_DATE = "If a template name starts with 'se.' it is a date sensitive template and must have a Set_Date in its header.";
		// Verify that a Service Template has a Set_Date tag.
		@Check
		public void verifyServiceTemplateHasSetDate (AtemModel atemModel) {
			if (atemModel.getName().toLowerCase().startsWith("se.")) {
				boolean containsSetDate = false;
				for (HeadComponent  c : atemModel.getDsl_Template_head().getDsl_Head_components()) {
					System.out.println(c.getClass().getName());
					if (c.getClass().getName().endsWith("impl.DateImpl")) {
						containsSetDate = true;
						break;
					}
				}
				if (! containsSetDate) {
					error(MISSING_SET_DATE, AtemPackage.Literals.ATEM_MODEL__DSL_TEMPLATE_HEAD);
				}
			}
		}

		// If the section pointed to by an insert_section is the same as the containing section,
		// an infinite recursion occurs and we get a stack overflow exception.
		@Check
		public void checkForCircularReferenceToSection (SectionFragment fragment) {
			if (fragment.getName() == fragment.eContainer()) {
				error("Section name and insert_section name can't be the same.  When using the autocompletion pop-up, watch out for duplicate names.  If you see the same name more than once, pay attention to which package each item comes from.", AtemPackage.Literals.SECTION_FRAGMENT__NAME);
			}
		}

		// If the section pointed to by an insert_section is the same as the containing section,
		// an infinite recursion occurs and we get a stack overflow exception.
		@Check
		public void checkForCircularReferenceToTemplate (TemplateFragment fragment) {
			if (fragment.getName() == fragment.eContainer()) {
				error("Can't insert a template into itself.", AtemPackage.Literals.TEMPLATE_FRAGMENT__NAME);
			}
		}
		
		@Check
		public void checkForValidDayNameRange(DayNameRange r) {
			if (r.getDsl_DayNameRange_from() != null & r.getDsl_DayNameRange_To() != null) {
				int result = r.getDsl_DayNameRange_from().compareTo(r.getDsl_DayNameRange_To());
				if (result >= 0) {
					error("'thru' value must be greater than 'from' value. Also, the span of the 'from' to the 'thru' must not cross the start of a new week.", AtemPackage.Literals.DAY_NAME_RANGE__DSL_DAY_NAME_RANGE_TO);					
				}
			}
		}

	}

