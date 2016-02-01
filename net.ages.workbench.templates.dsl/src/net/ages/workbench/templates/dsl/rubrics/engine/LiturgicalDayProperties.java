/**
 * 
 */
package net.ages.workbench.templates.dsl.rubrics.engine;

/**
 * @author John Holder
 *
 */	

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import net.ages.workbench.templates.dsl.atem.GenDate;


public class LiturgicalDayProperties {

	/*
	 * Triodion: 1st day: Sunday of Publican and Pharisee.  9 weeks before Pascha.
	 * 1st three Sundays precede Great Lent.
	 * Pascha: Day 1 of Pentecostarion.
	 * All-Saints: Last Day of Pentecostarion.
	 * Apostles' Fast: Monday after All Saints, up to and including Jun29, ApostlesPeter&Paul
	 * 
	 * Thomas Sunday: eight-tone cycle begins w/ Tone 1, ends fri. 6th week Lent.
	 * Sunday of All-Saints: Eothinon cycle begins with Eothinon 1  (tones of week pl.4)
	 * Eothinon Cycle runs thru 5th Sunday of Lent (Sunday before Palm Sunday)
	 * 
	 */
		private GregorianCalendar theDay = null;
		private GregorianCalendar theDayBefore = null;
		
		private GregorianCalendar triodionStartDateThisYear = null;
		private GregorianCalendar triodionStartDateLastYear = null;
		private GregorianCalendar triodionStartDateNextYear = null;
		private GregorianCalendar triodionStartDateLast = null;
		private GregorianCalendar greatLentStartDate = null;
		private GregorianCalendar palmSundayDate = null;
		private GregorianCalendar paschaDateLastYear = null;
		private GregorianCalendar paschaDateLast = null;
		private GregorianCalendar paschaDateThisYear = null;
		private GregorianCalendar paschaDateNext = null;
		private GregorianCalendar pentecostDate = null;
		private GregorianCalendar elevationOfCrossDateLast = null;
		private GregorianCalendar sundayAfterElevationOfCrossDateLast = null;
		private GregorianCalendar startDateOfLukanCycleLast = null;
		private GregorianCalendar allSaintsDateThisYear = null;
		private GregorianCalendar allSaintsDateLastYear = null;
		private GregorianCalendar palmSundayNextDate = null; // no getter or setter, local utility only
		private GregorianCalendar thomasSundayDate = null;
		private GregorianCalendar lazarusSaturdayNextDate = null;

		
		// -------------------------
		// The fields in this section need to be exposed to the grammar
		private int modeOfWeek = 0;  // return 0..8
		private int modeOfWeekOverride = 0;
		
		// Valid values for 11 week cycle, only valid on Sundays!!!!
		private int eothinonNumber = 0;  // 0..11

		// valid only when isPentecostarion or isTriodion.
		private int dayOfSeason = 0;  // return 1..70 (0 if no day set) 
		
		// Used to control lectionary and commemorations 
		private int daysUntilStartOfTriodion;
		private int daysSinceStartOfTriodion = 0;
		private int daysSinceSundayAfterLastElevationOfCross = 0;
		private int daysSinceStartLastLukanCycle = 0;
		private int numberOfSundaysBeforeStartOfTriodion = 0;
		
		// movable feast seasons
		private Boolean isPentecostarion = false;
		private Boolean isTriodion = false;
		private Boolean isPascha = false;
		private Boolean isDaysOfLuke = false;

		// days of week conditionals
		private Boolean isSunday = false;
		private Boolean isMonday = false;
		private Boolean isTuesday = false;
		private Boolean isWednesday = false;
		private Boolean isThursday = false;
		private Boolean isFriday = false;                                        
		private Boolean isSaturday = false;
		
		private String dayOfWeek = null; // for debugging output
		private String dayOfWeekOverride = null; // for debugging output
		private String nbrDayOfWeek = ""; 
		private String nbrDayOfWeekOverride = ""; 
		private String nbrDayOfMonth = "";
		private String nbrMonth = "";

		private String [] greekMonths = {
				"Ἰανουαρίου",
				"Φεβρουαρίου",
				"Μαρτίου",
				"Ἀπριλίου",
				"Μαΐου",
				"Ἰουνίου",
				"Ἰουλίου",
				"Αὐγούστου",
				"Σεπτεμβρίου",
				"Ὀκτωβρίου",
				"Νοεμβρίου",
				"Δεκεμβρίου"
		};

		private String [] greekWeekDays = {
			"τοῦ Σαββάτου",
			"τῆς Κυριακῆς",
			"τῆς Δευτέρας",
			"τῆς Τρίτης",
			"τῆς Τετάρτης",
			"τῆς Πέμπτης",
			"τῆς Παρασκευῆς"
		};

		private String [] greekMonthDays = {
				"αʹ",   
				"βʹ",
				"γʹ",
				"δʹ",
				"εʹ",
				"Ϛʹ",
				"ζʹ",
				"ηʹ",
				"θʹ",
				"ιʹ",
				"ιαʹ",
				"ιβʹ",
				"ιγʹ",
				"ιδʹ",
				"ιεʹ",
				"ιϚʹ",
				"ιζʹ",
				"ιηʹ",
				"ιθʹ",
				"κʹ",
				"καʹ",
				"κβʹ",
				"κγʹ",
				"κδʹ",
				"κεʹ",
				"κϚʹ",
				"κζʹ",
				"κηʹ",
				"κθʹ",
				"λʹ",
				"λαʹ"		
			};

		private String wordBoundary = "\\b";
		private Map<String,String> greekMap = new HashMap<String,String>() {{
			put("Ιανουάριος","Ἰανουαρίου");
			put("Φεβρουάριος","Φεβρουαρίου");
			put("Μάρτιος","Μαρτίου");
			put("Απρίλιος","Ἀπριλίου");
			put("Μάϊος","Μαΐου");
			put("Ιούνιος","Ἰουνίου");
			put("Ιούλιος","Ἰουλίου");
			put("Αύγουστος","Αὐγούστου");
			put("Σεπτέμβριος","Σεπτεμβρίου");
			put("Οκτώβριος","Ὀκτωβρίου");
			put("Νοέμβριος","Νοεμβρίου");
			put("Δεκέμβριος","Δεκεμβρίου");
			put("Σάββατο","τοῦ Σαββάτου");
			put("Κυριακή","τῆς Κυριακῆς");
			put("Δευτέρα","τῆς Δευτέρας");
			put("Τρίτη","τῆς Τρίτης");
			put("Τετάρτη","τῆς Τετάρτης");
			put("Πέμπτη","τῆς Πέμπτης");
			put("Παρασκευή","τῆς Παρασκευῆς");
			put("1","αʹ");   
			put("2","βʹ");
			put("3","γʹ");
			put("4","δʹ");
			put("5","εʹ");
			put("6","Ϛʹ");
			put("7","ζʹv");
			put("8","ηʹ");
			put("9","θʹ");
			put("10","ιʹ");
			put("11","ιαʹ");
			put("12","ιβʹ");
			put("13","ιγʹ");
			put("14","ιδʹ");
			put("15","ιεʹ");
			put("16","ιϚʹ");
			put("17","ιζʹ");
			put("18","ιηʹ");
			put("19","ιθʹ");
			put("20","κʹ");
			put("21","καʹ");
			put("22","κβʹ");
			put("23","κγʹ");
			put("24","κδʹ");
			put("25","κεʹ");
			put("26","κϚʹ");
			put("27","κζʹ");
			put("28","κηʹ");
			put("29","κθʹ");
			put("30","λʹ");
			put("31","λαʹ");		
		}};
		
