package net.ages.workbench.templates.dsl.xml.fo;

import java.util.List;
import java.util.Iterator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

import com.google.common.collect.Iterables;

import net.ages.workbench.utils.AlwbLogger;
import net.ages.workbench.resources.dsl.ares.Definition;

/**
 * Media Class
 * @author mac002
 *<p>This class loads stylesheet properties for generating PDF files.
 *<p>The properties are stored in an ares file obtained via an Eclipse preference.
 * 
 * */
public class StyleLoader {
	private static Map<String,String> map = new HashMap<String,String>();
	private static Resource stylesheet_resource;
	private static Logger logger = AlwbLogger.getLogger("Media");
	private static Map<String,String> loadOptions = new HashMap(); 
		
	/**
	 * Iterates the resource for which the instance was created, and loads each composition into a composition map.
	 * The map key is the ID of the composition and the value is a Composition instance.
	 */
	public static Map<String,XmlFoFormat> loadStyleSheet(Resource resource) {
		logger.entry();
		Map<String,XmlFoFormat> stylesheet = new HashMap<String,XmlFoFormat>();
		try {
			stylesheet_resource = resource;
			loadOptions.put(XtextResource.OPTION_ENCODING, "UTF-8");
			stylesheet_resource.load(loadOptions); // in order to ensure loaded as UTF-8
			TreeIterator<EObject> _allContents = stylesheet_resource.getAllContents();
			Iterable<EObject> _iterable = IteratorExtensions
					.<EObject> toIterable(_allContents);
			Iterable<Definition> _filter = Iterables.<Definition> filter(_iterable, Definition.class);
			String key = "";
			String value = "";
			for (final Definition e : _filter) {
				key = e.getName();
				value = e.getDsl_Definition_Text();
				stylesheet.put(key, new XmlFoFormat(key,value));
			}
		} catch (IOException e1) {
			stylesheet = null;
			logger.catching(e1);
		}
		logger.exit();
		return stylesheet;
	}
}	

