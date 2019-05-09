package com.class33;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetOverview {

	public static void main(String[] args) {

		Set<String> classDays = new HashSet<>();    //   ----> Printing randomly 
	//	Set<String> classDays = new LinkedHashSet<>();   ----> Printing in insertion order
	//	Set<String> classDays = new TreeSet<>();         ----> Printing in alphabetical order/ascending order/ a...z/ 0..9

		classDays.add("Tuesday");
		classDays.add("Wednesday");
		classDays.add("Thursday");
		classDays.add("Saturday");
		classDays.add("Sunday");

		System.out.println(classDays);

		System.out.println("---advanced for loop---");
		for (String days : classDays) {
			System.out.println(days);
		}
		System.out.println("---iterator for loop---");

		Iterator<String> it = classDays.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--- for loop---");

	}

}
