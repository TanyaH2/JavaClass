package com.class12;

public class StringManipulations2 {
	public static void main(String[] args) {

//      STRINGS
System.out.println("-------.length()-------");
//// .length()) Function/ Method - returns number of characters
		String str = "Syntax";

		int lengthOfString = str.length();
		System.out.println(lengthOfString);

		String str11 = "Syntax Technologies";
		int len = str11.length();
		System.out.println(len);

		String str12 = "Welcome, Students!";
		System.out.println(str12.length());

		String str13 = "Hello";

////String Case converter to Upper or to Lower
		System.out.println("-------.toUpperCase()/.toLowerCase()-------");
// .toUpperCase() -->convert all characters to UpperCase()
		String newString = str13.toUpperCase();
		System.out.println(newString);
// .toLowerCase() -->convert all characters to LowerCase()
		String newString1 = str13.toLowerCase();
		System.out.println(newString1);

		
//// equals Compare two strings--> if strings are equal-true, if strings  are NOT equal-->false
		System.out.println("-------.equals()-------");	
// .equals()  -->case sensitive
		String str14 = "Hello";
		String str15 = "hello";

		boolean equality = str14.equals(str15);
		System.out.println(equality);
		System.out.println("-------.equalsIgnoreCase()-------");
//// .equalsIgnoreCase() -->ignoring the case
		String expect = "Chrome";
		String actual = "chrome";

		boolean equal = expect.equalsIgnoreCase(actual);
		System.out.println(equal);

//// .contains()-->Checks for specific value in the String
		System.out.println("-------.containes()-------");
// if value
		String str111 = "Good morning, students!";
		boolean con = str111.contains("morning");
		System.out.println(con);

		String present = "Welcome, Asel";
		String neededVal = "WELCOME,";
		// boolean flag=present.contains("Welcome,");
		boolean flag = present.contains(neededVal);
		System.out.println(flag);

		boolean flag1 = present.toLowerCase().contains(neededVal);
		System.out.println(flag1);

//// startsWith() endsWith() ---> case sensitive
		System.out.println("-------.startsWith()/.endsWith()-------");
// true-false
		String str1 = "syntax";

		boolean starts = str1.startsWith("s");

// .startsWith()
		System.out.println(starts);
// .endsWith()
		System.out.println(str1.endsWith("x"));

		System.out.println(str1.endsWith("y"));

		
		System.out.println("-------.isEmpty()-------");
//// .isEmpty() Checks if string is empty/ string=0 is empty-true
		String str2 = "Hello";
		boolean isEmpty = str2.isEmpty();
		System.out.println(isEmpty);

		System.out.println("-------.concat()-------");
//// .concat() --> concatenate one string to the end of another
		String str3 = "Hello ";
		String str4 = "Ali";

		System.out.println(str3 + str4);
		System.out.println(str3.concat(str4));

		System.out.println("-------.trim()-------");
//// .trim() --> Trims spaces at the beginning or/and at the end
		String expect1 = "You may qualify for a multi-policy discount!";
		String actual1 = " You may qualify for a multi-policy discount! ";
		
// System.out.println(expect1.equals(actual1));
		actual = actual1.trim();

		System.out.println(expect.equals(actual));

	}
}
