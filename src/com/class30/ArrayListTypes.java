package com.class30;

import java.util.ArrayList;

public class ArrayListTypes {

	public static void main(String[] args) {

		// generic Array that stores only String Object
		ArrayList<String> task = new ArrayList<String>();
		task.add("Jon");
		task.add("Arya");
		task.add("Briane");
		task.add("Khall Drogo");
		task.add("Daenerys");
		// task.add(234); not valid since we have generic arayList of type of String

		// non generic arrayList- we can store different types of Objects
		ArrayList alist = new ArrayList();
		alist.add("String"); // String
		alist.add(100); // Integer
		alist.add(100.10); // Double
		alist.add(true); // Boolean
		alist.add('a'); // Character

		for (Object values : alist) {
			System.out.println(values);
		}

		ArrayList<Boolean> booleanArrayList = new ArrayList();
		booleanArrayList.add(true);
		booleanArrayList.add(false);

		for (Object val : booleanArrayList) {
			System.out.println(val);
		}

	}
}
