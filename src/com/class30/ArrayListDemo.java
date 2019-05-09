package com.class30;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<String> greetings = new ArrayList<String>();
		greetings.add("Hello");
		greetings.add("Welcome");
		greetings.add("Hi");
		greetings.add("Bye");

		System.out.println(greetings.get(1));
		System.out.println(greetings.size());

		System.out.println(greetings.add("+How are you?+")); // true

		// collections- growable in size
		greetings.add("How are you?");
		greetings.add("How are you?");
		greetings.add("How are you?");
		System.out.println(greetings.size());

		System.out.println("------for loop------");

		for (int i = 0; i < greetings.size(); i++) {
			System.out.println(greetings.get(i));
		}

		System.out.println("------enhaced loop------");
		for (String greetWords : greetings) {

			System.out.println(greetWords);
		}
		ArrayList<String> str=new ArrayList<String>();
		str.add("hi");
		str.add("yo");
		str.add("sup");
		str.add("yolo");
		str.add("boop");

		str.remove(0);
		str.remove(2);
        str.remove(4);
		
		for (String st:str){
		
		    System.out.println(st);
		}
		  
	}
}
