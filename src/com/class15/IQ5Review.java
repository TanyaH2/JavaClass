package com.class15;

public class IQ5Review {
public static void main(String[] args) {
	
	
	// 5. Write a java program to reverse String? Reverse a string word by word?
			String str1 = "We are killing it!";
			String rev = "";

			for (int i = str1.length(); i > 0; i--) {
				rev = rev + str1.substring(i - 1, i);

			}
			System.out.println(rev);
			
System.out.println("-------------------");

			String[] a = str1.split(" ");
			String rev2 = "";
			String res = "";
			for (int z = 0; z < a.length; z++) {
				String q = a[z];
				String rev1 = "";
				for (int j = q.length() - 1; j >= 0; j--) {
					rev1 += q.charAt(j);
				}
				rev2 += rev1 + " ";
			}
			System.out.println(rev2 + " ");
			
			System.out.println("-------------------");

			String sentence="The master is speaking ";
			String reverse="";
			for (int i=sentence.length()-1;i>=0;i--) {
				reverse=reverse+sentence.charAt(i);
			}
			String[] words=reverse.split(" ");
			for(int i=words.length-1; i>=0;i--) {
				System.out.print(words[i]+" ");
			}
}
}
