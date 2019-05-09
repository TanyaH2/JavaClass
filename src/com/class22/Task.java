package com.class22;

public class Task {
	/*
	 * 1. Write a program that will have a constructor: one with parameters and
	 * second without any parameters. Create a separate Test class where you will
	 * execute both of the constructors.
	 * 
	 * 2. Write a java program of Class Students that takes students name and 3
	 * subject grades. Inside your class also have a method to Calculate Average
	 * Grade. Test Student class for 5 different students with different marks. Your
	 * program should print an average mark of each students name. NOTE: please male
	 * different names for instance and local variables.
	 * 
	 * 3. Write a program that will have a private default constructor class and
	 * create 2 objects of this class: 1 - inside same class; 2 - from outside the
	 * class.
	 * 
	 * 4. Write program that have static constructor and observe result.
	 */
	/*
	 * public - ACCESS MODIFIER static- NON-ACCESS MODIFIER void - RETURN TYPE main
	 * - name of a method String [] args - parameters - array of Strings with name
	 * args
	 * 
	 * -----------------------------------
	 * 
	 * Car obj = new Car();
	 * 
	 * Car - CLASS NAME obj - REFERENCE VARIABLE/OBJECT NAME = - ASSIGNING OPERATOR
	 * new = KEYWORD THAT CREATES AN OBJECT Car() - CONSTRUCTOR
	 * 
	 * 
	 * Constructor will initialize object and it will give default values to all
	 * uninitialize variables(global);
	 * 
	 * 
	 * String/Object - null boolean - false int - 0
	 * 
	 * If you do not create ANY CONSTRUCTOR --> COMPILER WILL CREATE 1 DEFAULT
	 * CONSTRUCTOR FOR YOU
	 * 
	 * If you create a constructor --> COMPILER WILL NOT CREATE ANY DEFAULT
	 * CONSTRUCTOR
	 * 
	 * The main purpose of CONSTRUCTOR is to initialize instance variables
	 * 
	 * We cannot make a constructor as static When we make a private constructor, we
	 * can instantiate the class within itself, but won't b able to instantiate it
	 * in different classes
	 * 
	 * - - - - - - - - - - - - - - - - - - -
	 * 
	 * CONSTRUCTOR VS METHOD
	 * 
	 * 1- Constructor MUST be same name as a class, whereas method can have ANY
	 * name.
	 * 
	 * 2- Constructor CANNOT have a return type not even void, whereas method MUST
	 * have return type.
	 * 
	 * 3- Constructor CANNOT be Static, whereas methods can be Static or non Static.
	 * 
	 * 4- Constructor is getting called AUTOMATICALLY, whereas methods needs to be
	 * called.
	 * 
	 * 5- If we don't define a constructor --> compiler will create 1 default for
	 * you, whereas for methods compiler WON't create it.
	 * 
	 * 
	 * SIMILARITY
	 * 
	 * 1- Both Constructor & Methods HAVE/MIGHT NOT HAVE parameters
	 * 
	 * 2- Access modifiers can be used
	 */

	// 1
	Task() {
		System.out.println("Constractor without parameters");
	}

	Task(String a, int z, String w, int q) {
		System.out.println("Constractor with parameters " + a + "-" + z + " and " + w + "-" + q);

	}

	public static void main(String[] args) {

		Task obj = new Task();
		Task obj2 = new Task("Roxy", 18, "Koda", 3);

	}

}
