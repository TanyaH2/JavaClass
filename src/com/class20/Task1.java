package com.class20;

public class Task1 {
	public static void main(String[] args) {

		// 1.
		Task1 obj = new Task1();
		String reverse = obj.str("Tanya");
		System.out.println(reverse);

		//2.
//		String palidr = obj.palidrome("madams");
//		System.out.println(palidr);

		//3.
		String [] array=obj.getWordsFromString("Have a good night");
		for(int  a=0; a<array.length;  a++) {
		System.out.println(array[a]+"-");
	}
		for(String words:array) {
			System.out.println(words);
					}
		
	
	}
	
	

	/*
	 * 1.Create a method that will take 1 parameter as a String and return reversed
	 * String. Method should be visibly only within same package.
	 * 
	 * 2.Create a method that will take a String and return whether String is
	 * palindrome or not. Method should available to all classes within your
	 * projects.
	 * 
	 * 3.Create a method that will take a string and return array of words from that
	 * string. Method should be available only within same class.
	 */

	// 1.
	 String str(String strR) {
		String rev = "";
		for (int i = strR.length(); i >0; i--) {
			rev = rev + strR.substring(i - 1, i);
		}
		return rev;
	}
	 
//	  String str(String strR) {
//		String rev = "";
//		for (int i = strR.length()-1; i >=0; i--) {
//			rev = rev + strR.charAt(i);
//		}
//		return rev;
//	}
	  

	// 2.
	 
//	public String palidrome(String pal) {
//		String rev1 = "";
//		String p = "";
//
//		for (int z = pal.length(); z > 0; z--) {
//			rev1 = rev1 + pal.substring(z - 1, z);
//			if (rev1.contentEquals(pal)) {
//				p = "It is  a  Palidrome";
//			} else {
//				p = "It is  not a Palidrome";
//			}
//		}
//		return p;
//
//	}
	 
	
	//3.

private String[]  getWordsFromString (String str) {
	String [] words=str.split("  ");
	
			return words;
}










}
