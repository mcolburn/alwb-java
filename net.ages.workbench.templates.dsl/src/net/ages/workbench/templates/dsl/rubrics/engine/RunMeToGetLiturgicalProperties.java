package net.ages.workbench.templates.dsl.rubrics.engine;

/**
 * @author mac002
 *
 */
public class RunMeToGetLiturgicalProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		showDates("2019","1",1);
		showDates("2020","1",1);
		showDates("2021","1",1);
		showDates("2022","1",1);
		showDates("2023","1",1);
		showDates("2024","1",1);
		showDates("2025","1",1);
	}

	private static void showDates(String year, String month, int day) {
		LiturgicalDayProperties theDay = new LiturgicalDayProperties(year, month, String.valueOf(day));
		System.out.println(theDay.toString());
	}
	private static void showSundaysUntilStartOfTriodion(String year, String month, int day) {
// How many Sundays from Jan 14 to start of Triodion
		LiturgicalDayProperties theDay = new LiturgicalDayProperties(year, month, String.valueOf(day));
		System.out.println(
				"Today: " +  theDay.getNameOfDayAbbreviation() + " " +  theDay.getFormattedDate() 
				+ " Triodion: " + theDay.formattedDate(theDay.getTriodionStartDateThisYear())
				+ " Sundays until: "
				+ theDay.getNumberOfSundaysBeforeStartOfTriodion()
				);
		System.out.println("Pascha 2014: " + theDay.formattedDate(theDay.getPaschaDate()));
	}
	
	private static void showSundayAfterElevation(String year, String month, int day) {
		LiturgicalDayProperties theDay = new LiturgicalDayProperties(year, month, Integer.toString(day-1));
		System.out.println(theDay.elevationToString());
		theDay = new LiturgicalDayProperties(year, month, Integer.toString(day));
		System.out.println(theDay.elevationToString());
		theDay = new LiturgicalDayProperties(year, month, Integer.toString(day+1));
		System.out.println(theDay.elevationToString());
	}
	
	
}