		// -------------------------
		// Class constructors 
		public LiturgicalDayProperties() {
			Date theDate = new Date();
			theDay = new GregorianCalendar();
			setLiturgicalPropertiesByDate(theDay.get(GregorianCalendar.YEAR));
			setYesterday(theDay.getTimeInMillis());
		}
		
		public LiturgicalDayProperties(String month, String day) {
			GregorianCalendar todayDay = new GregorianCalendar();
			int theMonth = (Integer.parseInt(month))-1;
			int theMonthDay = Integer.parseInt(day);
			theDay = new GregorianCalendar(todayDay.get(GregorianCalendar.YEAR),theMonth,theMonthDay);
			// if the date is before today, do it for next year by default.
			if( theDay.before(todayDay) ) {
				theDay.set(theDay.get(GregorianCalendar.YEAR)+1,theMonth,theMonthDay);
			}
			setLiturgicalPropertiesByDate(theDay.get(GregorianCalendar.YEAR));
			setYesterday(theDay.getTimeInMillis());
		}
		
		// this version sets the calendar to the specified year, month, and day
		public LiturgicalDayProperties(String year, String month, String day) {
			int theYear = Integer.parseInt(year);
			int theMonth = (Integer.parseInt(month))-1;
			int theMonthDay = Integer.parseInt(day);
			theDay = new GregorianCalendar(theYear,theMonth,theMonthDay);
			setLiturgicalPropertiesByDate(theYear);
			setYesterday(theDay.getTimeInMillis());
		}
		
		public void setDateTo(String year, String month, String day) {
			int theYear = Integer.parseInt(year);
			int theMonth = (Integer.parseInt(month))-1;
			int theMonthDay = Integer.parseInt(day);
			theDay = new GregorianCalendar(theYear,theMonth,theMonthDay);
			setLiturgicalPropertiesByDate(theYear);
			setYesterday(theDay.getTimeInMillis());
		}
		
