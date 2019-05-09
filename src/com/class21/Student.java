package com.class21;

/*
 * 2.  Create a Class called Students

Create three  variables  studentName , studentID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
 */
public class Student {

	String name;
	int studentID;
	static int NumberOfStudents;

	public static void main(String[] args) {
		//Student stud = new Student();
		Student stud1 = new Student();
		stud1.name = "Bob";
		stud1.studentID = 1176320001;
		Student.NumberOfStudents++;
		
		Student stud2 = new Student();
		stud2.name = "Linda";
		stud2.studentID = 1176320024;
		NumberOfStudents++;
		
		Student stud3 = new Student();
		stud3.name = "Roko";
		stud3.studentID = 1157680651;
		NumberOfStudents++;
				
	
		System.out.println("Total number of students is " + NumberOfStudents+".");
	

	
	}
	
}
