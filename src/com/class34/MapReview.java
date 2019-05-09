package com.class34;

import java.util.*;

public class MapReview {
//// create a map of grocery products and it is quantity
	public static void main(String[] args) {
		Map<String, Integer> groceryMap = new LinkedHashMap<>();
		groceryMap.put("Wine", 5);
		groceryMap.put("Hard Cider", 12);
		groceryMap.put("Meat", 7);
		groceryMap.put("Coffee", 2);
		groceryMap.put("Bread", 1);
		groceryMap.put("Cheese", 4);

		System.out.println(groceryMap);
		groceryMap.put("Sushi", 7);
		System.out.println(groceryMap.size());
		groceryMap.replace("Sushi", 13);
		System.out.println(groceryMap);
		groceryMap.remove("Cheese");
		System.out.println(groceryMap);

		// retrieving all keys+values using keySet
		Set<String> keySet = groceryMap.keySet();
		for (String key : keySet) {
			System.out.println("Key is- " + key + " and value is-" + groceryMap.get(key));
		}
		Iterator<String> keyIt = keySet.iterator();
		while (keyIt.hasNext()) {
			String key = keyIt.next();
			System.out.println(key + ":" + groceryMap.get(key));
		}

		for (String key : groceryMap.keySet()) {
			System.out.println("Key is- " + key + " and value is-" + groceryMap.get(key));
		}

		Iterator<String> keyIt1 = groceryMap.keySet().iterator();
		while (keyIt1.hasNext()) {
			String key = keyIt1.next();
			System.out.println(key + ":" + groceryMap.get(key));
		}
		// retrieving all values using;
//			Collection<Integer> valCollection=groceryMap.values();
//			for(Integer value:valCollection) {
//				System.out.println(value);
//			}
		for (Integer value : groceryMap.values()) {
			System.out.println(value);
		}
		Iterator<Integer> valueIt = groceryMap.values().iterator();
		while (valueIt.hasNext()) {
			System.out.println(valueIt.next());
		}
		
		// retrieving all keys+values using entrySet();
		
		//Set<Map.Entry<String, Integer>> setOfEntries =groceryMap.entrySet() ====  groceryMap.entrySet()
		
				for(Map.Entry<String, Integer> entry:groceryMap.entrySet()) {
					String mapValue=entry.getKey()+" == "+entry.getValue();
					System.out.println(mapValue);
				}
				//String a="Hello"+1;
				//map-->using entrySet--> Set-->any collection has iterator method-->Iterator
				Iterator<Map.Entry<String, Integer>> it=groceryMap.entrySet().iterator();
				while(it.hasNext()) {
					Map.Entry entry=it.next();
					String valueFromMap=entry.getKey()+" and value is "+entry.getValue();
					System.out.println(valueFromMap);

	}
	}
}
