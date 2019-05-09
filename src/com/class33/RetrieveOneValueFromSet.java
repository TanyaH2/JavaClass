package com.class33;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RetrieveOneValueFromSet {

	public static void main(String[] args) {

		Set<String> cars= new LinkedHashSet<>();
		cars.add("Nissan");
		cars.add("Toyota");
		cars.add("Audi");
		cars.add("BWM");
		cars.add("Ram");
		
		// 1 way:  we convert to the array list
		//  a- to add collection to the ArrayList
		List <String> list=new ArrayList<>(cars);
		System.out.println("List Collection: "+list);
		System.out.println("Printing single value: "+list.get(2));
		// b- 
		List<String> list2= new ArrayList<>();
		list2.addAll(cars);
		list2.add("Ford");
		list2.add("Nissan");
		System.out.println("List2 Collection"+list2);
		
		// 2 way: convert to Array
       Object[] array =cars.toArray();
       System.out.println(array[3]);
		
	}

}
