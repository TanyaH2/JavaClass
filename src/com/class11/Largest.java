package com.class11;

public class Largest {
	public static void main(String[] args) {
		// INTERVIEW QUESTION
		// Create an array of integers and find largest number

//	
//	int [] num= {99,4,76,45,78,203};
//	
//	int max=num[3];
//	int min=num[4];
//	for( int a=0; a<num.length; a++) {
//	  if(num[a]>max) {
//		  max=num[a];
//	  }  else if(num[a]<min){
//		  min= num[a];
//	  }
//	}
//	System.out.println("The largest number is "+ max);
//	System.out.println("The smallest number is "+ min);
//	
//	System.out.println("--------------------");
//	
//	int[] num1= {21,34,7543,756,1,2244,764};
//	
//	int max1=num1[0];
//	int min1=num1[0];
//	for(int a=0; a<num1.length; a++) {
//		if(num1[a]>max1) {
//			max1=num1[a];
//		}else if(num1[a]<min1) {
//			min1=num1[a];
//		}
//	}
//	System.out.println("the large one is "+max1);
//	System.out.println("the smallest one is "+min1);

		int[][] a = { 
				{ 5, 2, 3, 7 }, 
				{ 1, 5, 8, 1 }, 
				{ 9, 3, 1, 2 } };
//should be 8
		int max = a[0][0];
		for (int s = 0; s < a.length; s++) {
			for (int z = 0; z < a[s].length; z++) {
				if (a[s][z] > max) {
					max=a[s][z];
				
					System.out.println(max);
				}
			}
		}
	}
}
