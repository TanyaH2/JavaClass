package com.class24;

public class Bank {

	public  int chargeInterest() {
		return 0;
	}
}




//child class
class BOA1 extends Bank{
	@Override  //annotation
	public  int chargeInterest() {
		return 2;
	}
}



//child class
class PNC1 extends Bank{
	@Override  //annotation
	public  int chargeInterest() {
		return 3;
	}

}



//child class
class WF1 extends Bank{
	@Override  //annotation
	public  int chargeInterest() {
		return 4;
	}
}
