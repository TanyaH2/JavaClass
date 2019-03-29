package com.class5;

public class LogicalOr {
public static void main(String[] args) {
	
//	Logical OR ||
//	
//	True OR True = True
//	True OR False = True
//	False OR True = True 
//	False OR False = False
	
//	We have 7 days week
//	if days are from 1-5-->weekend
//	if days from 6-7---> weekend
//	otherwise "Not a valid day"
	
	int day=5;
	
			if(day==1 || day==2 || day==3 || day==4 || day==5) {
				System.out.println("It's a weekday");
			}else if(day==6 || day==7) {
				System.out.println("It's a weekend");
			}else {
			System.out.println("NOT A VALID DAY");
			}
}
}
