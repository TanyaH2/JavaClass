package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class TestInsurance {
	public static void main(String[] args) {

		Insurance car = new Car("USAA","SUV");
		Insurance pet = new Pet("Progressive", "Dog");
		Insurance health = new Health("Tricare");
		ArrayList<Insurance> alist = new ArrayList<>();// ArrayList or LIst because List is a parent of ArrayList 
		alist.add(health);
		alist.add(pet);
		alist.add(car);

		//  enhanced loop
		for (Insurance in : alist) {
			System.out.println(in.insuranceName);
			in.getQuote();
			in.cancelInsurance();
			
			System.out.println("------------------");
		}

		//  for loop
		for (int a=0; a<alist.size(); a++) {
			System.out.println(alist.get(a).insuranceName);
	
		}
		System.out.println("-----------------------");
		//  iterator
		Iterator <Insurance> it=alist.iterator();
		while(it.hasNext()) {
			it.next().cancelInsurance();
		}
		
		
	}
}
