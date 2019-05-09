package com.class28;

public class TestBank1 {

	public static void main(String[] args) {
		Bank bank = new PNC();
		bank.hasChecking();
		bank.hasCreditCard();
		bank.hasSavings();
		System.out.println(PNC.hello);
		System.out.println(PNC.a);
		System.out.println(PNC.b);
		System.out.println(PNC.c);

	}
}
