package net.ages.workbench.templates.dsl.rubrics.engine;

import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.GregorianCalendar;

/**
 * @author mac002
 *
 */
public class RunMeToGetModeOfWeek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		showDates("2016","2",1);
		showDates("2016","2",18);
		showDates("2016","2",19);
		showDates("2016","2",20);
		showDates("2016","2",21);
		showDates("2016","2",22);
		showDates("2016","2",23);
		showDates("2016","2",24);
		showDates("2016","2",25);
		showDates("2016","2",26);
		showDates("2016","2",27);
		showDates("2016","2",28);
		showDates("2016","2",29);
		showDates("2016","3",1);
	}

	private static void showDates(String year, String month, int day) {
		LiturgicalDayProperties theDay = new LiturgicalDayProperties(year, month, String.valueOf(day));
		System.out.println(
				theDay.getDisplayDate("EEE, yyyy/MM/dd") 
				+ " - Mode " + theDay.getModeOfWeek());
	}
	
}
