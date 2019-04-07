package com.class04;

public class NestedIf1 {
public static void main(String[] args) {

//Declare variable for GPA and having a diploma
//if user has a diploma --> congratulations --> 
// If GPA is higher 3.5 --> Hire person-->
// else do not hire.
	
	double gpa=3.9;
	double expectedGpa=3.7;
	boolean hasDiploma=true;
	
	if (hasDiploma) {
		System.out.println("Congratulation");
		if (gpa>expectedGpa) {
			System.out.println("You're hired");
		}else {
			System.out.println("You're not hired");
		}
		
    }else {
		System.out.println("Please get a degree");
	}
	
}
}
