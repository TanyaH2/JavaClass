package com.class25;

public class Casting {

	public static void main(String[] args) {

		// implicit/Automatic/Widening---compiler takes care of conversion\
		double a = 10;
		System.out.println(a);

		// explicit/Manual/narrowing---programmer takes care of conversion, compiler
		// won't do it
		double b = 10.0;
		int c = (int) b;
		System.out.println(c);
		
		int i=-130;
	    // byte by=130; --->compiler won't allow it
		
		byte by=(byte)i;
		System.out.println(by);

		//UpCasting  -->  --- compiler  takes care of conversion
		Payment pay = new MasterCard();
		
		//MasterCard mc=new Payment();  ---> Compiler won't allow it
		
		//DownCasting-->  ---programmer takes care of conversion, compiler
		MasterCard mc=(MasterCard) new Payment();
		
	}

}
