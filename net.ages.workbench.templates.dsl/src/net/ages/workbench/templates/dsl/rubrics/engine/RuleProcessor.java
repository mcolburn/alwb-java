package net.ages.workbench.templates.dsl.rubrics.engine;

/*
	import net.ages.workbench.templates.dsl.atem.Rule;
	import net.ages.workbench.templates.dsl.atem.CaseAllTrue;
	import net.ages.workbench.templates.dsl.atem.CaseAnyTrue;
	import net.ages.workbench.templates.dsl.atem.CaseNoneTrue;
	import net.ages.workbench.templates.dsl.atem.AbstractCases;
	import net.ages.workbench.templates.dsl.atem.Condition;
	import net.ages.workbench.templates.dsl.rubrics.engine.LiturgicalDayProperties;
	import org.eclipse.emf.common.util.EList;
*/
	public class RuleProcessor {
		private LiturgicalDayProperties theDay = null;
//		private Rule theRule = null;
//		private EList<AbstractCases> theCases = null;

//		private EList<Condition> allTrueCases = null;
//		private EList<Condition> anyTrueCases = null;
//		private EList<Condition> noneTrueCases = null;
		private Boolean dayValidForRule = false;
		
		public RuleProcessor (LiturgicalDayProperties day) {
			this.setTheDay(day);
		}

		public void setTheDay(LiturgicalDayProperties theDay) {
			this.theDay = theDay;
		}
		
		/*	
		public boolean conditionsMet(Rule rule) {
			return true;
		}
		
		public LiturgicalDayProperties getTheDay() {
			return theDay;
		}


		public Rule getTheRule() {
			return theRule;
		}

		public void setTheRule(Rule theRule) {
			this.theRule = theRule;
			this.setTheCases(this.theRule.getAnyCases());
		}

		public EList<AbstractCases> getTheCases() {
			return theCases;
		}

		public void setTheCases(EList<AbstractCases> theCases) {
			this.theCases = theCases;
		}

		public EList<Condition> getAllTrueCases() {
			return allTrueCases;
		}

		public boolean allCasesTrue(EList<Condition> allTrueCases) {
			return true;
		}

		public EList<Condition> getAnyTrueCases() {
			return anyTrueCases;
		}

		public boolean anyCaseTrue(EList<Condition> anyTrueCases) {
			return true;
		}

		public void setAnyTrueCases(EList<Condition> anyTrueCases) {
			this.anyTrueCases = anyTrueCases;
		}

		public EList<Condition> getNoneTrueCases() {
			return noneTrueCases;
		}

		public boolean noCaseTrue(EList<Condition> noneTrueCases) {
			return true;
		}
		
		public void setNoneTrueCases(EList<Condition> noneTrueCases) {
			this.noneTrueCases = noneTrueCases;
		}
		
		public Boolean dayValidForRule() {
			return true;
//			return dayValidForRule;
		}

		public void setDayValidForRule(Boolean dayValidForRule) {
			this.dayValidForRule = dayValidForRule;
		}
*/
	}

