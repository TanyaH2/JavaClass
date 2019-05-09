package com.class22;
/* 
 * 2.
 * Write a java program of Class Students that takes students name and 3 subject
* grades. Inside your class also have a method to Calculate Average Grade. Test
* Student class for 5 different students with different marks. Your program
* should print an average mark of each students name. NOTE: please make
* different names for instance and local variables.
*/

public class Students {

	 String studName;
	int grade1;
	int grade2;
	int grade3;

	public Students(String name, int a, int b, int c) {// local variable and cant be visible anywhere else
		studName =name;                               // that's why we are reassigning
		grade1 = a;
		grade2 = b;
		grade3 = c;
	}

	public void averageGrade() {
		int average = (grade1 + grade2 + grade3) / 3;
		System.out.println("Student " + studName + " has an average grade of " + average);
	}

}

/*
 * My changed
 * public class Task4SecondWay {
	
	public String studentName;
	int grade1, grade2, grade3;
  
	public Task4SecondWay() {
	calculateGrades("Tanya",100,100,100);
	calculateGrades("Ali",75,90,100);
	calculateGrades("David",20,49,33);
	calculateGrades("Mehmet",98,90,30);
	calculateGrades("Ahmet", 90, 80, 30);
	}
	
	public static void calculateGrades(String studentName, int grade1, int grade2, int grade3) {
		int avrg = (grade1 + grade2 + grade3) / 3;
		System.out.println("Student " + studentName + " has an average grade of " + avrg);
	}
	
	public static void main(String[] args) {
		Task4SecondWay st1 = new Task4SecondWay();
	}
}
 */

////////Mehmet way
/*
 * String studentName; int sub1, sub2, sub3;
 * 
 * static int calculate (int sub1, int sub2, int sub3) { int avrg =
 * (sub1+sub2+sub3)/3; return avrg; }
 * 
 * public Task4_Students(String studentName,int sub1, int sub2, int sub3) { 
 * int a = sub1 , b = sub2 , c = sub3; 
 * System.out.println(studentName+ " has "+calculate(a,b,c)+ "  average points"); }
 * 
 * public static void main(String[] args) { 
 * Task4_Students student1 = new Task4_Students("Mehmet", 90, 100, 20); 
 * Task4_Students student2 = new Task4_Students("Myahri", 75, 100, 35); 
 * Task4_Students student3 = new Task4_Students("Bekir", 10, 0, 80); 
 * Task4_Students student4 = new Task4_Students("Tetiana", 99, 99, 30); 
 * Task4_Students student5 = new Task4_Students("Omer", 10, 100, 20); 
 * } 
 * }
 * 
 * 
 * 
 * 
 */
