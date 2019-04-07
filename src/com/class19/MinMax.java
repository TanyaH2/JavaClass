package com.class19;

public class MinMax {
//	int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
//
//    int max = array[0];
//    int min = array[0];
//
//    for (int j = 0; j < array.length; j++) {
//
//        if (array[j] >= max) {
//
//            max = array[j];
//        }
//        if (array[j] <= min) {
//            min = array[j];
//        }
//
//    }
//}
	static int minOfValues1(int[] x) {
		int min =x[0]; //Integer.MAX_VALUE;
	

		for (int y : x) {
			if (y < min) {
				min = y;
			}
		}
		return min;
	}
static int maxOfValues(int[]y) {
	int max =y[0]; //Integer.MAX_VALUE;
	
	for (int z : y) {
		if (z>max) {
			max = z;
		}
	}
	return max;
}
	

	}






