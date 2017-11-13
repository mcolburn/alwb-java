package net.ages.workbench.resources.dsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import net.ages.workbench.resources.dsl.services.AresGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class AresSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AresGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Definition_ReverseSolidusKeyword_2_1_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AresGrammarAccess) access;
		match_Definition_ReverseSolidusKeyword_2_1_a = new TokenAlias(true, true, grammarAccess.getDefinitionAccess().getReverseSolidusKeyword_2_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Definition_ReverseSolidusKeyword_2_1_a.equals(syntax))
				emit_Definition_ReverseSolidusKeyword_2_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '\'*
	 */
	protected void emit_Definition_ReverseSolidusKeyword_2_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
