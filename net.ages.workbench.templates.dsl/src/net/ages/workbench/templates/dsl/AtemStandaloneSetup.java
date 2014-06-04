
package net.ages.workbench.templates.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AtemStandaloneSetup extends AtemStandaloneSetupGenerated{

	public static void doSetup() {
		new AtemStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

