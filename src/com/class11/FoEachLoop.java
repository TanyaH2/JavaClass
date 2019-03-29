package com.class11;

public class FoEachLoop {
	public static void main(String[] args) {

		int[] num = { 12, 13, 14, 15, 16, 17 };
		for (int monkey : num) {
			System.out.println(monkey);
		}

		double[] n= {12.53,311,434.5,221.001,423};
		int  a=n.length;
		System.out.println(n[3]);
		for(int q=0; q<a; q++) {
			System.out.print( n[q]+", ");
			System.out.println();
			
		}
	}
}
