package com.class34;

import java.util.*;

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
public class Task2 {

	public static void main(String[] args) {

		Map<String, Integer> salaryMap=new HashMap<>();
		salaryMap.put("John", 70000);
		salaryMap.put("James", 80000);
		salaryMap.put("Frank", -900000);
		salaryMap.put("David", 50000);
		salaryMap.put("Jordan", -100000);
		
		//int maxSalary=Integer.MIN_VALUE;
		int maxSalary=0;
		String key=null;
		
		for (Map.Entry<String, Integer> entry:salaryMap.entrySet()) {
			if (entry.getValue()>maxSalary){
				maxSalary=entry.getValue();
				key=entry.getKey();
			}
		}
		System.out.println(maxSalary+" belongs to "+key);
	}
}