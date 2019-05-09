package com.class33;

import java.util.*;

/*
 * Create a map of countries with its capital. 
 * Print all keys and values from a country map using for each loop and iterator.
 * Print all values from a country map using for each loop and iterator.
 */
public class MapOfCountries {
	public static void main(String[] args) {
		/*
		 * Map<Integer, String> map=new HashMap<>(); map.put(1, "A");
		 */
		Map<String, String> map = new HashMap<>();
		map.put("Usa", "Washinghton DC");
		map.put("Ukraine", "Kiev");
		map.put("England", "London");
		map.put("Russia", "Moscow");

		System.out.println(map + "\n");
		System.out.println("Print all keys and values from a country map using for each loop and iterator.");
		Set<String> setMap = map.keySet();
//Print all keys and values from a country map using for each loop and iterator.
		Collection<String> cap1 = map.values();
		for (String capitals : cap1) {
			System.out.println(capitals + ":" + map.get(capitals));
		}
		
		System.out.println();
		Iterator<String> capIt1 = setMap.iterator();
		while (capIt1.hasNext()) {
			String Caps = capIt1.next();
			System.out.println(Caps + ":" + map.get(Caps) + "\n");
		}

		System.out.println("Print all values from a country map using for each loop and iterator.");
//Print all values from a country map using for each loop and iterator.
		Collection<String> cap = map.values();
		for (String capitals : cap) {
			System.out.println(capitals + " ");
		}
		
		System.out.println();
		Iterator<String> capIt = cap.iterator();
		while (capIt.hasNext()) {
			System.out.println(capIt.next());
		}

	}
}
