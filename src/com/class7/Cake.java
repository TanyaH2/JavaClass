package com.class7;

public class Cake {

//	   1. Declare variable and increase by 100 using shorthand operator
	
//     2. Declare variable and decrease by 67 using shorthand operator
	
//     3. Declare variable cakePiece=11 and divide cakePiece between 4 	
//     people using shorthand operator
//     each person should get an equal piece of cake
	
//     4. Declare variable cakePiece=25 and divide cakePiece between 7 people
//     using shorthand operator found out how many pieces of cake left after 
//     it was distributed equally among 7 people
	public static void main(String[] args) {
		
		//1
		int x=32;
		x+=100;
		System.out.println(x);
		
		//2
		int y=699;
		y-=67;
		System.out.println(y);
		
        //3
		int cakePiece=11; //or double
		cakePiece/=4;
		System.out.println(cakePiece);
		
		//?@#
		int z=3234;
		z*=0;
		System.out.println(z);
		
		//4
		int cakePiece1=25;
		cakePiece1%=7;
		System.out.println(cakePiece1);
		
		
		
		
	}
}
