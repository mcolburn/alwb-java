package net.ages.workbench.templates.dsl.ui.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;

import net.ages.workbench.templates.dsl.ui.internal.AtemActivator;


	public class AgesLoggingPreferencePage 
		extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage {

		public AgesLoggingPreferencePage() {
			super(GRID);
			setPreferenceStore(AtemActivator.getInstance().getPreferenceStore());
			setDescription("Preferences for Debugging and Logging.\n\n");
		}
		
		/**
		 * Creates the field editors. Field editors are abstractions of
		 * the common GUI blocks needed to manipulate various types
		 * of preferences. Each field editor knows how to save and
		 * restore itself.
		 */
		public void createFieldEditors() {

			addField(new BooleanFieldEditor(PreferenceConstants.P_BOOLEAN_SHOW_SOURCE,
						"When generating, show source of text.",getFieldEditorParent()));

			addField(new BooleanFieldEditor(PreferenceConstants.P_BOOLEAN_SHOW_DOMAIN,
					"When generating, show only the domain of source text.",getFieldEditorParent()));

			addField(
					new BooleanFieldEditor(
						PreferenceConstants.P_BOOLEAN_DEBUG,
						"When generating, if a lookup fails, show the key that was being used.",
						getFieldEditorParent()));

			addField(new BooleanFieldEditor(PreferenceConstants.P_BOOLEAN_GEN_MESSAGES_HTML,
					"When generating, create a generationMessages.html file.",getFieldEditorParent()));

			addField(new RadioGroupFieldEditor(
					PreferenceConstants.P_CHOICE_LOG4J,
				"Log4j2 levels (listed by least detail to most).  Unless you are researching a problem, it is best to set it to either 'off' or 'fatal'.",
				1,
				new String[][] { 
							{ "Off", "o" }, 
							{ "Fatal", "f" }, 
							{ "Error", "e" }, 
							{ "Warn", "w" }, 
							{ "Info", "i" }, 
							{ "Debug", "d" }, 
							{ "Trace", "t" }, 
				}, getFieldEditorParent()));

			addField(
					new DirectoryFieldEditor(PreferenceConstants.P_STRING_LOG4J_PATH, 
							"Path to log4j Log:", getFieldEditorParent()));

			addField(new FileFieldEditor(PreferenceConstants.P_STRING_LOG4J_FILE, 
					"log4j configuration file:", getFieldEditorParent()));
			
			}

		/* (non-Javadoc)
		 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
		 */
		public void init(IWorkbench workbench) {
		}
	
}
