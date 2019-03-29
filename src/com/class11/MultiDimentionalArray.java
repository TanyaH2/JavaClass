package com.class11;

public class MultiDimentionalArray {
	public static void main(String[] args) {

		// creating 2D array using new keyword

		int[][] d = new int[4][4];// 4*4=16 elements
		// 1row
		d[0][0] = 12;
		d[0][1] = 13;
		d[0][2] = 14;
		d[0][3] = 15;
		// 2row
		d[1][0] = 1;
		d[1][1] = 2;
		d[1][2] = 3;
		d[1][3] = 4;
		// 3row
		d[2][0] = 5;
		d[2][1] = 10;
		d[2][2] = 15;
		d[2][3] = 20;
		// 4row
		d[3][0] = 100;
		d[3][1] = 200;
		d[3][2] = 300;
		d[3][3] = 400;

		System.out.println(d[1][2]);
		System.out.println(d[3][2]);
		System.out.println(d[2][3]);

		System.out.println("------------------------");
		int[][] q = { 
				    { 12, 13, 14, 15 }, 
				    { 1, 2, 3, 4 }, 
				    { 5, 10, 15, 20 }, 
				    { 100, 200, 300, 400 } 
				    };
		
		System.out.println(q[3][1]);
		System.out.println(q[0][0]);
		
		System.out.println("------------------------");

		String[][]groups= {
				{ "Jawid","Mustafa","Amina", "Mahri", "Emily","Ahmad"},
				{"Bilal","Shaban","Asmit","Sasha","Olga","Moe"},
				{"Tanya", "Aigerim", "Mehmet", "Manel", "Gulam"}
		};
		System.out.println("Code Crushers: \n"+groups[2][0]+" "+groups[2][1]+" "+groups[2][2]+" "+groups[2][3]+" "+groups[2][4]);
		System.out.println("------------------------");

		
		
//		1. Create a 2D array where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Trump.
//		After storing values print the following:
//		Mrs Smith, Mr Trump, Ms Jackson, Miss Jordan.
		
  String [][]name=new String[4][4];
        
        name[0][0]="Mr.";
        name[0][1]="Mrs.";
        name[0][2]="Ms.";
        name[0][3]="Miss.";
        
        name[1][0]="Smith";
        name[1][1]="Jordan";
        name[1][2]="Jackson";
        name[1][3]="Trump";
        
        System.out.println(name[0][1]+" "+name[1][0]);
        System.out.println(name[0][0]+" "+name[1][3]);
        System.out.println(name[0][2]+" "+name[1][2]);

		
		
		String[][] names= {{"Mr.","Mrs.","Ms.","Miss."},
				          {"Smith","Jordan", "Jackson", "Trump"}};
		System.out.println(names[0][1]+" "+names[1][0]);
		System.out.println(names[0][0]+" "+names[1][3]);
		System.out.println(names[0][2]+" "+names[1][2]);
		System.out.println(names[0][3]+" "+names[1][1]);
		
		
		System.out.println("-------------------------------");
		
	//	Create a 2D array that first row will contain 4 names and second row will contain grades.
//		Then you program should print name of the students that has as an A and B grade
		
	String [][] grade= {{"Tanya", "Bob", "Will", "Nat"},{"A","C","B","D"}};
			
		System.out.println(grade[0][0]+"\n"+grade[0][2]);
		
		
		
		
		
		
		
		
		
		
		

	}
}
