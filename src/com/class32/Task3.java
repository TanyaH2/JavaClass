package com.class32;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

//Also MUST look over Map interface and HashMap class.
/*
 * For Saturday please complete the following tasks:
1. Create an ArrayList of Strings and using Collections class sort the values of that ArrayList.

2. Create an array of Strings and using Arrays class  class sort the values of that array of Strings.

3. Create an HashSet of cities and add duplicates into it.
    Retrieve all values from hashset in 2 different ways.
    Retrieve all values in alphabetical order.
 */
public class Task3 {
	public static void main(String[] args) {

		System.out.println("-------3rd task--------");
		HashSet<String> hset = new HashSet<String>();
		hset.add("Kiev");
		hset.add("Paris");
		hset.add("Manassas");
		hset.add("DC");

		System.out.println("Original " + hset);
		hset.add("DC");
		hset.add("Kiev");
		System.out.println("With Duplicates " + hset);

		// Retrieve all values from hashset in 2 different ways.
		// 1st way
		Iterator<String> it = hset.iterator();
		while (it.hasNext()) {
			System.out.println("Iterator " + it.next());
		}

		// 2nd way
		for (String st : hset) {
			System.out.println("Enhanced loop " + st);
		}

		// Retrieve all values in alphabetical order.
		// TreeSet
		TreeSet<String> tree = new TreeSet<String>(hset);
		for (String st1 : tree) {
			System.out.println("TreeSet alphabetical sorting " + st1);
		}
		// Retrieve all values in alphabetical order...
		// Collection
		List<String> its = new ArrayList<String>(hset);
		Collections.sort(its);
		System.out.println("Using an Array List with collections.sort() " + its);

	}

}
