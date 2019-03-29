package com.class10;

public class Arrays {
	public static void main(String[] args) {

		int num;
		num = 10; // int num=10;

		int[] array1; // declare an array ---> preferred way
		int[] array2; // declare an array
		int array3[]; // declare an array

		array1 = new int[4];// initializer/ creating an array

		// assigning value
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;

		// access value

		System.out.println(array1[2]);

		int[] numbers = new int[3];

		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 15;
		// numbers[3] =20; no error during compilation but error during run time
		System.out.println(numbers[2]);

		
		
		int[] num1 = {13,45, 34};
		System.out.println(num1[2]+ num1[0]);
		
		String[] a =new String[3];
		a[0]="hello";
		a[1]="hi";
		a[2]="bye";
		System.out.println(a[1]+" friend");
		
		
		
		
	}

}
