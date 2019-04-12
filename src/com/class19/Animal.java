package com.class19;
public class Animal {
	/*
	 * Create a class call Animal have properies like breed, weight, age, name and
	 * methods line canBark,isWild 
	 * make the name variable static
	 * Create another class called Application from this application class create 3
	 * diffrent instances/objects of it and print the properties and
	 * functions/methods
	 */
	String breed = "Rottweiler";
	static String name = "Koda";
	int weight = 31;
	int age = 3;
	void canBark() {
		System.out.println(breed + " named " + name + " can bark");
	}
	static boolean isWild() {
		return false;
	}}
