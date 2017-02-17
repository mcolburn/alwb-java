package net.ages.workbench.resources.dsl.validation;

import net.ages.workbench.resources.dsl.ares.AresModel;
import net.ages.workbench.resources.dsl.ares.AresPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.validation.Check;
 

public class AresJavaValidator extends AbstractAresJavaValidator {

	final public static String NAME_MISMATCH = "Resource name does not match filename. Resource name must be identical in characters and case, except it leaves off the .ares extension.";
	// Verify that the template name matches the filename.
	@Check
	public void verifyResourceAndFilenamesMatch (AresModel aresModel) {
        URI uri = aresModel.eResource().getURI();
        String normalizedFilename = uri.lastSegment().replace("." + uri.fileExtension(), "");
		if (!aresModel.getName().matches(normalizedFilename)) {
			error(NAME_MISMATCH, AresPackage.Literals.ARES_MODEL__NAME,NAME_MISMATCH,normalizedFilename);
		}		
	}

}
