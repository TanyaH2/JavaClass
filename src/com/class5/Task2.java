package com.class5;

import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	

	
//	Write a program that will read three inputs of scores (quiz, mid term, and final scores) 
//	and determine the grade based on the following rules:
//		if the average score >=90 =>grade=A
//		if the average score >= 70 and <90 => grade=B
//		if the average score>=50 and <70 =>grade=C
//		if the average score<50 =>grade=F
//	
	Scanner sc;
	int a;
	int b;
	int c;
	int d;
	
	sc=new Scanner(System.in);
    System.out.println("what is your quiz score");
    a=sc.nextInt();
    
    System.out.println("what is your mid term score");
    b=sc.nextInt();
    
    System.out.println("what is your final score");
    c=sc.nextInt();
    
    d=(a+b+c)/3;
    
    if(d>=90) {
    	System.out.println("A");
    }else if (d>=70 && d<90) {
    	System.out.println("B");
    }else if (d>=50 && d<70) {
    	System.out.println("C");
    }else {
    	System.out.println("F");
    }
	
	
	
	
	
}
}