		public LiturgicalDayProperties(long value) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTimeInMillis(value);
			theDay = new GregorianCalendar(
					calendar.get(Calendar.YEAR),
					calendar.get(Calendar.MONTH),
					calendar.get(Calendar.DAY_OF_MONTH));
			setLiturgicalPropertiesByDate(calendar.get(Calendar.YEAR));
			setYesterday(value);
		}
		
		private void setYesterday(long value) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTimeInMillis(value);
			calendar.add(Calendar.DAY_OF_MONTH, -1); // subtract a day
			setTheDayBefore(new GregorianCalendar(
					calendar.get(Calendar.YEAR),
					calendar.get(Calendar.MONTH),
					calendar.get(Calendar.DAY_OF_MONTH)));
		}
		/* -----------------------------------
		 * Date Calculation Algorithms follow.
		 */
		
		public GregorianCalendar timedelta(GregorianCalendar dateFrom, int days) {
			return new GregorianCalendar(
					dateFrom.get(GregorianCalendar.YEAR),
					dateFrom.get(GregorianCalendar.MONTH),
					dateFrom.get(GregorianCalendar.DATE)+days,
					dateFrom.get(GregorianCalendar.HOUR),
					dateFrom.get(GregorianCalendar.MINUTE) );
		}
		
		public void setLiturgicalPropertiesByDate(int year)
		{	
			setVariablesToDefaults();
			boolean useGregorianCalendar = true; // vs Orthodox Old Calendar
			paschaDateLastYear = computeDayOfPascha(theDay.get(GregorianCalendar.YEAR)-1, useGregorianCalendar);
			paschaDateThisYear = computeDayOfPascha(year, useGregorianCalendar);
			paschaDateLast = lastPaschaDate();
			paschaDateNext = nextPaschaDate();
			// 10 weeks before Pascha (inclusive), Starts with the Sunday of Publican and Pharisee
			setTriodionStartDateThisYear( timedelta(paschaDateThisYear, -(10*7) ) ); 
			setTriodionStartDateLastYear( timedelta(paschaDateLastYear, -(10*7) ) ); 
			setTriodionStartDateNextYear( timedelta(paschaDateNext, -(10*7) ) ); 
			setDateLastTriodionStart();
			
			setPalmSundayDate( timedelta(paschaDateThisYear, -7 ) );
			setPentecostDate ( timedelta(paschaDateThisYear, 49 ) );
			setAllSaintsDate ( timedelta(paschaDateThisYear, 56 ) ); 			
			setAllSaintsDateLastYear ( timedelta(paschaDateLastYear, 56 ) ); 				
			// Pentecost starts  with Pascha and ends with All Saints, which is the day before the beginning
			// of the Apostle's Fast.
			if( theDay.equals(paschaDateThisYear) ||
				theDay.equals(allSaintsDateThisYear) ||
				(theDay.after(paschaDateThisYear) && theDay.before(allSaintsDateThisYear))) {
				setIsPentecostarion(true);
			} else {
				setIsPentecostarion(false);
			}
			
			if( theDay.equals(triodionStartDateThisYear) ||
				(theDay.after(triodionStartDateThisYear) && theDay.before(paschaDateThisYear)) ) {
					isTriodion = true;
			}
			
			// Clean Monday, 7 weeks + a day before Pascha
			setGreatLentStartDate( timedelta(paschaDateThisYear, -(7*7)+1 ) ); 
			palmSundayNextDate = ( timedelta(paschaDateNext, -7 ) );
			thomasSundayDate = ( timedelta(paschaDateLast, 7 ) );
			lazarusSaturdayNextDate = ( timedelta(paschaDateNext, -8 ) );

			setDayOfSeason();	
			setDaysSinceStartOfLastTriodion();
			setDayOfWeek();
			setEothinonNumber();
			setModeOfWeek();
			setNbrDayOfMonth(theDay.get(GregorianCalendar.DAY_OF_MONTH));
			setNbrMonth(theDay.get(GregorianCalendar.MONTH)+1);
			
			setDateFirstSundayAfterElevationOfCross();
			setDaysSinceSundayAfterLastElevationOfCross();
			setDateStartLukanCycle();
			setDaysSinceStartLukanCycleLast();
			setElevationOfCross(new GregorianCalendar(
					sundayAfterElevationOfCrossDateLast.get(Calendar.YEAR),
					sundayAfterElevationOfCrossDateLast.get(Calendar.MONTH), 14));
			setNumberOfSundaysBeforeStartOfTriodionOnJan15();
		}
		

		/**
		 * The Typikon has conditions that depend on the number of Sundays from Jan 15 to the start of the Triodion.
		 * This is specifically for the lectionary.
		 */
		private void setNumberOfSundaysBeforeStartOfTriodionOnJan15() {
			/**
			 * 2007 Triodion Starts Jan 28, 1 Sundays between Jan 15 and Triodion start 
			 * 2011 Triodion Starts Feb 13, 4 Sundays between Jan 15 and Triodion start 
			 * 2012 Triodion Starts Feb 05, 3 Sundays between Jan 15 and Triodion start
			 * 2013 Triodion Starts Feb 24, 5 Sundays between Jan 15 and Triodion start
			 * 2014 Triodion Starts Feb 09, 3 Sundays between Jan 15 and Triodion start
			 */
			GregorianCalendar jan15 = new GregorianCalendar(triodionStartDateThisYear.get(Calendar.YEAR),0,15);
			Long diffMillis = diffMillis(this.triodionStartDateThisYear, jan15);
			// Get difference in days, add 1 to be 1-index based instead of zero.
			daysUntilStartOfTriodion = (int) ( diffMillis / (24*60*60*1000) );
			numberOfSundaysBeforeStartOfTriodion = daysUntilStartOfTriodion / 7;
		}
		
		private void setNumberOfSundaysBeforeStartOfTriodion() {
			Long diffMillis = diffMillis(this.triodionStartDateThisYear, theDay);
			daysUntilStartOfTriodion = (int) ( diffMillis / (24*60*60*1000) );
			if (daysUntilStartOfTriodion < 0) {
				daysUntilStartOfTriodion = 0;
				numberOfSundaysBeforeStartOfTriodion = 0;
			} else {
				numberOfSundaysBeforeStartOfTriodion = daysUntilStartOfTriodion / 7;
			}
		}
		
		public int getNumberOfSundaysBeforeStartOfTriodion() {
			return numberOfSundaysBeforeStartOfTriodion;
		}

		/**
		 * @return the GregorianCalendar for the Elevation of the Cross prior to 
		 * the date set for this instance of the LiturgicalDayProperties
		 * 
		 */
		public GregorianCalendar getCalendarForElevationOfCross() {
			return elevationOfCrossDateLast;
		}
		
		/**
		 * @return the GregorianCalendar for the Elevation of the Cross prior to 
		 * the date set for this instance of the LiturgicalDayProperties
		 * 
		 */
		public GregorianCalendar getCalendarForSundayAfterElevationOfCross() {
			return sundayAfterElevationOfCrossDateLast;
		}
		
		public String getFormattedSundayAfterElevationOfCross() {
			return formattedDate(sundayAfterElevationOfCrossDateLast);
		}
		
		public int getMonthOfSundayAfterElevationOfCross() {
			int result = sundayAfterElevationOfCrossDateLast.get(Calendar.MONTH);
			return result;
		}
		
		public int getDayOfSundayAfterElevationOfCross() {
			int result = sundayAfterElevationOfCrossDateLast.get(Calendar.DATE);
			return result;
		}

		public String startOfLukanCycle() {
			return formattedDate(startDateOfLukanCycleLast);
		}

		public void setDateLastTriodionStart() {
			if (theDay.before(this.triodionStartDateThisYear)) {
				triodionStartDateLast = triodionStartDateLastYear;
			} else {
				triodionStartDateLast =  triodionStartDateThisYear;
			}
		}

		public void setDateFirstSundayAfterElevationOfCross() {
			GregorianCalendar firstSundayAfterElevationThisYear = computeSundayAfterElevationOfCross(new GregorianCalendar(theDay.get(Calendar.YEAR), 8, 14));
			GregorianCalendar firstSundayAfterElevationLastYear = computeSundayAfterElevationOfCross(new GregorianCalendar(theDay.get(Calendar.YEAR)-1, 8, 14));
			if (theDay.before(firstSundayAfterElevationThisYear)) {
				sundayAfterElevationOfCrossDateLast = firstSundayAfterElevationLastYear;
			} else {
				sundayAfterElevationOfCrossDateLast =  firstSundayAfterElevationThisYear;
			}
		}
		
		public void setElevationOfCross(GregorianCalendar date) {
			elevationOfCrossDateLast = date;
		}
		
		public void setDateStartLukanCycle() {
			GregorianCalendar firstSundayAfterElevationThisYear = computeSundayAfterElevationOfCross(new GregorianCalendar(theDay.get(Calendar.YEAR), 8, 14));
			GregorianCalendar firstSundayAfterElevationLastYear = computeSundayAfterElevationOfCross(new GregorianCalendar(theDay.get(Calendar.YEAR)-1, 8, 14));
			GregorianCalendar startLukanCycleThisYear = 
					new GregorianCalendar(
							firstSundayAfterElevationThisYear.get(Calendar.YEAR), 
							firstSundayAfterElevationThisYear.get(Calendar.MONTH), 
							firstSundayAfterElevationThisYear.get(Calendar.DATE)+1);
			GregorianCalendar startLukanCycleLastYear = 
					new GregorianCalendar(
							firstSundayAfterElevationLastYear.get(Calendar.YEAR), 
							firstSundayAfterElevationLastYear.get(Calendar.MONTH), 
							firstSundayAfterElevationLastYear.get(Calendar.DATE)+1);
			if (theDay.before(startLukanCycleThisYear)) {
				this.startDateOfLukanCycleLast = startLukanCycleLastYear;
			} else {
				this.startDateOfLukanCycleLast =  startLukanCycleThisYear;
			}
		}

		public GregorianCalendar computeDayOfPascha(int year, Boolean isUserCalendarGregorian) {
			// pass in the year and receive the month and day of easter. 
			int month, day;
			int r19, r7, r4, n1, n2, n3, cent;
			r19 = year%19;
			r7 = year%7;
			r4 = year%4; 
			/* This is a formula by Gauss for the number of days after 21-Mar. */
			n1 = (19*r19 + 16) % 30;
			n2 = (2*r4+4*r7+6*n1) % 7;
			n3 = n1+n2; 
			if( isUserCalendarGregorian )
			{
			   // Then adjust day onto the Gregorian Calendar (only valid from 1583 onwards) 
			   cent = year/100;
			   n3 += cent-cent/4-2;
			}
			if(n3>40) {
				month = 4;
				day = n3-40;
			}
			else if(n3>10) {
				month = 3;
				day = n3-10;
			}
			else {
				month = 2;
				day = n3+21;
			}
			// month is zero-indexed (0=Jan) up to this point to support this API.
			return new GregorianCalendar(year, month, day);
		}		

		// ------------------------------------------------
		// eothinon, mode, day of period.
	
		public int getModeOfWeek() {
			if (modeOfWeekOverride > 0) {
				return modeOfWeekOverride;
			} else {
				return modeOfWeek;
			}
		}

		public void setModeOfTheWeek(int modeOfWeek) {
			this.modeOfWeek = modeOfWeek;
		}
		
		/**
		 * Sometimes it is necessary to temporarily override the mode of the week
		 * It is important to clear the override after using it
		 * @return the mode that overrides the mode of the week
		 */
		public int getModeOfWeekOverride() {
			return modeOfWeekOverride;
		}

		/**
		 * Sometimes it is necessary to temporarily override the mode of the week
		 * It is important to clear the override after using it
		 */
		public void setModeOfTheWeekOverride(String mode) {
			try {
				this.modeOfWeekOverride = Integer.parseInt(String.valueOf(mode.charAt(1)));
			} catch (Exception e) {
				this.modeOfWeekOverride = 0;
			}
		}
		
		public Long diffMillis(GregorianCalendar d1, GregorianCalendar d2) {
			/* when we calculate the difference between the two days, if one is
			* in daylight savings and the other is not, it results in an error
			* when the result is used to calculate the day of a period.  Therefore,
			* we will subtract the daylight savings time offset from d1 and d2.
			* If they are both in daylight savings, the subtraction will yield a
			* mismatch of zero, and if not in daylight savings, will give us the
			* correct offset to use for calculating the the difference between the 
			* two dates in milliseconds.
			*/
			int misMatchMillis = d1.get(Calendar.DST_OFFSET) - d2.get(Calendar.DST_OFFSET);
			return d1.getTimeInMillis()-d2.getTimeInMillis()+misMatchMillis;
		}
		
		private void setModeOfWeek() {
			// Thomas Sunday: eight-tone cycle begins w/ Tone 1, ends Fri. 6th week Lent (day before Lazarus Sat.)			
			Long diffMillis = diffMillis(theDay,thomasSundayDate);
			// Get difference in weeks, then mod 8 to get cycle number, and add 1 to use 1-based indexes.
			modeOfWeek = (int) (( diffMillis / (7*24*60*60*1000) ) % 8 + 1);
			if (isPentecostarion) {
				// override for Pascha through the Saturday before the Sunday of Thomas
				switch (dayOfSeason) {
					case 1: { modeOfWeek = 1; break;}
					case 2: {  modeOfWeek = 2; break;}
					case 3: {  modeOfWeek = 3; break;}
					case 4: {  modeOfWeek = 4; break;}
					case 5: {  modeOfWeek = 5; break;}
					case 6: {  modeOfWeek = 6; break;}
					case 7: {  modeOfWeek = 8;} // note that it skips 7
				}
			}
		}
		
		public Boolean isPascha() {
			return theDay.equals(paschaDateThisYear);
		}

		public int getEothinonNumber() {
			return eothinonNumber;
		}

		public void setEothinonNumber(int eothinonNumber) {
			this.eothinonNumber = eothinonNumber;
		}
		
		private void setEothinonNumber() {	
			if (isSunday) {
				Long diffMillis;
				if (theDay.before(allSaintsDateThisYear)) {
					diffMillis = diffMillis(theDay,allSaintsDateLastYear);
				} else {
					diffMillis = diffMillis(theDay,allSaintsDateThisYear);
				}
				eothinonNumber = (int) ( diffMillis / (7*24*60*60*1000) ) % 11 + 1;
			} else {
				eothinonNumber = 0;
			}
		}		

		public int getDayOfSeason() {
			return dayOfSeason;
		}

		private void setDayOfSeason(int dayOfSeason) {
			this.dayOfSeason = dayOfSeason;
		}
		
		private void setDayOfSeason() {
			// 2-24-15 Mac changed if (isTriodion && isPentecostarion) to ||
			if(isTriodion || isPentecostarion) {
				// Get difference in milliseconds
				Long diffMillis = diffMillis(theDay,triodionStartDateThisYear);
				// Get difference in days, add 1 to be 1-index based instead of zero.
				dayOfSeason = (int) ( diffMillis / (24*60*60*1000) ) + 1; 
			}
			else { // movable cycle starts with day 1 of Triodion and continues through the year
				dayOfSeason = 0;
			}
		}	
		
		/**
		 * When the template user sets the movable cycle day using
		 * Set_mcDay, this method will be called.
		 * @param d
		 */
	    public void overrideMovableCycleDay(int d) {
	    		if (d == 0) {
	    			// zero means reset back to date based calculation
	    			setDayOfSeason();
	    			setDaysSinceStartOfLastTriodion();
	    		} else {
	    			// override to the specified day
		    		setDayOfSeason(d);
		    		setDaysSinceStartOfLastTriodion(d);
	    		}
	    }
	    
	    private void setDaysSinceStartOfLastTriodion(int d) {
	    		daysSinceStartOfTriodion = d;
	    }

		private void setDaysSinceStartOfLastTriodion() {
				Long diffMillis = diffMillis(theDay,this.triodionStartDateLast);
				// Get difference in days, add 1 to be 1-index based instead of zero.
				daysSinceStartOfTriodion = (int) ( diffMillis / (24*60*60*1000) ) + 1; 
		}		
		
		private void setDaysSinceSundayAfterLastElevationOfCross() {
			Long diffMillis = diffMillis(theDay,sundayAfterElevationOfCrossDateLast);
			// Get difference in days, add 1 to be 1-index based instead of zero.
			daysSinceSundayAfterLastElevationOfCross = (int) ( diffMillis / (24*60*60*1000) ); 
		}		

		private void setDaysSinceStartLukanCycleLast() {
			Long diffMillis = diffMillis(theDay,startDateOfLukanCycleLast);
			// Get difference in days, add 1 to be 1-index based instead of zero.
			daysSinceStartLastLukanCycle = ((int) ( diffMillis / (24*60*60*1000) ))+1; 
		}		

		public int getDaysSinceSundayAfterLastElevationOfCross() {
			return daysSinceSundayAfterLastElevationOfCross;
		}
		
		public int getDaysSinceStartLukanCycleLast() {
			return daysSinceStartLastLukanCycle;
		}

		public String getWeekAndDayOfLukanCycle() {
			int week = getWeekOfLukanCycle();
			return getNameOfDay() + " of the " + week + getNumberDegree(week) + " Week of Luke";
		}
		
		public String getNumberDegree(int i) {
			
			String nbr = String.valueOf(i);
			String result = "";

			if (nbr.endsWith("1")) {
				result = "st";
			} else if (nbr.endsWith("2")) {
				result = "nd";
			} else if (nbr.endsWith("3")) {
				result = "rd";
			} else {
				result = "th";
			}
			return result;
		}
		
		/** 
		 * 
		 * @return the number of weeks elapsed in the Lukan cycle.
		 * If there is an error, it will return -1
		 */
		public int getWeekOfLukanCycle() {
			try {
				if (daysSinceStartLastLukanCycle < 8) {
					return 1;
				} else {
					return (daysSinceStartLastLukanCycle / 7) + 1;
				}
			} catch (Exception e) {
				return -1;
			}
		}
		
		public int getDaysSinceStartOfTriodion() {
			return daysSinceStartOfTriodion;
		}
		
		public int triodionDayToMovableDay() {
			if (daysSinceStartOfTriodion < 71) {
				return daysSinceStartOfTriodion;
			} else {
				return -1;
			}
		}

		public int pentecostarionDayToMovableDay() {
			if (daysSinceStartOfTriodion > 69 && daysSinceStartOfTriodion < 128) {
				return daysSinceStartOfTriodion - 70;
			} else {
				return -1;
			}
		}

		public String getNameOfPeriod() {
			String name = null;
			if (isPentecostarion) {
				name = "Pentecost";
			} else if (isTriodion) {
				name = "Triodion";
			} else {
				name = "";
			}
			return name;
		}
		
		public String getNameOfDayAbbreviation() {
			return theDay.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.getDefault());
		}

		public String getNameOfDay() {
			return theDay.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
		}
		
		public String getNameOfMonth() {
			return theDay.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
		}

		private void setDayOfWeek() {
			int dow = theDay.get(GregorianCalendar.DAY_OF_WEEK);
			switch( dow ) {
				case GregorianCalendar.SUNDAY: 	 setIsSunday(true);	   dayOfWeek = "Sun";    setNbrDayOfWeek(1); break;
				case GregorianCalendar.MONDAY:    setIsMonday(true);	   dayOfWeek = "Mon";	 setNbrDayOfWeek(2); break;
				case GregorianCalendar.TUESDAY:   setIsTuesday(true);   dayOfWeek = "Tue";	 setNbrDayOfWeek(3); break;
				case GregorianCalendar.WEDNESDAY: setIsWednesday(true); dayOfWeek = "Wed";	 setNbrDayOfWeek(4); break;
				case GregorianCalendar.THURSDAY:  setIsThursday(true);  dayOfWeek = "Thu";	 setNbrDayOfWeek(5); break;
				case GregorianCalendar.FRIDAY:    setIsFriday(true);	   dayOfWeek = "Fri";	 setNbrDayOfWeek(6); break;
				case GregorianCalendar.SATURDAY:  setIsSaturday(true);  dayOfWeek = "Sat";	 setNbrDayOfWeek(7); break;
				default: dayOfWeek = null; break;
			}
		}
		
		private GregorianCalendar computeSundayAfterElevationOfCross(GregorianCalendar elevationOfCross) {
			int dow = elevationOfCross.get(GregorianCalendar.DAY_OF_WEEK);
			int dayOffset = 0;
			switch( dow ) {
				case GregorianCalendar.SUNDAY:    dayOffset = 7; break;
				case GregorianCalendar.MONDAY:    dayOffset = 6; break;
				case GregorianCalendar.TUESDAY:   dayOffset = 5; break;
				case GregorianCalendar.WEDNESDAY: dayOffset = 4; break;
				case GregorianCalendar.THURSDAY:  dayOffset = 3; break;
				case GregorianCalendar.FRIDAY:    dayOffset = 2; break;
				case GregorianCalendar.SATURDAY:  dayOffset = 1; break;
			}
			return new GregorianCalendar(elevationOfCross.get(Calendar.YEAR),8, 14+dayOffset);
		}

		public String getNbrMonth() {
			return nbrMonth;
		}

		/*
		 * returns integer value of month, with Jan = 1
		 */
		public int getIntMonth() {
			return Integer.parseInt(nbrMonth);
		}

		public void setNbrMonth(int month) {
			this.nbrMonth = formattedNumber(month,12);
		}

		public String getNbrDayOfMonth() {
			return nbrDayOfMonth;
		}
		
		public int getIntDayOfMonth(){
			return Integer.parseInt(nbrDayOfMonth);
		}

		public void setNbrDayOfMonth(int dayOfMonth) {
			this.nbrDayOfMonth = formattedNumber(dayOfMonth,31);
		}

		public String getNbrDayOfWeek() {
			if (nbrDayOfWeekOverride.equals("")) {
				return nbrDayOfWeek;
			} else {
				return nbrDayOfWeekOverride;
			}
		}
		
		/** 
		 * Get an interger representation of what we in Lent this date
		 * occurs in.
		 * @return
		 */
		public int getIntWeekOfLent() {
			int result = 0;
			int daysSinceStart = getDaysSinceStartOfTriodion();
			if (daysSinceStart >= 23 && daysSinceStart <= 29) {
				result = 1;
			} else if (daysSinceStart >= 30 && daysSinceStart <= 36) {
				result = 2;
			} else if (daysSinceStart >= 37 && daysSinceStart <= 43) {
				result = 3;
			} else if (daysSinceStart >= 44 && daysSinceStart <= 50) {
				result = 4;
			} else if (daysSinceStart >= 51 && daysSinceStart <= 57) {
				result = 5;
			} else if (daysSinceStart >= 58 && daysSinceStart <= 64) {
				result = 6;
			} else if (daysSinceStart >= 65 && daysSinceStart <= 70) {
				result = 7;
			} else {
				return 0;
			}
			return result;
		}
		
		public int getIntDayOfWeek() {
			return Integer.parseInt(getNbrDayOfWeek());
		}
		
		public void setNbrDayOfWeek(int intDayOfWeek) {
			this.nbrDayOfWeek = formattedNumber(intDayOfWeek,7);
		}
		
		public String getNbrDayOfWeekOverride() {
			return nbrDayOfWeekOverride;
		}

		public void setNbrDayOfWeekOverride(String day) {
			try {
				if (day.equals("")) {
					this.nbrDayOfWeekOverride = "";
				} else {
					this.nbrDayOfWeekOverride = String.valueOf(day.charAt(1));
				}
			} catch (Exception e) {
				this.nbrDayOfWeekOverride = "";
			}
		}
		
		public int getYear() {
			return theDay.get(GregorianCalendar.YEAR);
		}

		public String getDisplayDate(String format) {
		    	try {
		    		SimpleDateFormat simpleDateFormat =
		    		        new SimpleDateFormat(format);
		    		return simpleDateFormat.format(theDay.getTime());
		    	} catch (Exception e) {
					e.printStackTrace();
					return "Invalid format";
			}    
		}
		
		public String getTheDayBeforeAsPath() {
			SimpleDateFormat simpleDateFormat =
    		        new SimpleDateFormat("yyyy/MM/dd");
    			return simpleDateFormat.format(theDayBefore.getTime());
		}
		public String getTheDayAsPath() {
			SimpleDateFormat simpleDateFormat =
    		        new SimpleDateFormat("yyyy/MM/dd");
    			return simpleDateFormat.format(theDay.getTime());
		}

		/**
		 * Provides a locale based means to display a date
		 * @param language - the Java locale language code
		 * @param country - the Java locale country code
		 * @param format - the format to use to display the date
		 * @return
		 */
		public String getDisplayDateForLocale(String language, String country, String format) {
			String result = "";
			try {
		    		Locale locale = new Locale(language,country);
		    		SimpleDateFormat simpleDateFormat =
		    		        new SimpleDateFormat(format, locale);
		    		result = simpleDateFormat.format(theDay.getTime());
		    	} catch (Exception e) {
					e.printStackTrace();
					result = "Invalid format";
			}    
			if (language.startsWith("el") && country.toLowerCase().startsWith("gr")) {
			//	result = toEcclesiasticalGreekDate();
			}
			return result;
		}

		// ------------------------------------------------
		// get and set dates
		public GregorianCalendar getTheDay() {
			return theDay;
		}

		public void setTheDay(GregorianCalendar theDay) {
			this.theDay = theDay;
		}
		
		public GregorianCalendar getTheDayBefore() {
			return theDayBefore;
		}

		public void setTheDayBefore(GregorianCalendar theDay) {
			theDayBefore = theDay;
		}

		public GregorianCalendar getPaschaDate() {
			return paschaDateThisYear;
		}

		public GregorianCalendar getNextPaschaDate() {
			return paschaDateNext;
		}

		public void setPaschaDate(GregorianCalendar paschaDate) {
			this.paschaDateThisYear = paschaDate;
		}		
		
		public GregorianCalendar getPentecostDate() {
			return pentecostDate;
		}		

		public void setPentecostDate(GregorianCalendar pentecostDate) {
			this.pentecostDate = pentecostDate;
		}

		public GregorianCalendar getPalmSundayDate() {
			return palmSundayDate;
		}

		public void setPalmSundayDate(GregorianCalendar palmSundayDate) {
			this.palmSundayDate = palmSundayDate;
		}

		public GregorianCalendar getAllSaintsDate() {
			return allSaintsDateThisYear;
		}

		public void setAllSaintsDate(GregorianCalendar allSaintsDate) {
			this.allSaintsDateThisYear = allSaintsDate;
		}
		
		public void setAllSaintsDateLastYear(GregorianCalendar allSaintsDate) {
			this.allSaintsDateLastYear = allSaintsDate;
		}
		public GregorianCalendar getGreatLentStartDate() {
			return greatLentStartDate;
		}

		public void setGreatLentStartDate(GregorianCalendar greatLentStartDate) {
			this.greatLentStartDate = greatLentStartDate;
		}

		public GregorianCalendar getTriodionStartDateThisYear() {
			return triodionStartDateThisYear;
		}

		public void setTriodionStartDateThisYear(GregorianCalendar triodionStartDate) {
			this.triodionStartDateThisYear = triodionStartDate;
		}

		public GregorianCalendar getTriodionStartDateNextYear() {
			return triodionStartDateNextYear;
		}

		public void setTriodionStartDateNextYear(GregorianCalendar triodionStartDate) {
			this.triodionStartDateNextYear = triodionStartDate;
		}

		public GregorianCalendar getTriodionStartDateLastYear() {
			return triodionStartDateLastYear;
		}

		public void setTriodionStartDateLastYear(GregorianCalendar triodionStartDate) {
			this.triodionStartDateLastYear = triodionStartDate;
		}

		// ------------------------------------------------
		// Boolean getters and setters

		public Boolean isPentecostarion() {
			return isPentecostarion;
		}

		public void setIsPentecostarion(Boolean isPentecostarion) {
			this.isPentecostarion = isPentecostarion;
		}
		
		public Boolean isTriodion() {
			return isTriodion;
		}

		public void setIsTriodion(Boolean isTriodion) {
			this.isTriodion = isTriodion;
		}			
		
		// getters setters for days of week
		public Boolean isSunday() {
			return isSunday;
		}

		public void setIsSunday(Boolean isSunday) {
			this.isSunday = isSunday;
		}
		

		public Boolean isMonday() {
			return isMonday;
		}

		public void setIsMonday(Boolean isMonday) {
			this.isMonday = isMonday;
		}

		public Boolean isTuesday() {
			return isTuesday;
		}

		public void setIsTuesday(Boolean isTuesday) {
			this.isTuesday = isTuesday;
		}

		public Boolean isWednesday() {
			return isWednesday;
		}

		public void setIsWednesday(Boolean isWednesday) {
			this.isWednesday = isWednesday;
		}

		public Boolean isThursday() {
			return isThursday;
		}

		public void setIsThursday(Boolean isThursday) {
			this.isThursday = isThursday;
		}

		public Boolean isFriday() {
			return isFriday;
		}

		public void setIsFriday(Boolean isFriday) {
			this.isFriday = isFriday;
		}

		public Boolean isSaturday() {
			return isSaturday;
		}

		public void setIsSaturday(Boolean isSaturday) {
			this.isSaturday = isSaturday;
		}
		
		// ------------------------------------------------
		// toHTML stuff for debugging.
		
		public String toHtml() {
			StringBuilder htmlString = new StringBuilder();

			htmlString.append("<div><hr><br><b>Liturgical Properties of the Day</b></div>" +
					divWrap(dayOfWeek, formattedDate(theDay)) +
					((modeOfWeek!=0)?divWrap("Mode of the week:", Integer.toString(modeOfWeek) ) : "") +
					((eothinonNumber!=0)?divWrap("Eothinon:", Integer.toString(eothinonNumber) ) : "") +
					divWrap("Triodion Starts:", formattedDate(triodionStartDateThisYear)) +
					divWrap("Pascha:", formattedDate(paschaDateThisYear) ) +
					divWrap("All-Saints:", formattedDate(allSaintsDateThisYear))) ;
					;
			if( isTriodion || isPentecostarion ) {
				String seasonInfo = (isTriodion) ? "Triodion day " : "Pentecostarion day ";
				htmlString.append(divWrap(seasonInfo, Integer.toString(dayOfSeason)));
			}
			htmlString.append("<div><br></div>" + 
					divWrap("is Triodion?",isTriodion()) +
					divWrap("is Pentecostarion?",isPentecostarion()) + "<div><br></div>" +
					divWrap("isSunday? ", isSunday() ) +
					divWrap("IsMonday? ", isMonday() ) +
					divWrap("isTuesday? ", isTuesday() ) +
					divWrap("isWednesday? ", isWednesday() ) +
					divWrap("isThursday? ", isThursday() ) +
					divWrap("isFriday? ", isFriday() ) +
					divWrap("isSaturday? ", isSaturday() ));
			return htmlString.toString();
		}
		
		public String allDatesToString() {
			StringBuilder sb = new StringBuilder();
			sb.append("\ntheDay:\t\t\t" + theDay.getTime().toString());
			sb.append("\ntriodionStartDate:\t" + triodionStartDateThisYear.getTime().toString());
			sb.append("\ngreatLentStartDate:\t" + greatLentStartDate.getTime().toString());
			sb.append("\npalmSundayDate:\t\t" + palmSundayDate.getTime().toString());
			sb.append("\npaschaDate:\t\t" + paschaDateThisYear.getTime().toString());
			sb.append("\nthomasSundayDate:\t" + thomasSundayDate.getTime().toString());
			sb.append("\npentecostDate:\t\t" + pentecostDate.getTime().toString());
			sb.append("\nallSaintsDate:\t\t" + allSaintsDateThisYear.getTime().toString());
			sb.append("\nlazarusSaturdayNextDate:\t" + lazarusSaturdayNextDate.getTime().toString());
			sb.append("\npalmSundayNextDate:\t" + palmSundayNextDate.getTime().toString());
			sb.append("\npaschaNextDate:\t\t" + paschaDateNext.getTime().toString()); 
			sb.append("\nsundayAfterElevationOfCrossDateLast:\t\t" + sundayAfterElevationOfCrossDateLast.getTime().toString()); 

			return sb.toString();

		}
		public String theDayAndSeasonToString() {
			StringBuilder sb = new StringBuilder();
			sb.append(theDay.getTime().toString()+" Mode " + getModeOfWeek());
			sb.append(" Eo: " + eothinonNumber);
			if (isTriodion) {
				sb.append(" Tri day " + getDayOfSeason());
			} else if (isPentecostarion) {
				sb.append(" Pen day " + getDayOfSeason());
			}
			return sb.toString();
		}

		public String elevationToString() {
			StringBuilder sb = new StringBuilder();
			sb.append("Liturgical date: " 
					+ formattedDate(theDay) 
					+ " Elevation: "
					+ formattedDate(elevationOfCrossDateLast)
					+ " Sunday After: " 
					+ formattedDate(sundayAfterElevationOfCrossDateLast)
					+ " Elapsed days: " 
					+ daysSinceSundayAfterLastElevationOfCross
					+ " Lukan Cycle start: "
					+ this.startOfLukanCycle()
					+ " Lukan Cycle day: "
					+ this.daysSinceStartLastLukanCycle
					+ " " + getWeekAndDayOfLukanCycle()
					);
			return sb.toString();
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();

			sb.append("\nLiturgical Properties of the Day\n" +
					strWrap(dayOfWeek, formattedDate(theDay)) +
					((modeOfWeek!=0)?strWrap("Mode of the week:", Integer.toString(modeOfWeek) ) : "") +
					((eothinonNumber!=0)?strWrap("Eothinon:", Integer.toString(eothinonNumber) ) : "") +
					strWrap("Triodion Started last year:", formattedDate(triodionStartDateLastYear)) +
					strWrap("Triodion Starts this year:", formattedDate(triodionStartDateThisYear)) +
					strWrap("Triodion Starts next year:", formattedDate(triodionStartDateNextYear)) +
					strWrap("Pascha:", formattedDate(paschaDateThisYear) ) +
					strWrap("All-Saints:", formattedDate(allSaintsDateThisYear)) +
					"\nNumber of Sundays Before Triodion: " + numberOfSundaysBeforeStartOfTriodion +
					"\nNumber of days until start of Triodion" + daysUntilStartOfTriodion +
					strWrap("Last Sunday After Elevation of Cross:", formattedDate(sundayAfterElevationOfCrossDateLast)) +
					strWrap("Days Since Last Sunday AfterElevation of Cross:", String.valueOf(daysSinceSundayAfterLastElevationOfCross)) 
					);
			
			//numberOfSundaysBeforeStartOfTriodion
								
			if( isTriodion || isPentecostarion ) {
				String seasonInfo = (isTriodion) ? "Triodion day " : "Pentecostarion day ";
				sb.append(strWrap(seasonInfo, Integer.toString(dayOfSeason)));
			}
			sb.append("\n" + 
					strWrap("is Triodion?",isTriodion()) +
					strWrap("is Pentecostarion?",isPentecostarion()) + "\n" +
					strWrap("isSunday? ", isSunday() ) +
					strWrap("IsMonday? ", isMonday() ) +
					strWrap("isTuesday? ", isTuesday() ) +
					strWrap("isWednesday? ", isWednesday() ) +
					strWrap("isThursday? ", isThursday() ) +
					strWrap("isFriday? ", isFriday() ) +
					strWrap("isSaturday? ", isSaturday() ));
			return sb.toString();
		}

		private String formattedYearMonthDay(GregorianCalendar date) {
			return Integer.toString(date.get(Calendar.YEAR))
			+ "/"+ Integer.toString(date.get(Calendar.MONTH)+1)
			+ "/"+ formattedNumber(date.get(Calendar.DATE),31);
		}
		
		public String getFormattedYearMonthDay() {
			return formattedYearMonthDay(theDay);
		}
		
		public String formattedDate(GregorianCalendar date) {
			return Integer.toString(date.get(Calendar.MONTH)+1)
			+ "/"+ Integer.toString(date.get(Calendar.DATE))
			+ "/" + Integer.toString(date.get(Calendar.YEAR));
		}

		public String pathDate(GregorianCalendar date) {
			return Integer.toString(date.get(Calendar.MONTH)+1)
			+ "/"+ Integer.toString(date.get(Calendar.DATE))
			+ "/" + Integer.toString(date.get(Calendar.YEAR));
		}

		public String getDateAsPath(GregorianCalendar date) {

			String month = Integer.toString(date.get(Calendar.MONTH)+1);
			String day = Integer.toString(date.get(Calendar.DATE));

			if (month.length() == 1) {
				month = "0" + month;
			}
			if (day.length() == 1) {
				day = "0" + day;
			}
			return Integer.toString(date.get(Calendar.YEAR))
			+ "/"+ month
			+ "/" + day;
		}

		public String getDayAsFilename() {

			String month = Integer.toString(theDay.get(Calendar.MONTH)+1);
			String day = Integer.toString(theDay.get(Calendar.DATE));

			if (month.length() == 1) {
				month = "0" + month;
			}
			if (day.length() == 1) {
				day = "0" + day;
			}
			return  ".m"+ month
			+ ".d" + day;
		}

		public String getFormattedDatePath() {
			return getDateAsPath(theDay);
		}
		public String getFormattedDate() {
			return formattedDate(theDay);
		}
		private String divWrap(String desc, String item) {
			return "<div>" + desc + " " + item + "</div>";
		}
		private String divWrap(String desc, Boolean item) {
			return divWrap(desc,String.valueOf(item));
		}	
		private String strWrap(String desc, Boolean item) {
			return strWrap(desc,String.valueOf(item));
		}	
		private String strWrap(String desc, String item) {
			return "\n" + desc + " " + item;
		}
		
		/**
		 * Returns the number with leading zeros
		 * <p>The concept is that numbers belong to sets,
		 * e.g. the numbers of the day of the week, or the
		 * numbers of the days of the month, or the numbers of
		 * the Triodion, or days of the year.  The purpose of this 
		 * method is to pad the number with leading zeroes based on
		 * the largest value within the set the number belongs to.
		 * @param nbr - the number to be formatted
		 * @param max - the maximum value for the set of numbers
		 * @return the number with leading zeroes.
		 */
		public String formattedNumber(int nbr, int max) {
			// Determine how many digits to use for the format string
			int length = String.valueOf(max).length();
			// Build the format string usng the computed digits
			String format = "%0" + String.format("%01d", length)+ "d";
			// return the result
			String result = String.format(format, nbr);
			return result;
		}
				
		public String getDiffSeason() {
			if (isTriodion) {
				return " Tri diffMillis = " + diffMillis(theDay,triodionStartDateThisYear);
			} else if (isPentecostarion) {
				return " Pen diffMillis = " + diffMillis(theDay,paschaDateLast);
			} else {
				return " Not in a Season.";
			}
		}
		
		public static String checkDates(String year) {
			StringBuilder sb = new StringBuilder();
			for (int month = 1; month < 13; month++) {
				for (int day = 1; day <= daysInMonth(month); day++) {
					sb.append("\n"+display(year,String.valueOf(month),String.valueOf(day)));
				}
			}
			return sb.toString();
		}
		
		private static String display(String year, String month, String day) {
			LiturgicalDayProperties theDay = new LiturgicalDayProperties(year,month,day);
			return theDay.theDayAndSeasonToString();
		}
		
		public GregorianCalendar nextPaschaDate() {
			GregorianCalendar thisYear = computeDayOfPascha(theDay.get(GregorianCalendar.YEAR), true);
			GregorianCalendar nextYear = computeDayOfPascha(theDay.get(GregorianCalendar.YEAR)+1, true);
			if (thisYear.after(theDay)) {
				return thisYear;
			} else {
				return nextYear;
			}
		}
		
		public GregorianCalendar lastPaschaDate() {
			GregorianCalendar lastYear = computeDayOfPascha(theDay.get(GregorianCalendar.YEAR)-1, true);
			GregorianCalendar thisYear = computeDayOfPascha(theDay.get(GregorianCalendar.YEAR), true);
			if (thisYear.before(theDay) || thisYear.equals(theDay)) {
				return thisYear;
			} else {
				return lastYear;
			}
		}

		public static String checkPaschas(String year) {
			StringBuilder sb = new StringBuilder();
			for (int month = 1; month < 13; month++) {
				for (int day = 1; day <= daysInMonth(month); day++) {
					LiturgicalDayProperties thisDay = new LiturgicalDayProperties(year,String.valueOf(month),String.valueOf(day));
					sb.append("\n"+year+"-"+month+"-"+day
							+ " Last Pascha: " + thisDay.lastPaschaDate().getTime().toString()
							+ " Next Pascha: " + thisDay.nextPaschaDate().getTime().toString()
							);
				}
			}
			return sb.toString();
		}
		private static int daysInMonth(int month) {
			if (month == 2) {
				return 28; 
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				return 30;
			} else {
				return 31;
			}
		}
		
		private String toEcclesiasticalGreekDate() {
			StringBuffer sb = new StringBuffer();
			try {
				sb.append(greekWeekDays[getIntDayOfWeek()]);
				sb.append(", ");
				sb.append(greekMonthDays[getIntDayOfMonth()-1]);
				sb.append(" ");
				sb.append(greekMonths[getIntMonth()-1]);
				sb.append(", ");
				sb.append(getYear());
			} catch (Exception e) {
				return "";
			}
			return sb.toString();
		}

		/**
		 * Because the date can be reset for an instance of this class,
		 * it is necessary to reset certain variables to their default value.
		 * 
		 * Otherwise, there value can carry over erroneously to a new date.
		 */
		private void setVariablesToDefaults() {
			
			modeOfWeek = 0;  // return 0..8
			modeOfWeekOverride = 0;
			
			// Valid values for 11 week cycle, only valid on Sundays!!!!
			eothinonNumber = 0;  // 0..11

			// valid only when isPentecostarion or isTriodion.
			dayOfSeason = 0;  // return 1..70 (0 if no day set) 
			
			// Used to control lectionary and commemorations 
			daysSinceStartOfTriodion = 0;
			daysSinceSundayAfterLastElevationOfCross = 0;
			daysSinceStartLastLukanCycle = 0;
			numberOfSundaysBeforeStartOfTriodion = 0;

			// movable feast seasons
			isPentecostarion = false;
			isTriodion = false;
			isPascha = false;
			isDaysOfLuke = false;

			// days of week conditionals
			isSunday = false;
			isMonday = false;
			isTuesday = false;
			isWednesday = false;
			isThursday = false;
			isFriday = false;                                        
			isSaturday = false;
		}
		
}
