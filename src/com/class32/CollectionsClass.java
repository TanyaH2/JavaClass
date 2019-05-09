package com.class32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsClass {
public static void main(String[] args) {
	
	ArrayList<Integer> integerList=new ArrayList<>();
	
	integerList.add(54);
	integerList.add(876);
	integerList.add(45);
	integerList.add(23);
	
	System.out.println("Collection before sorting"+integerList);
	Collections.sort(integerList);
	System.out.println("Collection after sorting"+integerList);


	int[] integerArray= {12,57,9799,1};
	Arrays.sort(integerArray);
	System.out.println("Array after Sorting");
	for(int num:integerArray) {
	System.out.print(num+" ");
	}
	
}
}
