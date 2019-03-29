package com.class12;

public class StringManipulation3 {
	public static void main(String[] args) {

		// .charAt()--->returns a character at specified index
		String str = "Students";
		char character = str.charAt(7);
		System.out.println(character);

		System.out.println("-------------------");

		for (int a = 0; a < str.length(); a++) {
			System.out.print(str.charAt(a) + ",");
		}

		System.out.println("\r----------------------");
		// .indexOf ---> returnes an index of specified character
		String str1 = "Sunday";
		int index = str1.indexOf("n");
		System.out.println(index);

		String str2 = "Syntax Technology";
		System.out.println(str2.indexOf("Syntax"));// 0
		System.out.println(str2.indexOf("Technology"));// 7
		System.out.println(str2.indexOf(" "));// 6
		System.out.println(str2.indexOf("w"));// -1

		// .substring()--> gives another string from your current string //overload
		String str3 = "Today is Sunday Java class";
		String newString = str3.substring(9);
		System.out.println(newString);

		// .subSequence()--> gives another string from-to
		System.out.println(str3.subSequence(0, 5)); // Today
		System.out.println(str3.subSequence(16, 20)); // Java
		System.out.println(str3.subSequence(9, 20)); // Sunday Java
		System.out.println(str3.subSequence(21, 25)); //class
	}
}
