package com.class30;

import java.util.ArrayList;
import java.util.Iterator;



public class GetAllValuesFromArrayList {
	public static void main(String[] args) {

		ArrayList<String> task = new ArrayList<String>();
		task.add("Jon");
		task.add("Arya");
		task.add("Briane");
		task.add("Khal Drogo");
		task.add("Daenerys");

		//  1 way		
		System.out.println("-----1 way using for loop-----");
		for (int i = 0; i < task.size(); i++) {
			System.out.println(task.get(i));
		}
		
		//  2 way		
		System.out.println("-----2 way using enhanced for loop-----");
		for (Object names : task) {
			System.out.println(names);
		}
		
		//  3 way
		System.out.println("-----3 way using iterator-----");
		Iterator <String> it=task.iterator();
		boolean check=it.hasNext();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
