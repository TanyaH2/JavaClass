package com.class22;

public class ConstructorType {

	ConstructorType(){
		System.out.println("I am a constructor with no parameters");
	}
	
	ConstructorType(String str){// str- local variable to a constructor
		System.out.println("I am a constructor with 1 parameter " + str);
	}
	
	ConstructorType(int a, String str){// str- local variable to a constructor
		System.out.println("I am a constructor with 2 parameters " + a+" and "+str);
	}
	public  static void main(String [] args) {
		ConstructorType obj=new ConstructorType();
		ConstructorType obj1=new ConstructorType("String");
		ConstructorType obj2=new ConstructorType(123, "String");
		
		
	}
	
}
