package com.class21;

/*
 * Create a Class called Employee:
Create three  variables  eID , salary and set the CEO to “Sumair”
Create two objects of the class Employee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
 */
public class Employee {
	
	static String CEO="Sumair";
	
	int eID;
	int salary;
	
	public static void main(String[] args) {
		
		Employee E1=new  Employee();
		Employee E2=new Employee();
		E1.eID=10003;
		E2.eID=10004;
		E1.salary=60;
		E2.salary=67;
		E1.eSC();
		E2.eSC();
		
		
	}
public void eSC() {
System.out.println(eID+" has a salary of $"+salary+" an hour"+" and his CEO is "+CEO);


}

}
