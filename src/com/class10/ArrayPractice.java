package com.class10;

public class ArrayPractice {
	public static void main(String[] args) {

//	1.Create an array of chars and store grades into it: A,B,C,D,E,F. 
//	Then print a grade B (use 2 different ways of creating an array).

		char[] grade = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(grade[1]);

		System.out.println("===========================");
		
		char[] grade1 = new char[6];

		grade1[0] = 'A';
		grade1[1] = 'B';
		grade1[2] = 'C';
		grade1[3] = 'D';
		grade1[4] = 'E';
		grade1[5] = 'F';
		
		System.out.println(grade1[1]);

		System.out.println("---------------------------");
//	2.Create an array of names and store all names of your group. 
//	Then print your name from that array. (use 2 different ways of creating an array).

		String[] names = { "Tanya", "Ayka", "Manel", "Mehmet", "David", "Gulam" };
		System.out.println(names[0]);

		System.out.println("===========================");

		String[] names1 = new String[6];
		
		names1[0] = "Aigera";
		names1[1] = "Manel";
		names1[2] = "Tanya";
		names1[3] = "Mehmet";
		names1[4] = "David";
		names1[5] = "Gulam";
		
		System.out.println(names1[2]);

		String[] group=  new String[5];
		group[0]="Tanya";
		group[1]="Aigera";
		group[2]="Mehmet";
		group[3]="Manel";
		group[4]="Gulam";
		for(int p=0; p<group.length; p++) {
			System.out.println(group[p]);
			}
		
		
//	3.Create an array of words: Java, Saturday, day, coding, is. 
//	Print the following sentence using element of array: “Saturday is Java coding Day”.

//String[] class1= {"Java","Saturday","day","coding", "is"};
//System.out.println(class1[1]+" "+class1[4]+" "+class1[0]+" "+class1[3]+" " +class1[2]);
//		
//
//        System.out.println("===========================");
//
//		String[] class2= new String[5];
//		class2[0]="Java ";
//		class2[1]="Saturday ";
//		class2[2]="day ";
//		class2[3]="coding ";
//		class2[4]="is ";
//		
//		System.out.println(class2[1]+class2[4]+class2[0]+class2[3]+class2[2]);
//		
//		
//		
//		String sentence=class2[1]+class2[4]+class2[0]+class2[3]+class2[2];
//		System.out.println(sentence);
		
		//int size=words.length[5];
		
	   
	}
}
