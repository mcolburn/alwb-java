package net.ages.workbench.templates.dsl.ui.preferences;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;

import net.ages.workbench.templates.dsl.ui.internal.AtemActivator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		
		String theRootPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toPortableString() + "/";
		String agesWebSiteAssetspath = "ages.initiatives.workbench.website.assets.ages/";

		IPreferenceStore store = AtemActivator.getInstance().getPreferenceStore();
		store.setDefault(PreferenceConstants.P_STRING_PREFERENCES_MAIN,
				"pref.main_ages");
		
		store.setDefault(PreferenceConstants.P_BOOLEAN_DEBUG, false);
		store.setDefault(PreferenceConstants.P_BOOLEAN_GEN_MESSAGES_HTML, false);
		store.setDefault(PreferenceConstants.P_BOOLEAN_SHOW_SOURCE, false);
		store.setDefault(PreferenceConstants.P_BOOLEAN_SHOW_DOMAIN, false);
		store.setDefault(PreferenceConstants.P_STRING_LOG4J_PATH,
				System.getProperty("user.home") + "/logs/");
		
		
	}

}
