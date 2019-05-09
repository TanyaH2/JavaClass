package com.class33;

import java.util.*;

/*
 * Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Print all keys and values from a Best Buy map using EntrySet.
 */
public class MapTaskBestBuy {
	/*
	 * userDetailsMap.entrySet();// returns a set of entries
	 * 
	 * for (Map.Entry<String, String> entry : userDetailsMap.entrySet()) {
	 * System.out.println(entry.getKey() + ":" + entry.getValue()); }
	 * 
	 * 
	 * System.out.println("Using iterator------------------------------------");
	 * 
	 * Iterator<Map.Entry<String, String>> it=userDetailsMap.entrySet().iterator();
	 * while(it.hasNext()) { 
	 * Map.Entry<String, String> entry=it.next();//Map.Entry entry=it.next(); 
	 * System.out.println(entry.getKey()+":"+entry.getValue());
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> items = new LinkedHashMap();
		items.put(423211, "Printer");
		items.put(111993, "TV");
		items.put(632009, "MacBook Pro");
		items.put(123008, "Headphones");
		items.put(532220, "Camera");
		System.out.println(items);
		System.out.println(items.entrySet());
		
		System.out.println();
		items.entrySet();
		for(Map.Entry<Integer, String> itemsEntry:items.entrySet()) {
		System.out.println(itemsEntry.getKey()+":"+itemsEntry.getValue());
		}
		System.out.println();
		
		Iterator<Map.Entry<Integer, String>>itemsEntryIterator=items.entrySet().iterator();
		while(itemsEntryIterator.hasNext()) {
			System.out.println(itemsEntryIterator.next()+"1");
		}
		
		System.out.println();
		Iterator<Map.Entry<Integer, String>>itemsEntryIterator1=items.entrySet().iterator();
		while(itemsEntryIterator1.hasNext()) {
			Map.Entry<Integer, String> entry=itemsEntryIterator1.next();
			System.out.println(entry.getKey()+":"+entry.getValue()+"2");
		}
		
		
		
	}

}
