
package net.ages.workbench.resources.dsl.ui.quickfix;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.ui.editor.quickfix.Fix;

import net.ages.workbench.resources.dsl.validation.AresJavaValidator;

public class AresQuickfixProvider extends DefaultQuickfixProvider {

	       @Fix(AresJavaValidator.NAME_MISMATCH)
	       public void fixName(final Issue issue, IssueResolutionAcceptor acceptor) {
	            acceptor.accept(issue, "Rename resource.", "Change resource name to match filename.", null, new IModification() {
	                   public void apply(IModificationContext context) throws BadLocationException {
	                        IXtextDocument xtextDocument = context.getXtextDocument();
	                        xtextDocument.replace(issue.getOffset(), issue.getLength(), issue.getData()[0]);
	                  }
	            });
	      }
}
