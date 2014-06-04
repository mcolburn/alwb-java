package net.ages.workbench.templates.dsl.xml.fo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import net.ages.workbench.templates.dsl.utils.Pair;
import net.ages.workbench.templates.dsl.utils.PairComparator;

/**
 * 
 * @author mac002
 * Contains information from a CSS on how to format an XML-FO
 * object representing a specified DSL object with or without 
 * a class or role.
 * <p>For example, an AGES Title object is actually a Paragraph with a class name.
 *  In a CSS, p.mode sets the formatting for a Title whose role is mode.
 */
public class XmlFoFormat {
	
	private String selector = ""; // the DSL object name with or without the class or role
	ArrayList<Pair> declarationBlock = new ArrayList<Pair>();
	
	public XmlFoFormat(String selector) {
		this.selector = selector;
	}
	
	/**
	 * 
	 * @param selector
	 * @param values - see example below:
	 * <p>
	 * 	color: red;
	 *  font-size: 12pt;
	 *	font-style: italic;
	 *	font-weight: normal;
	 *	padding-bottom: 6px;
	 *	text-align: center;
	 */
	public XmlFoFormat(String selector, String values) {
		this.selector = selector;
		try {
			String temp = values.replaceAll("\n", "");
			temp = temp.replaceAll("\t", "");
			String [] parts = temp.split(";");
			for (int i=0; i < parts.length; i++) {
				if (parts[i].length() > 1) {
					try {
						String [] subParts = parts[i].split(":");
						push(subParts[0],subParts[1].trim());
					} catch (Exception inner) {
					}
				}
			}
		} catch (Exception e) {
		}
	}

	public void push(String key, String value) {
		declarationBlock.add(new Pair(key,value));
	}
	
	public String wrap(String separator, String end) {
		return selector+separator+this.toString()+end;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		try {
			Collections.sort(declarationBlock,new PairComparator());
			Iterator<Pair> it = declarationBlock.iterator();
			while(it.hasNext()) {
				sb.append(" ");
				sb.append(it.next().wrap("", "=", "'"));
			}
		} catch (Exception e) {
			sb.append("error in XmlFoFormat.toString() for " + selector);
		}
		return sb.toString();
	}
	
	/**
	 * The method below was created in order to generate a set of styles
	 * to be used in an ares file.
	 * @return
	 */
	public String toAres() {
		StringBuffer sb = new StringBuffer();
		try {
			sb.append(selector);
			sb.append(" = ");
			sb.append("\"");
			Collections.sort(declarationBlock,new PairComparator());
			Iterator<Pair> it = declarationBlock.iterator();
			while(it.hasNext()) {
				sb.append("\n\t");
				sb.append(it.next().wrap("", ": ", ""));
				sb.append(";");
			}
			sb.append("\n");
			sb.append("\"");
		} catch (Exception e) {
			sb.append("error in XmlFoFormat.toString() for " + selector);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		XmlFoFormat para = new XmlFoFormat("p");
		para.push("text-align", "left");
		para.push("font-weight", "normal");
		para.push("padding-left", "-50px");
		
		System.out.println(para.toString());
	}

}

