package net.ages.workbench.templates.dsl.ui.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;

import net.ages.workbench.templates.dsl.ui.internal.AtemActivator;
import net.ages.workbench.utils.AlwbConstants;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class AgesServiceGenerationPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public AgesServiceGenerationPreferencePage() {
		super(GRID);
		setPreferenceStore(AtemActivator.getInstance().getPreferenceStore());
		setDescription("Preferences for AGES Liturgical Workbench.\n\n");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		
		addField(new FileFieldEditor(PreferenceConstants.P_STRING_PREFERENCES_MAIN, 
				"Main preference .ares file:", getFieldEditorParent()));

		addField(new RadioGroupFieldEditor(
				PreferenceConstants.P_CHOICE_OUTPUT_TYPE,
			"When generator finishes, open this filetype:",
			1,
			new String[][] { 
						{ "none", "0" }, 
						{ "index.html", String.valueOf(AlwbConstants.MAIN_HTML) }, 
						{ "HTML", String.valueOf(AlwbConstants.HTML) },
						{ "PDF", String.valueOf(AlwbConstants.PDF)},
			}, getFieldEditorParent()));
		
		addField(
				new DirectoryFieldEditor(PreferenceConstants.P_STRING_ASSETS_ROOT_FOLDER, 
						"Root folder of Assets Project:", getFieldEditorParent()));
		
		addField(
				new DirectoryFieldEditor(PreferenceConstants.P_STRING_MEDIA_ROOT_FOLDER, 
						"Root folder of Media Project:", getFieldEditorParent()));
		
		addField(
				new DateTimeFieldEditor(PreferenceConstants.P_STRING_SERVICE_DATE, 
						"Date of Service to Generate:", getFieldEditorParent()));
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}