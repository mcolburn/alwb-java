package net.ages.workbench.resources.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.ages.workbench.resources.dsl.ares.AresModel;
import net.ages.workbench.resources.dsl.ares.AresPackage;
import net.ages.workbench.resources.dsl.ares.Definition;
import net.ages.workbench.resources.dsl.services.AresGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class AresSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AresGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AresPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AresPackage.ARES_MODEL:
				if(context == grammarAccess.getAresModelRule()) {
					sequence_AresModel(context, (AresModel) semanticObject); 
					return; 
				}
				else break;
			case AresPackage.DEFINITION:
				if(context == grammarAccess.getDefinitionRule()) {
					sequence_Definition(context, (Definition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=QualifiedName dsl_Model_definitions+=Definition*)
	 */
	protected void sequence_AresModel(EObject context, AresModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName dsl_Definition_Text=STRING? dsl_Definition_Ref=[Definition|QualifiedName]?)
	 */
	protected void sequence_Definition(EObject context, Definition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
