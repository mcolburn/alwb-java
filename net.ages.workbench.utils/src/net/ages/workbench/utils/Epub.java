package net.ages.workbench.utils;
/**
import java.io.File;
import org.eclipse.mylyn.docs.epub.core.*;
import org.eclipse.emf.ecore.resource.ResourceSet.*;
**/

public class Epub {
/**
	public static void main(String[] args) {

		EPUB epub = new EPUB();
		
//		epub.add(new File("content/alwb.css"), "text/css");
		OPSPublication en = new OPS2Publication();
		en.addLanguage(null, "en");
		en.addTitle(null, null, "Divine Liturgy St Basil the Great - April 6, 2014");
		en.addItem(new File("content/english.xhtml"));
//		en.addItem(new File("content/greek.xhtml"));
//		en.addItem(new File("content/bilingual.xhtml"));
		en.addItem(null, null, new File("content/alwb.css"), null, "text/css", false, false, false);
		en.setGenerateToc(true);
		epub.add(en);
/**
		// English version
		OPSPublication en = new OPS2Publication();
		en.addLanguage(null, "en");
		en.addTitle(null, null, "Halfdan the Black's saga");
		en.addItem(new File("content/halfdan/halfdan_svarte_en.xhtml"));
		en.setGenerateToc(true);
		epub.add(en);
		// Norwegian version
		OPSPublication no = new OPS2Publication();
		no.addLanguage(null, "no");
		no.addTitle(null, null, "Halfdan Svartes saga");
		no.addItem(new File("content/halfdan/halfdan_svarte_no.xhtml"));
		no.setGenerateToc(true);
		epub.add(no);
		// Icelandic version
		OPSPublication is = new OPS2Publication();
		is.addLanguage(null, "is");
		is.addTitle(null, null, "Hálfdanar saga svarta");
		is.addItem(new File("content/halfdan/halfdan_svarte_is.xhtml"));
		is.setGenerateToc(true);
		epub.add(is);
	
		try {
			File epubFile = new File("content/2014-08-06-Divine-Liturgy-Greek-English.epub");
			epubFile.delete();
			epub.pack(epubFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
**/
}
