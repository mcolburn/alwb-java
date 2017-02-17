package net.ages.workbench.templates.dsl.utils;

import java.util.Comparator;

/**
 * Used to compare the keys in a collection of Pairs in order to sort them.
 * @author mac002
 *
 */
public class PairComparator implements Comparator<Pair> {
	@Override
	public int compare (Pair p1, Pair p2) {
		return p1.getKey().compareTo(p2.getKey()); 
	}

}
