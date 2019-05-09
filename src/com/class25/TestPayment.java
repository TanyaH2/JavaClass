package com.class25;

public class TestPayment {
	public static void main(String[] args) {
		Payment parent = new Payment();
		parent.makePayment();

		MasterCard mc = new MasterCard();
		mc.makePayment();

		Visa v = new Visa();
		v.makePayment();
		v.annualFee();

		// Achieving run time polymorphism

        //pay- reference variable, Payment-type
		// new MasterCard(); -creating an object and call constructor
		Payment pay = new MasterCard();
		
	    //any method that exist in a parent and common in child
		//it will execute overriden method from the child if it 
		//has same name as the same as in parent
        pay.closePayment();
        pay.makePayment();
        
        Payment pay1= new Visa();
        pay1.closePayment();
        pay1.makePayment();
        //pay1.annualFee(); --method is undefined

	}
}
