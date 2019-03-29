package com.class10;

public class GetAll {
public static void main(String[] args) {
	
	String[] names = { "John", "Mike", "Jane", "Talgat", "Olga","Mehmet","Siyar" };
	int a=3;
	System.out.println(names[a]);
	a+=3;
	System.out.println(names[a]);
	a-=2;
	System.out.println(names[a]);
	System.out.println("--------------------------");
	int size=names.length;
	System.out.println(size);
	
	for(int ii=0; ii<=size-1; ii++) {
	System.out.println(names[ii]);
	
	}
	
	String[] word=new String[5];
	word[0]="I";
	word[1]="am";
	word[2]="struggling";
	word[3]="with";
	word[4]="Java";
	for(int v=0; v<word.length; v++) {
	System.out.print(word[v]+" ");}
	System.out.println();
	
	int[] num={45,78,12,67,55,89,23,77,88};
	   int aa=0;
	   System.out.println(num[aa]+" ");
	    aa+=2;
	
	    System.out.println("-----------------------");
	    
	    char[] syntax1={'s','a','y','b','n','c','t','d','a','e','x'};
	    int words=syntax1.length;
	     for(int i=0; i<=words-1; i+=2){
	       System.out.print(syntax1[i]);
	     }
	     System.out.println();
	     
	     System.out.println("----------------------------------");
	     
	     
	     float[] squares = new float[101];

	     for (int i=0; i <=100; i++) {
	       squares[i] = i*2;
	    
	     System.out.println(squares[i]);
	     } 
}
}
