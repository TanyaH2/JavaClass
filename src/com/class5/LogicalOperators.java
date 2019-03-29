package com.class5;

public class LogicalOperators {
public static void main(String[] args) {
	
//	Logical AND &&
//	
//	True AND True = True
//	True AND False = False
//	False AND True = False
//	False AND False = False
	
	
	int num=15;
//    True   AND False ---> False
if (num>=1 &&  num <=10) {
	System.out.println("Number is small");
//         True    AND  True --->True
}else if (num>=11 && num<=100) {
	System.out.println("Number is medium");
//	       False  AND  False --->False
}else if (num>=101 && num<=1000) {
	System.out.println("Number is large");
}else {
	System.out.println("Number is not in our range");
}

	
	
	
//	Logical OR ||
//	
//	True OR True = True
//	True OR False = True
//	False OR True = True 
//	False OR False = False
//	
//	Logical NOT  !
	
//	If number is between 1-10 --> number is  small
//	If number is between 11-100--> number is  medium
//	If number is between 101-1000 --> number is  large
	

}
}
