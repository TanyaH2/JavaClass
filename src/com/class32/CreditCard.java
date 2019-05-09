package com.class32;

public abstract class CreditCard {

	public String creditCardName;

	public CreditCard(String creditCardName) {
		this.creditCardName = creditCardName;
	}

	public void openAccount() {
		System.out.println("Open " + creditCardName + " credit card");
	}

	public abstract void interestRate();

	public abstract void anualFee();

}

class Visa extends CreditCard {

	public Visa(String creditCardName) {
		super(creditCardName);
	}

	@Override
	public void interestRate() {
		System.out.println(creditCardName + " card has interest rate of 25%");
	}

	@Override
	public void anualFee() {
		System.out.println(creditCardName + " card has annual rate of $250");

	}

}

class AX extends CreditCard {

	public AX(String creditCardName) {
		super(creditCardName);
	}

	@Override
	public void interestRate() {
		System.out.println(creditCardName + " card has interest rate of 22%");
	}

	@Override
	public void anualFee() {
		System.out.println(creditCardName + " card has annual rate of $200");

	}

}

class MasterCard extends CreditCard {

	public MasterCard(String creditCardName) {
		super(creditCardName);
	}

	@Override
	public void interestRate() {
		System.out.println(creditCardName + " card has interest rate of 2%");
	}

	@Override
	public void anualFee() {
		System.out.println(creditCardName + " card has NO anual fee");

	}

}
