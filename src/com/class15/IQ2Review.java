package com.class15;

public class IQ2Review {
public static void main(String[] args) {
	
//  2.Write a java program to find the second largest number in the array?
//	Maximum and minimum number in the array?

	int arr[] = { 1000, 46, 1, 86, 292, 2 };
    
    int minimum = arr[0];//0           // try [0] and 0
    int secondLargest = 0;//0      // try [0] and 0
    int largest = 0;//0            // try [0] and 0
    
    for(int a: arr) {
        if(a>largest) {
            largest =a;
        }
        if(a < minimum) {
        	minimum = a;
        }
    }
    for(int a : arr) {
        
        if(a> secondLargest && a <largest) {
            
            secondLargest = a;
        }
    }
    System.out.println("min = "+ minimum);
    System.out.println("Second Largest = " + secondLargest);
    System.out.println("Largest = " + largest);
	System.out.println("--------------------");
	
	
	int[] num = { 4, 760, 678, 34, 203 };

	int max = num[0];
	int min = num[0];
	int secMax = num[0];
	for (int a1 = 0; a1 < num.length; a1++) {
		if (num[a1] > max) {
			secMax = max;
			max = num[a1];
		} else if (num[a1] > secMax) {
			secMax = num[a1];
		} else if (num[a1] < min) {
			min = num[a1];
		}
	}
	System.out.println("The largest number is " + max);
	System.out.println("The smallest number is " + min);
	System.out.println("The second largest is " + secMax);
	
	
}
}
