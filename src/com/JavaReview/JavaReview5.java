package com.JavaReview;

public class JavaReview5 {
	public static void main(String[] args) {

		// FOR LOOPS

//	  1 2 3 4 5 6 7 8 9 10
//    2 4 6 8 10 12 14 16 18 20
//    3 6 9 12 15 18 21 24 27 30
//    4 8 12 16 20 24 28 32 36 40
//    5 10 15 20 25 30 35 40 45 50

		for (int a = 1; a <= 5; a++) {
			for (int z = 1; z <= 10; z++) {

				System.out.print((a * z) + " ");
			}
			System.out.println();

		}

		System.out.println("------------------------");
//	....1
//	...22
//	..333
//	.4444
//	55555
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= (5 - i); k++) {
				System.out.print(".");
			}
			for (int l = 1; l <= i; l++) {

				System.out.print(i);
			}

			System.out.println();

		}
		System.out.println("----------------------------");

//	....1
//	...2
//	..3
//	.4
//	5

		for (int a = 1; a <= 5; a++) {
			for (int z1 = 5; z1 >= a; z1--) {
				if (z1 <= a) {
					System.out.print(z1);
				} else {
					System.out.print(".");
				}
			}

			System.out.println();
		}
		System.out.println("---------------------");
		for (int a = 1; a <= 5; a++) {
			for (int z1 = 1; z1 <= (5 - a); z1++) {

				System.out.print(".");
			}
			System.out.print(a);
			System.out.println();

		}

//	.1
//	..2
//	...3
//	....4
//	.....5
		System.out.println("---------------------");
		for (int a = 1; a <= 5; a++) {
			for (int z1 = 5; z1 > (5 - a); z1--) {

				System.out.print(".");
			}
			System.out.print(a);
			System.out.println();

		}

		System.out.println("-----------------------");
//	....1
//	...21
//	..321
//	.4321
//	54321

		for (int a = 1; a <= 5; a++) {
			for (int z1 = 5; z1 >= 1; z1--) {
				if (z1 <= a) {
					System.out.print(z1);
				} else {
					System.out.print(".");
				}
			}

			System.out.println();
		}
		
System.out.println("------------------");
//   ....1
//   ...2.
//   ..3..
//   .4...
//   5....
		

for (int p = 1; p <= 5; p++) {
    
    for (int j = 1; j <= (5 - p); j++) {
    System.out.print(".");
    }
    
    System.out.print(p);
    
    for (int j = 1; j <= (p - 1); j++) {
    System.out.print(".");
    }
    System.out.println();
    }



		System.out.println("====================================================");
		// ARRAYS

		int i = 0;
		int j = 1;
		int k = 4;

		int[] arr = new int[3];
		System.out.println(arr[0]);

		int[] arr1 = { 4, 6, 9 };
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);

		System.out.println("-----------------------------------------------");

		// sum of arrays

		//int sum = 0;
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	for (int a=0; a<=num; a++) {
//		sum=sum+num;
		System.out.println(num[0] + num[1] + num[2] + num[3] + num[4] + num[5] + num[6] + num[7] + num[8] + num[9]);

		int[] num1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] num2 = new int[10];
		int sum=0;
		for(int q=0; q<num1.length; q++) {
		sum+=num1[q];
		//sum=sum+num1[q]//same as sum+=num1[q]
		}
		System.out.println("The sum of all array elements ="+sum);
		
		System.out.println("-------------------------------");
		//Write a program to test if array contains a specific value
		
		//Hint:  use a boolean flag
		
		Boolean x=true;
		int[] num3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] num4= new int[10];
		for (int q=0; q<num3.length; q++) {
			if (num3[q]==6){
				System.out.println(num3[q]+"-Found it");
			}else {
				System.out.println(num3[q]+"-I didn't find it");
			}
			
		}
		System.out.println("--------------------------");
		boolean found= false;
		for (int s=0; s<10; s++) {
			if (num3[s]==6) {
				found=true;
				break;
			}
		}
		
if (found==true) {
	System.out.println("The array contains the  value 6");
}else {
	System.out.println("The array does NOT contains the  value 6");
}
	}
}
