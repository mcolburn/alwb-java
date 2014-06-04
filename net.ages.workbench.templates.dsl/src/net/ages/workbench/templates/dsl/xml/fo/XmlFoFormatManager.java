package net.ages.workbench.templates.dsl.xml.fo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.ages.workbench.utils.AlwbLogger;
import org.apache.logging.log4j.Logger;


import org.eclipse.emf.ecore.resource.Resource;

import net.ages.workbench.templates.dsl.xml.fo.StyleLoader;

/**
 * Loads a cascading stylesheet (*.css file) and converts it to a format usable by XML-FO.
 * <p>Provides a means to retrieve the XML-FO format based on a selector, e.g. actor.
 * @author mac002
 *
 */
public class XmlFoFormatManager {

	static Logger logger = AlwbLogger.getLogger("XmlFoFormatManager");

	static String pathToCss = "";
	static Map<String,XmlFoFormat> stylesheet = new HashMap<String,XmlFoFormat>();
	static boolean loaded = false;

	public static void loadFromCss(Resource r) {
		logger.entry();
		try {
			stylesheet = StyleLoader.loadStyleSheet(r);
			loaded = true;
		} catch (Exception e) {
			logger.catching(e);
			loaded = loadStatically();
		}
		logger.exit();
	}
	
	/**
	 * Retrieve the style declarations for the specified selector, e.g. hymn
	 * @param selector
	 * @return the style declarations for the selector, formatted for inclusion in
	 * an XML FO tag.
	 */
	public static String getStyleFor(String selector) {
		logger.entry();
		String result = "";
		try {
			result = stylesheet.get(selector).toString();
		} catch (Exception e) {
			logger.error(selector + " not found!");
			logger.catching(e);
		}
		logger.exit();
		return result;
	}

	public static String managerToString() {
		StringBuffer sb = new StringBuffer();
		Iterator<Entry<String, XmlFoFormat>> it = stylesheet.entrySet().iterator();
		while(it.hasNext()) {
			sb.append(it.next().getValue().wrap(": ", "\n"));
		}
		return sb.toString();

	}
	
	public static String managerToAres() {
		StringBuffer sb = new StringBuffer();
		Iterator<Entry<String, XmlFoFormat>> it = stylesheet.entrySet().iterator();
		while(it.hasNext()) {
			sb.append(it.next().getValue().toAres());
			sb.append("\n");
		}
		return sb.toString();

	}
	
