package com.class08;

public class BreakContinue {
public static void main(String[] args) {
	
	
	//  Break
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);  //alteration
		}
	
	System.out.println("------------------");
	
	
	//  Continue
		for (int i = 0; i < 6; i++) {
			if (i == 2 || i==4) {
				continue;
			}
			System.out.println(i);
		}

		System.out.println("------------------");
		//I want to print number from 1 to 20 but skip the ones that divisible by 3
		
		
		
		for (int a=1; a<=20; a++) {
			if (a%3==0) {
				continue;
			}
		System.out.println(a);
		}
		
		
		
		
	}
}
