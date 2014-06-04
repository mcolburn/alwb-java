
package net.ages.workbench.resources.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AresStandaloneSetup extends AresStandaloneSetupGenerated{

	public static void doSetup() {
		new AresStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

