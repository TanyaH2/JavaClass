package com.class26;

public class StudentThis {
	
String fullName;
int age;

//this is used to differentiate between(b/w) local and instant variables  if they have the same names
public StudentThis(String fullName, int age) {
    this.fullName=fullName;
    this. age=age;      
}

//public StudentThis(String name, int ageNum) {
//     fullName=name;
//      age=ageNum;      
//}
public void displayDetails() {
	System.out.println("Student full Name is "+ fullName+ " and the age is "+ age);
}

public static void main(String[] args) {
	StudentThis obj=new StudentThis("John Snow", 30);
	obj.displayDetails();
}
}
