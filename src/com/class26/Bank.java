package com.class26;

/*
 * 1. A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively.
 *  We have to print the money deposited by him in a particular bank. Create a class ‘Bank’ with a method
 *   ‘getBalance’ which returns 0. Make three subclasses named ‘BankA’, ‘BankB’ and ‘BankC’ with a method
 *    with the same name ‘getBalance’ which returns the amount deposited in that particular bank. 
 *    Call the method ‘getBalance’ by the object of each of the three banks.

2. Write program in class A has final display method and try overload and override this method and observe result .
 */
public class Bank {
int getBalance() {
	System.out.println(" Your total balance in all Banks is $4500");
	return 0;
}
}
class BankA extends Bank{
	int getBalance() {
		super.getBalance();
		System.out.println(" Your balance at the BankA is $1000");
		return 1000;
	}
}
class BankB extends Bank{
	int getBalance() {
		super.getBalance();
		System.out.println(" Your balance at the BankB is $1500");
		return 1500;
	}
}
class BankC extends Bank{
	int getBalance() {
		super.getBalance();
		System.out.println(" Your balance at the BankC is $2000");
		return 2000;
	}
}


