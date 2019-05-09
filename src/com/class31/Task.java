package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 1.Create an arraylist of cars and retrieve all the values using 4 different ways.

    2.Create an arrayList of words. Remove every word that ends with “e”.

     3.Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

      4.Create an arrayList of even numbers from 1 to 50. Using Integer remove any number that is divisible by 5 from that arrayList.
 */
public class Task {
	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Nissan");
		cars.add("Ford");
		cars.add("Toyota");
		cars.add("Jeep");
		cars.add("BMW");
		/**
		 * First Task 1.Create an arraylist of cars and retrieve all the values using 4
		 * different ways.
		 */
		System.out.println("------first task------");
		// 1
		System.out.println("----1----for loop --------");
		for (int a = 0; a < cars.size(); a++) {
			// int car=a;
			System.out.println(cars.get(a));
		}
		// 2
		System.out.println("----2----enhaced loop --------");
		for (String car : cars) {
			System.out.println(car);
		}

		// 3
	System.out.println("----3----iterator --------");
	Iterator car=cars.iterator();
	while( car.hasNext()) {
		//int number=cars.next();
		System.out.println( car.next());
	}

		// 4
		System.out.println("----4----using while loop --------");

		int a = 0;
		while (cars.size() > a) {
			String car1 = cars.get(a);
			System.out.println(car1);
			a++;
		}

		/**
		 * Second TAsk 2.Create an arrayList of words. Remove every word that ends with
		 * “e”.
		 */

		System.out.println("------second task------");
		ArrayList<String> words = new ArrayList<String>();
		words.add("Create");
		words.add("ArrayList");
		words.add("Words");
		words.add("Remove");
		words.add("Every");

		Iterator<String> iterator = words.iterator();
		while (iterator.hasNext()) {
			String word = iterator.next();
			if (word.endsWith("e")) {
				iterator.remove();
			}
		}
		System.out.println(words);

		System.out.println("------third task------");

		/**
		 * Third Task
		 * Create an arrayList of drinks. If any drink has letter “a” or “e” replace it
		 * with water.
		 */
		
		ArrayList<String> drink = new ArrayList<String>();
		drink.add("Wine");
		drink.add("Coffee");
		drink.add("Tekila");
		drink.add("Rum");
		drink.add("Whisky");
		
		for (int i=0; i<drink.size(); i++) {
			String drinks=drink.get(i);
			if (drink.contains("a")||drink.contains("e")) {
			drinks="water";	
			}
			}
		System.out.println(drink);
		
	
	/**
	 * Forth task
	 * Create an arrayList of even numbers from 1 to 50. 
	 * Using Iterator remove any number that is divisible by 5 from that arrayList.	
	 */
		
		ArrayList<Integer> list=new ArrayList<>();
		for (int z=1;z<=50; z++) {
			if(z%2==0) {
				list.add(z);
			}
		}
		
		for (int z=2; z<=50; z+=2) {
				list.add(z);
		}
		
		Iterator <Integer> it=list.iterator();
		while(it.hasNext()) {
			int num=it.next();
			if(it.next()%5==0) {
				it.remove();
			}
		}
		System.out.println(list);
		
		
		
	}
	}
