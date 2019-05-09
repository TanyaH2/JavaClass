package com.class34;

import java.util.*;

public class Task1 {
	/*
	 * 1.Create a Map from array of cities that will sort keys in alphabetical
	 * order. As a key store the name of the city and as a value store the length of
	 * the city name (Example: Paris=5, Moscow =6 etc..). If any city name is more
	 * than 7 characters remove that city ( use entrySet with Iterator ).
	 * 
	 * 2. Write a program to check which employee gets highest salary use hashmap
	 * employee name as key and salary amount as the value. Output example: John
	 * Smith=100000.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cities = { "Kiev", "Manassas", "DC", "Istambull", "Kherson" };
		Map<String, Integer> cityMap = new TreeMap<>();

		for (String city : cities) {
			int value = city.length();
			cityMap.put(city, value);
		}
		System.out.println(cityMap);

		Iterator<Map.Entry<String, Integer>> cityIt = cityMap.entrySet().iterator();
		while (cityIt.hasNext()) {
			Map.Entry cityEntry = cityIt.next();
			System.out.println(cityEntry.getKey() + ":" + cityEntry.getValue());
		}
		System.out.println();
		for (Map.Entry<String, Integer> name1 : cityMap.entrySet()) {
			System.out.println(name1.getKey() + ":::" + name1.getValue());
		}

		System.out.println();
		Iterator<Map.Entry<String, Integer>> cityIt1 = cityMap.entrySet().iterator();
		while (cityIt1.hasNext()) {
			Map.Entry<String, Integer> cityEntry = cityIt1.next();
			if (cityEntry.getValue() > 7) {
				cityIt1.remove();
			}
		}
		System.out.println(cityMap);

		System.out.println();
		for (Map.Entry<String, Integer> name1 : cityMap.entrySet()) {

			System.out.println(name1.getKey() + ":::" + name1.getValue());
		}
//////////////////
		System.out.println("--------Asel's version--------");
		Iterator<Map.Entry<String, Integer>> it=cityMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String,Integer> entry=it.next();
			if(entry.getValue()>7){
				it.remove();
			}
			int num=it.next().getValue();
			if (num>7) {
				it.remove();
			}
			String key=it.next().getKey();
			if (key.length()>7){
				it.remove();
			}
		}
		System.out.println(cityMap);
	}

}
