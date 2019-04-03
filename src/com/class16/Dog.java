package com.class16;

public class Dog {

	/*
	 * Create a Dog Class and create 3 different objects of it: Pitbul Rottweiler
	 * Pug With specific attributes: Breed, color, size, age, tail Behaviors: bark,
	 * eat, sleep, run
	 */
	String breed, color, size, tail;
	int age;

	public static void main(String[] args) {

		System.out.println("-----Pitbul-----");

		Dog dog1 = new Dog();
		dog1.breed = "Pitbul";
		dog1.color = "Tan and White";
		dog1.size = "Medium-Large";
		dog1.age = 16;
		dog1.tail = "Long";

		System.out.println("My first dog is a "+dog1.breed+" and her color is "+dog1.color+
				", she is "+ dog1.size+", "+dog1.age+
				" months old and  her tail is "+dog1.tail);
		dog1.bark();
		dog1.eat();
		dog1.sleep();
		dog1.run();

		System.out.println("-----Rottweiler-----");

		Dog dog2 = new Dog();
		dog2.breed = "Rottweiler";
		dog2.color = "Black with Mahogany";
		dog2.size = "Large";
		dog2.age = 3;
		dog2.tail = "Docked";

		System.out.println("My second dog is a "+dog2.breed+" and her color is "+dog2.color+
				", she will be "+ dog2.size+" size when full grown, she only "+dog2.age+
				" months old and her tail is "+dog2.tail);
		dog2.bark();
		dog2.eat();
		dog2.sleep();
		dog2.run();

		System.out.println("-----Pug-----");

		Dog dog3 = new Dog();
		dog3.breed = "Pug";
		dog3.color = "Fawn with Black";
		dog3.size = "Small";
		dog3.age = 2;
		dog3.tail = "Short and Curly";

		System.out.println("We don't have a "+dog3.breed+" puppy yet but when we will, he or she will be "+dog3.color+
				" color, "+ dog3.size+" and "+dog3.age+
				" months old and  her/his tail will be "+dog3.tail);
		dog3.bark();
		dog3.eat();
		dog3.sleep();
		dog3.run();

	}

	void bark() {
		if (breed.contentEquals("Pug")) {
			System.out.println("My " + breed + " likes to bark");
		} else {
			System.out.println("My " + breed + " doesn't bark that much");
		}
	}

	void eat() {
		if (breed.contentEquals("Pitbul")) {
			System.out.println("My " + breed + " does't eat a lot");
		} else {
			System.out.println("My " + breed + " always hungry and eats like crazy");
		}
	}

	void sleep() {
		System.out.println("My " + breed + " sleeps a lot");
	}

	void run() {
		if (breed.contentEquals("Pug")) {
			System.out.println("My " + breed + " is lazy and doesn't like to run");
		} else {
			System.out.println("My " + breed + " likes to run a lot");

		}
	}

}
