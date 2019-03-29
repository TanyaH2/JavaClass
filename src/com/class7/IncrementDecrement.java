package com.class7;

public class IncrementDecrement {
public static void main(String[] args) {
	
	//++ Increment Shorthand Operator
	//-- Decrement Shorthand Operator
	//+=; -=; /=; *=; %  Compound Operators
	
	
	
	int x=1;
	x=x+1;
	System.out.println(x);
	
	int y=1;
	y+=1;
	System.out.println(y);
	
	int z=1;
	z++;
	System.out.println(z);
	
	int w=2;
	w++;
	System.out.println(w);
	
	int v=10;
	v--;
	System.out.println(v);
	
	int a=10;
	int b=++a;
	int	c=a++;	
	
	System.out.println(b);
	System.out.println(c);
	
	int a1=10;
	int b1=++a1; //preincrement =first increment 10+1 --->assign 11
	System.out.println("a1= "+a1);
	System.out.println("b1= "+b1);
	
	
//	int c1=10;
//	int d1=c1++; //postincrement =first assign 10  ---> increment 10+1
//	System.out.println("с= "+ с1); //11
//	System.out.println("d1= "+d1); //10
	
	
	int q=100;
	int e=q++;//postincrement =first assign 100 ---> increment  100-1
	System.out.println("e= "+e);
	System.out.println("q= "+q);
	
	int h=50;
	int g=++h; //preincrement =first increment 50-1  --->assign 49
	System.out.println("g= "+g);
	System.out.println("h= "+h);
	
	
	
	
	
	
	
	
	
	
}
}
