package com.class30;

import java.util.ArrayList;

public class IntegerArrayList {
	public static void main(String[] args) {
//		ArrayList<Integer> num = new ArrayList<Integer>();
//		num.add(10);
//		num.add(33);
//		num.add(75);
//		num.add(82);
//		num.add(3);
//
//		num.set(2, 7575);
//
//		for (Integer n : num) {
//			System.out.println(n);
//		}
		ArrayList<String> str = new ArrayList<String>();
		str.add("hi");
		str.add("yo");
		str.add("sup");
		str.add("yolo");
		str.add("boop");

		str.remove(0);
		str.remove(1);
		str.remove(2);
		for (String st : str) {

			System.out.println(st);
		}
	}
}
