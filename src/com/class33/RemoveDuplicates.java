package com.class33;
import java.util.*;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.List;
//import java.util.Set;
//import java.util.TreeSet;

/*
 * How can you remove all duplicates from ArrayList?

List<String> aList=new ArrayList<String>();
        aList.add(“John”);
        aList.add(“Jane”);
        aList.add(“James”);
        aList.add(“Jasmine”);
        aList.add(“Jane”);
        aList.add(“James”);
 */
public class RemoveDuplicates {
	public static void main(String[] args) {
		List<String> aList = new ArrayList<String>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");

		Set<String> s = new HashSet(aList);
		System.out.println("Printing with HashSet: " + s);

		Set<String> z = new LinkedHashSet(aList);
		System.out.println("Printing with LinkedHashSet: " + z);

		Set<String> q = new TreeSet(aList);
		System.out.println("Printing with TreeSet: " + q);

	}
}
