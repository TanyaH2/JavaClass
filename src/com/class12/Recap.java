package com.class12;

public class Recap {
	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 10, 20, 30 }, { 100, 200, 300 } };

		for (int i = 0; i < arr.length; i++) {
			for (int a = 0; a < arr[i].length; a++) {
				System.out.print(arr[i][a] + ", ");
			}
			System.out.println();
		}

		System.out.println("---------------------");
//loop through each element inside  2D array-->each element=array
		for (int[] singleArray : arr) {         // arrays with [], int []
			//loop through  each single array
			for (int number : singleArray) {    // just numbers so NO [], int
				System.out.print(number + ",");
			}
			System.out.println();
		}

	}
}
