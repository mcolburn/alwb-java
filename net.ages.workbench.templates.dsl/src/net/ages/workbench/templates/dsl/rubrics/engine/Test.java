package net.ages.workbench.templates.dsl.rubrics.engine;

import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.GregorianCalendar;

/**
 * @author mac002
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		// Dates for Elevation of Cross and First Sunday after
		// 2007 Sept 14 was on Fri, next Sunday was 16
		// 2008 Sept 14 was on Sun, next Sunday was 21
		// 2009 Sept 14 was on Mon, next Sunday was 20
		// 2010 Sept 14 was on Tue, next Sunday was 19
		// 2011 Sept 14 was on Wed, next Sunday was 18
		// 2012 Sept 14 was on Fri, next Sunday was 16
		// 2013 Sept 14 was on Sat, next Sunday was 15
		// 2014 Sept 14 was on Sun, next Sunday was 21
		// 2015 Sept 14 was on Mon, next Sunday was 20
		// 2016 Sept 14 was on Wed, next Sunday was 18
//		int offset = 364;

//		showSundayAfterElevation("2007","9",16);
//		showSundayAfterElevation("2008","9",21);
//		showSundayAfterElevation("2009","9",20);
//		showSundayAfterElevation("2010","9",19);
//		showSundayAfterElevation("2011","9",18);
//		showSundayAfterElevation("2012","9",16);
//		showSundayAfterElevation("2013","9",22);
//		showSundayAfterElevation("2014","9",21);
//		showSundayAfterElevation("2015","9",20);
//		showSundayAfterElevation("2016","9",18);
		/**
		 * 2007 Triodion starts Jan 28, 1 Sunday between Jan 15 and Triodion start
		 * 2011 Triodion Starts Feb 13, 4 Sundays between Jan 15 and Triodion start 
		 * 2012 Triodion Starts Feb 05, 3 Sundays between Jan 15 and Triodion start
		 * 2013 Triodion Starts Feb 24, 5 Sundays between Jan 15 and Triodion start
		 * 2014 Triodion Starts Feb 09, 3 Sundays between Jan 15 and Triodion start
		 */
		showSundaysUntilStartOfTriodion("2016","6",4);
		showSundaysUntilStartOfTriodion("2016","1",2);
		showSundaysUntilStartOfTriodion("2017","1",2);
		showSundaysUntilStartOfTriodion("2018","1",2);
		showSundaysUntilStartOfTriodion("2019","1",2);
		LiturgicalDayProperties theDay = new LiturgicalDayProperties("2016","06","4");
		String temp = theDay.getDisplayDate("yyyy/mm/dd");
		System.out.println(temp);
		
		// In 2014 the old calendar Pascha was on April 7. For us on April 20.
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
