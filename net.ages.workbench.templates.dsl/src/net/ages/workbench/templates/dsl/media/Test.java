package net.ages.workbench.templates.dsl.media;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	/**
	 * * oc.m4.d1.ocMA.GodIsTheLord.c1.a1.singer            = people.dedes
	 * oc.m4.d1.ocMA.GodIsTheLord.c1.a1.url.base          = url.base.dcs
	 * oc.m4.d1.ocMA.GodIsTheLord.c1.a1.url.path          = "MW/WMatins3/a/SM3-00.mp3"
	 * oc.m4.d1.ocMA.GodIsTheLord.c1.a1.year              = "2013"
	 * oc.m4.d1.ocMA.GodIsTheLord.c1.a2.singer            = people.kabarnos
	 * oc.m4.d1.ocMA.GodIsTheLord.c1.a2.url.base          = url.base.dcs
	 * oc.m4.d1.ocMA.GodIsTheLord.c1.a2.url.path          = "MW/WMatins3/a/SM3-02.mp3"
	 * oc.m4.d1.ocMA.GodIsTheLord.c1.a2.year              = "2013"
	 * oc.m4.d1.ocMA.GodIsTheLord.c1.composer                 = people.dedes
	 * oc.m4.d1.ocMA.GodIsTheLord.c1.score.b.arranger = people.dedes
	 * oc.m4.d1.ocMA.GodIsTheLord.c1.score.b.url.base = url.base.dcs
	 * oc.m4.d1.ocMA.GodIsTheLord.c1.score.b.url.path = "oc.m4.d1.ocMA.GodIsTheLord.sb.pdf"
	 * oc.m4.d1.ocMA.GodIsTheLord.c1.score.b.year     = "2013"
	 * oc.m4.d1.ocMA.GodIsTheLord.c1.score.w.arranger   = people.dedes
	 * oc.m4.d1.ocMA.GodIsTheLord.c1.score.w.url.base   = url.base.dcs
	 * oc.m4.d1.ocMA.GodIsTheLord.c1.score.w.url.path   = "MW/WMatins4/00-01.pdf"
	 * oc.m4.d1.ocMA.GodIsTheLord.c1.score.w.year       
	 */
	
	public static void main(String[] args) {
		String patternComp = "(.*)\\.(c\\d+)\\..*";
		String patternScore = "(.*)\\.(c\\d+)\\.score.*";
		String patternAudioId = "(.*)\\.(c\\d+)\\.(a\\d+)\\..*";
		
		String a = "oc.m4.d1.ocMA.GodIsTheLord.c1.score.b.arranger";
		String b = "oc.m4.d1.ocMA.GodIsTheLord.c1.a1.url.base";
		String c = "oc.m4.d1.ocMA.GodIsTheLord.c1.a1.singer";
		check(patternComp,a);
		check(patternComp,b);
		check(patternAudioId,c);
		
		//a = "";
		
		System.out.println(propertyNotNull(a));
	}
	
	public static boolean propertyNotNull(String property) {
		return (property != null && (property != "null") && (property != ""));
	}
	
	public static void check(String pattern, String s) {
		Pattern thePattern = Pattern.compile(pattern);
		Matcher matcher = thePattern.matcher(s);
		if (matcher.matches()) {
			System.out.println(matcher.group(1));
			System.out.println(matcher.group(2));
			try {
				System.out.println(matcher.group(3));
			} catch (Exception e) {
				
			}
		}
		
	}

}
