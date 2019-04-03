package com.class14;

public class StringManipulations2 {
public static void main(String[] args) {
	

	//3. 
	// .toCharArray()- converts String to array of character
	
	String str="saturday and";
	char[] array=str.toCharArray();
	for(int i=0;i<array.length; i++)
	{
	System.out.print(array[i]);
	}
	
	
	

//	   char[] array1=str.toCharArray();
	       
	   for (char c:array) {
	       System.out.println(c);

	   }
	
//		char[] array2=str.toCharArray();
		for(int i=array.length-1; i>=0; i--){
		System.out.print(array[i]);
		}
		
	
		
		
}
}
