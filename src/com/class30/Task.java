package com.class30;

import java.util.ArrayList;

public class Task {
	/*
	 * Create a generic ArrayList that will store 5 names into it.
	 * 
	 * Find out whether the given ArrayList is empty or not?
	 * 
	 * Check whether the specific name is present in an ArrayList or not?
	 * 
	 * Find the size of your arrayList and print all values from that
	 */
	public static void main(String[] args) {

		// generic Array that stores only String Object
		ArrayList<String> task = new ArrayList<String>();
		task.add("Jon");
		task.add("Arya");
		task.add("Briane");
		task.add("Khall Drogo");
		task.add("Daenerys");
		// task.add(234); not valid since we have generic arayList of type of String

		System.out.println("------------------------------");
		System.out.println(task.isEmpty());
		System.out.println("------------------------------");

		System.out.println(task.contains("Daeneris"));
		System.out.println("------------------------------");

		System.out.println(task.size());
		System.out.println("------------------------------");

		for (int i = 0; i < task.size(); i++) {
			System.out.println(task.get(i));
		}
		System.out.println("------------------------------");

		for (String names : task) {
			System.out.println(names);
		}

	}

}
