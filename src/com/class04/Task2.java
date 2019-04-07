package com.class04;

import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	
	//You are a loan specialist and you need to ask user what  is the amount of loans is needed. 
	//If loan is less than 200,000 then you would lend the money otherwise you would reject the client.
	
	int loan;
	
	Scanner quest= new Scanner(System.in);
	System.out.println("How much mone you want to loan?");
	
	loan=quest.nextInt();
	
	if (loan>200000) {
		System.out.println("You are screwed! Go  look somewhere else");
	}else {
		System.out.println("Come get your money, lucky winner!");
	}
			
	
	
}
}
