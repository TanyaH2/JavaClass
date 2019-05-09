package com.class24;

public class TestDegree {
public static void main(String[] args) {
	
	Degree  degree= new Degree();
	Undergraduate1 under=new Undergraduate1();
	Postgraduate1 post=new Postgraduate1();
	
	boolean a;
	
	a=degree.getDegree();
	System.out.println();
	a=under.getDegree();
	System.out.println();
	a=post.getDegree();
	System.out.println();
}
}
