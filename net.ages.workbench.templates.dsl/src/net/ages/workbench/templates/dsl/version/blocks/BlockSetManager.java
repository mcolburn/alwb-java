package net.ages.workbench.templates.dsl.version.blocks;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


/**
 * A "block" represents an area to be generated, usually a column, but
 * could be a row. A block ID is not the same as a Version ID, but a block
 * is for a specific version, e.g. en_US_ematins.  Block IDs indicate the
 * display sequence for versions.  If the generated versions are placed in 
 * columns, and there are only two versions, then block ID 1 is the left column, ID 2 is the right column.
 * If they are placed in their own rows, block ID 1 is the first row, block ID 2 the 2nd.
 * @author mac002
 *
 */
public class BlockSetManager {

	Map<String,BlockSet> sets = new TreeMap<String,BlockSet>();
	
	public BlockSetManager() {
	}
	
	public Map<String,BlockSet> getSets() {
		return sets;
	}
	
	public void addSet(String key, BlockSet set) {
		sets.put(key, set);
	}
	
	
	/** Active the BlockSets whose Id is in the supplied list
	 * 
	 * @param l - List of Blocks to activate.  
	 */
	public void activate(List<String> l) {
		inactivateAll();
		Iterator<String> it = l.iterator();
		String key;
		BlockSet value;
		while (it.hasNext()) {
			key = it.next();
			value = sets.get(key);
			value.setOn(true);
			sets.put(key, value);
		}
	}
	
	/**
	 * Sets all BlockSets to an inactive state.
	 */
	private void inactivateAll() {
		Entry<String,BlockSet> entry;
		Iterator <Entry<String,BlockSet>> it = sets.entrySet().iterator();
		while (it.hasNext()) {
			entry = it.next();
			entry.getValue().setOn(false);
			sets.put(entry.getKey(), entry.getValue());
		}
	}
}
