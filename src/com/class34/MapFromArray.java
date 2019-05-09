package com.class34;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFromArray {

	public static void main(String[] args) {
		// 1 2 3 4 5 6
		String[] names = { "Mehmet", "Asha", "Amina", "Omar", "Siyar", "Danny" };

		Map<Integer, String> nameMap = new LinkedHashMap<>();

		int key = 1;

		for (String name : names) {
			nameMap.put(key, name);
			key++;
		}
		System.out.println(nameMap);
		// print key and values using entrySet(loop && Iterator)
		/*
		 * //map-->using entrySet--> Set-->any collection has iterator method-->Iterator
		 * 
		 * Iterator<Map.Entry<String, Integer>> it=groceryMap.entrySet().iterator();
		 * while(it.hasNext()) { Map.Entry entry=it.next(); String
		 * valueFromMap=entry.getKey()+" and value is "+entry.getValue();
		 * System.out.println(valueFromMap);
		 */

		Iterator<Map.Entry<Integer, String>> nameIt = nameMap.entrySet().iterator();
		while (nameIt.hasNext()) {
			Map.Entry nameEntry = nameIt.next();
			System.out.println(nameEntry.getKey() + ":" + nameEntry.getValue());
		}

		for (Map.Entry<Integer, String> name1 : nameMap.entrySet()) {
			System.out.println(name1.getKey() + ":::" + name1.getValue());
		}

	}

}
