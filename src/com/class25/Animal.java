package com.class25;

public class Animal {
	public static void whoAmI() {
		System.out.println("I am an animal");
	}
}

class Puppy extends Animal {

	// can NOT override static method with instance
//	public void whoAmI{
//		System.out.println("I am a puppy");
//	}
}

class Monkey extends Animal {
	public static void whoAmI() {
		System.out.println("I am a monkey");
	}

}
