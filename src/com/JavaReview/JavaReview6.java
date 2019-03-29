package com.JavaReview;

public class JavaReview6 {

	public static void main(String[] args) {

		int[][] arr1 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		int sum = 0;
		for (int i = 0; i < arr1[0].length; i++) {
			System.out.println(arr1[0][i]);
			sum += arr1[1][i];
		}
		System.out.println(sum);

		System.out.println("--------------");
		// Write a program to print the length of each array

		int[][] ar = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7, 8 } };
		for (int a = 0; a < ar.length; a++) {
			System.out.println("The length of the row " + (a + 1) + "=" + ar[a].length);

		}

		for (int[] arr : ar) {
			System.out.println(arr.length);
		}
		System.out.println("----------------------");

		// write programmto print all elements of the 2d array Using a for loop\

		for (int a = 0; a < ar.length; a++) {
			for (int z = 0; z < ar[a].length; z++) {

				System.out.println(ar[a][z]);
			}
		}
		System.out.println();
		for (int[] inner : ar) {
			for (int elements : inner) {
				System.out.println(elements);
			}
		}

		// Write a program to find the average of row 2.
//		2 6 9 3 7
//      1 7 9 4 8
//      0 4 6 2 5
//      0 1 2 3
		System.out.println("======");
		int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };
		int sum1 = 0;
		int av = 0;
		for (int s = 0; s < rating[1].length; s++) {
			// for (int w=0; w<rating[s].length; w++) {
			sum1 += rating[1][s];
		}
		av = sum1 / 5;

		System.out.println(av);

//			    Find the number of values above the value of 7.
		int val = 0;

		for (int[] m : rating) {
			for (int l : m) {
				if (l > 7) {
					val++;

				}
			}
		}
		System.out.println("number nums above 7 is " + val);

		int val1 = 0;
		for (int[] inr : rating) {
			for (int num : inr) {
				if (num > 7) {
					val1++;
				}
			}
		}
		System.out.println(val1);

		int h = 0;
		for (int t = 0; t < rating.length; t++) {
			for (int c = 0; c < rating[t].length; c++) {
				if (rating[t][c] > 7) {
					h++;
				}
			}
		}
		System.out.println(h);

		System.out.println("===========");
//		Print the average of values in column 3
//		2 6  3 7
//      1 7 2 4 8
//      0 4 2 2 5
//      0 1 2 3
		int sum11 = 0;

		for (int r = 0; r < rating.length; r++) {

			sum11 += rating[r][2];
			//sum11+=(rating[r][2]+rating[r][1]);
		}
		System.out.println(sum11 / rating.length);
		
		
		int summ=0;
		for(int [] inner1:rating) {
			summ+=inner1[2];
		}
		System.out.println(summ/rating.length);

		System.out.println("+++++++++++++++++++++++++++++++++++++=");
		
		
		/**
         * length()
         * toLowerCase()
         * toUpperCase()
         * equals(Object anObject)
         * equalsIgnoreCase(String anotherString)
         * contains(String anotherString)
         * startsWith(String prefix)
         * endsWith(String suffix) isEmpty()
         * concat(String str)
         * trim()
         * charAt(int index)
         * indexOf(int ch)
         * substring(int beginIndex)
         * substring(int beginIndex, int endIndex)
         *
         */
        
        
        /**
        * Write a program that:
        * Converts all the characters in the string to lower case and prints.
        * 
        * Converts all the characters in the string to upper case and prints.
        * 
        * Checks whether the string/paragraph starts and ends with the string or 
        * word "The" and prints.
        * 
        * Counts the number of letter 'a' in the string/paragraph and prints.
        * 
        * Prints the second half of the string/paragraph.
        * 
        * Prints characters between the 10th and 20th indices(inclusive).
        * 
        * Prints the string/Paragraph in reverse order.
        * 
        * Clears/removes all white spaces or tabs on both ends and prints.
        */

       String para = "The quick brown fox jumps over the lazy dog.";
       
       
       String low=para.toLowerCase();
       System.out.println(low);
		
       String upp=para.toUpperCase();
       System.out.println(upp);
		
		Boolean st=para.startsWith("The");
		Boolean ends=para.endsWith("The");
		System.out.println(st);
		System.out.println(ends);
		
		int let=para.indexOf('a');
		System.out.println(let);
		
		int count=0;
		for (int i=0; i<para.length(); i++) {
			if (para.charAt(i)=='a') {
				count++;
			}
					
		}
		System.out.println(count);
		System.out.println("---");
		String half=para.substring(22);
		System.out.println(half);
		System.out.println(para.substring(para.length()/2));
		
		String cha=para.substring((10),(20));		
		System.out.println(cha);

		for (int  q=para.length()-1;q>=0; q--) {
			System.out.print(para.charAt(q));
		}
		
		String tr=para.trim();
		System.out.println(tr);
		
	}
}