	/**
	 * Used for test purposes as an alternative to loading from a CSS
	 */
	public static boolean loadStatically() {
		
		String globalPadding = "6px";
		String globalIndent = ".3in";
		String globalFontSize = "12pt";
		String globalLineHeight = "130%";
	
		// table
		XmlFoFormat table = new XmlFoFormat("table");
		table.push("margin", "0 3 pt");
		table.push("padding", "0");
		table.push("border-collapse", "collapse");
//		table.push("display", "inline"); // not allowed in fo:table
		stylesheet.put("table", table);
		
		// table row
		XmlFoFormat tableRow = new XmlFoFormat("tr");
		tableRow.push("border-spacing", "0 5 px");
		stylesheet.put("tr", tableRow);

		// table cell
		XmlFoFormat tableCell = new XmlFoFormat("td");
		tableCell.push("border-left", "thin solid silver");
		tableCell.push("border-right", "thin solid silver");
		tableCell.push("vertical-align", "top");
//		tableCell.push("width", "50%"); // don't use.  Both columns wind up on top each other
		tableCell.push("padding-left", "8px");
		tableCell.push("padding-right", "8px");
		stylesheet.put("td", tableCell);

		// Table Cell for Language 1
		XmlFoFormat tableCellL1 = new XmlFoFormat("tdL1");
		tableCellL1.push("border-right", "thin solid silver");
		tableCellL1.push("vertical-align", "top");
//		tableCellL1.push("width", "50%"); // don't use.  Both columns wind up on top each other
		tableCellL1.push("padding-left", "8px");
		tableCellL1.push("padding-right", "8px");
		stylesheet.put("tdL1", tableCellL1);

		// Table Cell for Language 2
		XmlFoFormat tableCellL2 = new XmlFoFormat("tdL2");
		tableCellL2.push("vertical-align", "top");
//		tableCellL2.push("width", "50%"); // don't use.  Both columns wind up on top each other
		tableCellL2.push("padding-left", "8px");
		tableCellL2.push("padding-right", "8px");
		stylesheet.put("tdL2", tableCellL2);

		// Table Cell for Single Language
		XmlFoFormat tableCellMono = new XmlFoFormat("tdMono");
		tableCellMono.push("vertical-align", "top");
//		tableCellMono.push("width", "50%"); // don't use.  Both columns wind up on top each other
		tableCellMono.push("padding-left", "8px");
		tableCellMono.push("padding-right", "8px");
		stylesheet.put("tdMono", tableCellMono);

		// actor
		XmlFoFormat actor = new XmlFoFormat("actor");
		actor.push("color", "red");
		actor.push("font-variant", "small-caps");
		actor.push("text-align", "left");
		actor.push("text-indent", "0px");
		actor.push("font-weight", "bold");
		actor.push("font-size", globalFontSize);
		actor.push("font-family", "Palatino Linotype Bold");
		actor.push("padding-bottom", globalPadding);
		stylesheet.put("actor", actor);
		
		// p.mode
		XmlFoFormat paraMode = new XmlFoFormat("mode");
		paraMode.push("text-align", "center");
		paraMode.push("color", "red");
		paraMode.push("font-weight", "bold");
		paraMode.push("font-family", "Palatino Linotype Bold");
		paraMode.push("font-size", globalFontSize);
		paraMode.push("padding-bottom", globalPadding);
		stylesheet.put("mode", paraMode);
		
		// p.chant
		XmlFoFormat paraChant = new XmlFoFormat("chant");
		paraChant.push("text-align", "left");
		paraChant.push("text-indent", globalIndent);
		paraChant.push("font-family", "Palatino Linotype");
		paraChant.push("font-size", globalFontSize);
		paraChant.push("padding-bottom", globalPadding);
		stylesheet.put("chant", paraChant);

		// p.melody
		XmlFoFormat paraMelody = new XmlFoFormat("melody");
		paraMelody.push("text-align", "center");
		paraMelody.push("font-weight", "normal");
		paraMelody.push("color", "red");
		paraMelody.push("font-style", "italic");
		paraMelody.push("padding-bottom", globalPadding);
		paraMelody.push("font-size", globalFontSize);
		stylesheet.put("melody", paraMelody);

		// p.name
		XmlFoFormat paraName = new XmlFoFormat("name");
		paraName.push("font-weight", "normal");
		paraName.push("color", "red");
		paraName.push("font-style", "italic");
		paraName.push("font-size", globalFontSize);
		paraName.push("padding-bottom", globalPadding);
		stylesheet.put("name", paraName);
		
		// p.prayer
		XmlFoFormat paraPrayer = new XmlFoFormat("prayer");
		paraPrayer.push("text-align", "left");
		paraPrayer.push("text-indent", globalIndent);
		paraPrayer.push("line-height", "150%");
		paraPrayer.push("font-size", globalFontSize);
		paraPrayer.push("padding-bottom", globalPadding);
		stylesheet.put("prayer", paraPrayer);

		// p.prayerzero
		XmlFoFormat paraPrayerZero = new XmlFoFormat("prayerzero");
		paraPrayerZero.push("text-align", "left");
		paraPrayerZero.push("text-indent", globalIndent);
		paraPrayerZero.push("line-height", "150%");
		paraPrayerZero.push("padding-bottom", globalPadding);
		paraPrayerZero.push("font-size", globalFontSize);
		stylesheet.put("prayerzero", paraPrayerZero);

		// p.designation
		XmlFoFormat paraDesignation = new XmlFoFormat("designation");
		paraDesignation.push("text-align", "center");
		paraDesignation.push("font-style", "normal");
		paraDesignation.push("font-weight", "bold");
		paraDesignation.push("font-family", "Palatino Linotype Bold");
		paraDesignation.push("font-size", globalFontSize);
		paraDesignation.push("color", "red");
		paraDesignation.push("padding-bottom", globalPadding);
		stylesheet.put("designation", paraDesignation);


		// p.Mixed
		XmlFoFormat paraMixed = new XmlFoFormat("mixed");
		paraMixed.push("text-align", "center");
		paraMixed.push("font-weight", "normal");
		paraMixed.push("font-style", "normal");
		paraMixed.push("font-size", globalFontSize);
		paraMixed.push("padding-bottom", globalPadding);
		stylesheet.put("mixed", paraMixed);
		
		// dialog
		XmlFoFormat paraDialog = new XmlFoFormat("dialog");
		paraDialog.push("text-align", "left");
		paraDialog.push("text-indent", globalIndent);
		paraDialog.push("font-size", globalFontSize);
		paraDialog.push("line-height", globalLineHeight);
		paraDialog.push("padding-bottom", globalPadding);
		stylesheet.put("dialog", paraDialog);
		
		// dialogzero
		XmlFoFormat paraDialogZero = new XmlFoFormat("dialogzero");
		paraDialogZero.push("text-align", "left");
		paraDialogZero.push("text-indent", globalIndent);
		paraDialogZero.push("font-size", globalFontSize);
		paraDialogZero.push("line-height", globalLineHeight);
		paraDialogZero.push("padding-bottom", globalPadding);
		stylesheet.put("dialogzero", paraDialogZero);

		// inaudible
		XmlFoFormat paraInaudible = new XmlFoFormat("inaudible");
		paraInaudible.push("text-align", "left");
		paraInaudible.push("text-indent", globalIndent);
		paraInaudible.push("font-size", globalFontSize);
		paraInaudible.push("line-height", "150%");
		paraInaudible.push("padding-bottom", globalPadding);
		stylesheet.put("inaudible", paraInaudible);
		
		// verse
		XmlFoFormat paraVerse = new XmlFoFormat("verse");
		paraVerse.push("text-align", "left");
		paraVerse.push("text-indent", globalIndent);
		paraVerse.push("font-size", globalFontSize);
		paraVerse.push("font-style", "italic");
		paraVerse.push("line-height", "150%");
		paraVerse.push("padding-bottom", globalPadding);
		stylesheet.put("verse", paraVerse);
		
		
		// HeaderOddLeft
		XmlFoFormat headerOddLeft = new XmlFoFormat("headerOddLeft");
		headerOddLeft.push("text-align", "left");
		headerOddLeft.push("font-size", globalFontSize);
		headerOddLeft.push("border-bottom", "thin solid silver");
		stylesheet.put("headerOddLeft", headerOddLeft);

		// HeaderOddLeftColor
		XmlFoFormat headerOddLeftColor = new XmlFoFormat("headerOddLeftColor");
		headerOddLeftColor.push("color", "red");
		stylesheet.put("headerOddLeftColor", headerOddLeftColor);

		// HeaderOddCenter
		XmlFoFormat headerOddCenter = new XmlFoFormat("headerOddCenter");
		headerOddCenter.push("text-align", "center");
		headerOddCenter.push("font-size", globalFontSize);
		headerOddCenter.push("border-bottom", "thin solid silver");
		stylesheet.put("headerOddCenter", headerOddCenter);

		// HeaderOddCenterColor
		XmlFoFormat headerOddCenterColor = new XmlFoFormat("headerOddCenterColor");
		headerOddCenterColor.push("color", "red");
		stylesheet.put("headerOddCenterColor", headerOddCenterColor);

		// HeaderOddRight
		XmlFoFormat headerOddRight = new XmlFoFormat("headerOddRight");
		headerOddRight.push("text-align", "right");
		headerOddRight.push("font-size", globalFontSize);
		headerOddRight.push("border-bottom", "thin solid silver");
		stylesheet.put("headerOddRight", headerOddRight);

		// HeaderOddRightColor
		XmlFoFormat headerOddRightColor = new XmlFoFormat("headerOddRightColor");
		headerOddRightColor.push("color", "red");
		stylesheet.put("headerOddRightColor", headerOddRightColor);

		// HeaderEvenLeft
		XmlFoFormat headerEvenLeft = new XmlFoFormat("headerEvenLeft");
		headerEvenLeft.push("text-align", "left");
		headerEvenLeft.push("font-size", globalFontSize);
		headerEvenLeft.push("border-bottom", "thin solid silver");
		stylesheet.put("headerEvenLeft", headerEvenLeft);
		
		// HeaderEvenLeftColor
		XmlFoFormat headerEvenLeftColor = new XmlFoFormat("headerEvenLeftColor");
		headerEvenLeftColor.push("color", "red");
		stylesheet.put("headerEvenLeftColor", headerEvenLeftColor);

		// HeaderEvenCenter
		XmlFoFormat headerEvenCenter = new XmlFoFormat("headerEvenCenter");
		headerEvenCenter.push("text-align", "center");
		headerEvenCenter.push("font-size", globalFontSize);
		headerEvenCenter.push("border-bottom", "thin solid silver");
		stylesheet.put("headerEvenCenter", headerEvenCenter);

		// HeaderEvenCenterColor
		XmlFoFormat headerEvenCenterColor = new XmlFoFormat("headerEvenCenterColor");
		headerEvenCenterColor.push("color", "red");
		stylesheet.put("headerEvenCenterColor", headerEvenCenterColor);

		// HeaderEvenRight
		XmlFoFormat headerEvenRight = new XmlFoFormat("headerEvenRight");
		headerEvenRight.push("text-align", "right");
		headerEvenRight.push("font-size", globalFontSize);
		headerEvenRight.push("border-bottom", "thin solid silver");
		stylesheet.put("headerEvenRight", headerEvenRight);

		// HeaderEvenRightColor
		XmlFoFormat headerEvenRightColor = new XmlFoFormat("headerEvenRightColor");
		headerEvenRightColor.push("color", "red");
		stylesheet.put("headerEvenRightColor", headerEvenRightColor);

		// footerOddLeft
		XmlFoFormat footerOddLeft = new XmlFoFormat("footerOddLeft");
		footerOddLeft.push("text-align", "left");
		footerOddLeft.push("font-size", globalFontSize);
		stylesheet.put("footerOddLeft", footerOddLeft);
		
		// footerOddLeftColor
		XmlFoFormat footerOddLeftColor = new XmlFoFormat("footerOddLeftColor");
		footerOddLeftColor.push("color", "red");
		stylesheet.put("footerOddLeftColor", footerOddLeftColor);

		// footerOddCenter
		XmlFoFormat footerOddCenter = new XmlFoFormat("footerOddCenter");
		footerOddCenter.push("text-align", "center");
		footerOddCenter.push("font-size", globalFontSize);
		stylesheet.put("footerOddCenter", footerOddCenter);

		// footerOddCenterColor
		XmlFoFormat footerOddCenterColor = new XmlFoFormat("footerOddCenterColor");
		footerOddCenterColor.push("color", "red");
		stylesheet.put("footerOddCenterColor", footerOddCenterColor);

		// footerOddRight
		XmlFoFormat footerOddRight = new XmlFoFormat("footerOddRight");
		footerOddRight.push("text-align", "right");
		footerOddRight.push("font-size", globalFontSize);
		stylesheet.put("footerOddRight", footerOddRight);

		// footerOddRightColor
		XmlFoFormat footerOddRightColor = new XmlFoFormat("footerOddRightColor");
		footerOddRightColor.push("color", "red");
		stylesheet.put("footerOddRightColor", footerOddRightColor);

		// footerEvenLeft
		XmlFoFormat footerEvenLeft = new XmlFoFormat("footerEvenLeft");
		footerEvenLeft.push("text-align", "left");
		footerEvenLeft.push("font-size", globalFontSize);
		stylesheet.put("footerEvenLeft", footerEvenLeft);
		
		// footerEvenLeftColor
		XmlFoFormat footerEvenLeftColor = new XmlFoFormat("footerEvenLeftColor");
		footerEvenLeftColor.push("color", "red");
		stylesheet.put("footerEvenLeftColor", footerEvenLeftColor);

		// footerEvenCenter
		XmlFoFormat footerEvenCenter = new XmlFoFormat("footerEvenCenter");
		footerEvenCenter.push("text-align", "center");
		footerEvenCenter.push("font-size", globalFontSize);
		stylesheet.put("footerEvenCenter", footerEvenCenter);

		// footerEvenCenterColor
		XmlFoFormat footerEvenCenterColor = new XmlFoFormat("footerEvenCenterColor");
		footerEvenCenterColor.push("color", "red");
		stylesheet.put("footerEvenCenterColor", footerEvenCenterColor);

		// footerEvenRight
		XmlFoFormat footerEvenRight = new XmlFoFormat("footerEvenRight");
		footerEvenRight.push("text-align", "right");
		footerEvenRight.push("font-size", globalFontSize);
		stylesheet.put("footerEvenRight", footerEvenRight);

		// footerEvenRightColor
		XmlFoFormat footerEvenRightColor = new XmlFoFormat("footerEvenRightColor");
		footerEvenRightColor.push("color", "red");
		stylesheet.put("footerEvenRightColor", footerEvenRightColor);

		// hymn
		XmlFoFormat paraHymn = new XmlFoFormat("hymn");
		paraHymn.push("text-align", "left");
		paraHymn.push("text-indent", globalIndent);
		paraHymn.push("font-size", globalFontSize);
		// Do not change line-height
		paraHymn.push("line-height", "150%");
		paraHymn.push("padding-bottom", globalPadding);
		stylesheet.put("hymn", paraHymn);
		
		// reading
		XmlFoFormat paraReading = new XmlFoFormat("reading");
		paraReading.push("text-align", "left");
		paraReading.push("text-indent", globalIndent);
		paraReading.push("font-size", globalFontSize);
		paraReading.push("padding-top", "5px");
		paraReading.push("padding-bottom", globalPadding);
		stylesheet.put("reading", paraReading);
		
		// reading zero
		XmlFoFormat paraReadingZero = new XmlFoFormat("readingzero");
		paraReadingZero.push("text-align", "left");
		paraReadingZero.push("font-size", globalFontSize);
		paraReadingZero.push("text-indent", globalIndent);
		paraReadingZero.push("line-height", "150%");
		paraReadingZero.push("padding-top", "0px");
		paraReadingZero.push("padding-bottom", globalPadding);
		stylesheet.put("readingzero", paraReadingZero);
		
		// cover1
		XmlFoFormat paraCover1 = new XmlFoFormat("cover1");
		paraCover1.push("text-align","center");
		paraCover1.push("font-weight","normal");
		paraCover1.push("font-size","48pt");
		paraCover1.push("margin-bottom", "1in");
		paraCover1.push("padding-bottom", "1in");
		stylesheet.put("cover1", paraCover1);

		// cover2
		XmlFoFormat paraCover2 = new XmlFoFormat("cover2");
		paraCover2.push("text-align","center");
		paraCover2.push("font-weight","bold");
		paraCover2.push("font-family", "Palatino Linotype Bold");
		paraCover2.push("font-size","24pt");
		paraCover2.push("padding-bottom", "1em");
		stylesheet.put("cover2", paraCover2);

		// cover3
		XmlFoFormat paraCover3 = new XmlFoFormat("cover3");
		paraCover3.push("text-align","center");
		paraCover3.push("font-weight","bold");
		paraCover3.push("font-family", "Palatino Linotype Bold");
		paraCover3.push("font-size","12pt");
		paraCover3.push("color", "red");
//		paraCover3.push("text-indent", "20px");
//		paraCover3.push("margin-left", "2in");
		paraCover3.push("padding-bottom", "2em");
		stylesheet.put("cover3", paraCover3);

		// cover4
		XmlFoFormat paraCover4 = new XmlFoFormat("cover4");
		paraCover4.push("text-align","center");
		paraCover4.push("font-family", "Palatino Linotype Bold");
		paraCover4.push("font-weight","bold");
		paraCover4.push("font-size","16pt");
		paraCover4.push("color", "red");
		paraCover4.push("padding-bottom", "1em");
		stylesheet.put("cover4", paraCover4);

		// cover5
		XmlFoFormat paraCover5 = new XmlFoFormat("cover5");
		paraCover5.push("text-align","center");
		paraCover5.push("font-weight","bold");
		paraCover5.push("font-family", "Palatino Linotype Bold");
		paraCover5.push("font-size","16pt");
		paraCover1.push("margin-top", "1in");
		stylesheet.put("cover5", paraCover5);

		// credits1
		XmlFoFormat paraCredits1 = new XmlFoFormat("credits1");
		paraCredits1.push("padding-top", "1em");
		paraCredits1.push("text-align","left");
		paraCredits1.push("font-weight","bold");
		paraCredits1.push("font-family", "Palatino Linotype Bold");
		paraCredits1.push("font-size",globalFontSize);
		paraCredits1.push("padding-bottom", "1em");
		stylesheet.put("credits1", paraCredits1);

		// credits2
		XmlFoFormat paraCredits2 = new XmlFoFormat("credits2");
		paraCredits2.push("text-align","left");
		paraCredits2.push("font-size",globalFontSize);
		stylesheet.put("credits2", paraCredits2);

		// credits3
		XmlFoFormat paraCredits3 = new XmlFoFormat("credits3");
		paraCredits3.push("text-align","left");
		paraCredits3.push("font-size",globalFontSize);
		paraCredits3.push("padding-bottom", "1em");
		stylesheet.put("credits3", paraCredits3);

		// chapverse
		XmlFoFormat paraChapVerse = new XmlFoFormat("chapverse");
		paraChapVerse.push("text-align", "center");
		paraChapVerse.push("font-style", "italic");
		paraChapVerse.push("font-size", globalFontSize);
		paraChapVerse.push("font-weight", "normal");
		paraChapVerse.push("color", "red");
		paraChapVerse.push("padding-bottom", globalPadding);
		stylesheet.put("chapverse", paraChapVerse);
		
		// rubric (block)
		XmlFoFormat paraRubric = new XmlFoFormat("rubric");
		paraRubric.push("text-align", "left");
		paraRubric.push("text-indent", globalIndent);
		paraRubric.push("font-style", "italic");
		paraRubric.push("font-size", globalFontSize);
		paraRubric.push("font-weight", "normal");
		paraRubric.push("color", "red");
		paraRubric.push("padding-bottom", globalPadding);
		paraRubric.push("line-height", "150%");
		stylesheet.put("rubric", paraRubric);

		// rubric (inline)
		XmlFoFormat inlineRubric = new XmlFoFormat("inlinerubric");
		inlineRubric.push("font-style", "italic");
		inlineRubric.push("font-size", globalFontSize);
		inlineRubric.push("color", "red");
		stylesheet.put("inlinerubric", inlineRubric);

		// boldItalicsRed
		XmlFoFormat inlineBoldItalicsRed = new XmlFoFormat("bolditalicsred");
		inlineBoldItalicsRed.push("font-style", "italic");
		inlineBoldItalicsRed.push("font-weight", "bold");
		inlineBoldItalicsRed.push("font-family", "Palatino Linotype Bold Italic");
		inlineBoldItalicsRed.push("color", "red");
		stylesheet.put("bolditalicsred", inlineBoldItalicsRed);

		// bold
		XmlFoFormat inlineBold = new XmlFoFormat("bold");
		inlineBold.push("font-family", "Palatino Linotype Bold");
		inlineBold.push("font-weight", "bold");
		inlineBold.push("font-style", "normal");
		stylesheet.put("bold", inlineBold);

		// italics
		XmlFoFormat inlineItalics = new XmlFoFormat("italics");
		inlineItalics.push("font-style", "italic");
		inlineItalics.push("font-weight", "normal");
		stylesheet.put("italics", inlineItalics);

		// boldItalics
		XmlFoFormat inlineBoldItalics = new XmlFoFormat("bolditalics");
		inlineBoldItalics.push("font-family", "Palatino Linotype Bold Italic");
		inlineBoldItalics.push("font-style", "italic");
		inlineBoldItalics.push("font-weight", "bold");
		stylesheet.put("bolditalics", inlineBoldItalics);

		// red
		XmlFoFormat inLineRed = new XmlFoFormat("red");
		inLineRed.push("color", "red");
		stylesheet.put("red", inLineRed);
	
		// boldRed
		XmlFoFormat inlineBoldRed = new XmlFoFormat("boldred");
		inlineBoldRed.push("font-family", "Palatino Linotype Bold");
		inlineBoldRed.push("font-style", "normal");
		inlineBoldRed.push("font-weight", "bold");
		inlineBoldRed.push("color", "red");
		stylesheet.put("boldred", inlineBoldRed);

		// italicsRed
		XmlFoFormat inlineItalicsRed = new XmlFoFormat("italicsred");
		inlineItalicsRed.push("font-style", "italic");
		inlineItalicsRed.push("font-weight", "normal");
		inlineItalicsRed.push("color", "red");
		stylesheet.put("italicsred", inlineItalicsRed);
		
		return true;

	}
	

	public static void main(String[] args) {
		loadStatically();
	}

}
