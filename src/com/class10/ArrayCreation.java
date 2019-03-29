package com.class10;

public class ArrayCreation {
	public static void main(String[] args) {
		// 0, 1, 2, 3
		int[] array = { 10, 20, 30, 40 };
		System.out.println(array[2]);
		System.out.println(array.length);

		System.out.println("--------------------------------");
		// create string of names

		String[] names = { "John", "Mike", "Jane", "Talgat", "Olga" };
		System.out.println("There are " + names.length + "  values  in my array of names");
		System.out.println(names[2]);
         // String[] names;
		// names= {"John","Mike", "Jane","Talgat","Olga"};---> won't work; can't break the line

	}
}
