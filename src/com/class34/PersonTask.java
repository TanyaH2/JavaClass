package com.class34;

/*
 * Create a Person class with following private fields: name, lastName, age, salary.
 * Variables should be initialized through constructor.
 * Inside the class also create a method to print user details.
 * In Test Class create a Map to store personId and a Person Object. 
 * Print each object details
 */
public class PersonTask {
	private String name;
	private String lastName;
	private int age;
	private int salary;
	public PersonTask(String name, String lastName, int age, int salary) {
		this.name = name;
		this.lastName=lastName;
		this.age=age;
		this.salary=salary;
	}

	
public void personDetails() {
	System.out.println(name+lastName+" is "+age+" years old and earns "+salary+" yearly");
}

}
