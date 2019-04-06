package com.class17_2;

public class NestedLoops {
	public static void main(String[] args) {
		for (int num1 = 0; num1 < 24; num1++) {

			for (int num2 = 0; num2 < 60; num2++) {
				if (num1 < 10) {
					if (num2 < 10) {
						System.out.println("0" + num1 + ":0" + num2);
					} else {
						System.out.println("0" + num1 + ":" + num2);
					}
				} else {
					if (num2 < 10) {
						System.out.println(num1 + ":0" + num2);
					} else {
						System.out.println(num1 + ":" + num2);
					}
				}
			}
			for(int hour=0; hour<=24; hour++) {
                for(int minutes=0;minutes<60;minutes++) {
                    if(hour < 10) {
                        if(minutes < 10) {
                            System.out.println("0" + hour + ":0" + minutes);
                        }else {
                            System.out.println("0" + hour + ":" + minutes);
                        }
                    }else {
                        if(minutes < 10) {
                            System.out.println( hour + ":0" + minutes);
                        }else {
                            System.out.println(  hour + ":" + minutes);
                        }
                    }
                }
            }
		System.out.println("------------------------");

		// num3-counter variable
		for (int num3 = 0; num3 <= 3; num3++) {
			System.out.print(num3);
			for (int num4 = 0; num4 <= 5; num4++) {
				System.out.println(num4);

			}
		}
		System.out.println("-----------------------------");

//for(int hours = 0; hours < 24; hours++) {
//            
//            for(int minutes = 0; minutes <60; minutes++) {
//                
//                for(int seconds = 0; seconds <60; seconds++) {
//                    
//                    System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
//                }
//            }
//        }
//System.out.println("--------------------------");
//
//for (int a=0; a<=9; a++) {
//	for ( int b=0; b<=9; b++) {
//		for (int c=0; c<=9; c++) {
//			for (int d=0; d<=9; d++) {
//				System.out.println(a+""+b+c+d);
//			}
//		}
//	}
//}
//
	}
	}
}
