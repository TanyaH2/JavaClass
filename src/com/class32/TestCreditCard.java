package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCreditCard {

	public static void main(String[] args) {
		CreditCard visa = new Visa("Visa Platinum");

		CreditCard ax = new AX("AX Rewards");

		CreditCard masterCard = new MasterCard("MC Premium");

		ArrayList<CreditCard> alist = new ArrayList<>(); // <Object> or <CreditCard>

		alist.add(visa);
		alist.add(ax);
		alist.add(masterCard);

		//  How can I get a name of each card?

		for (CreditCard card : alist) {
			System.out.println(card.creditCardName);
			card.openAccount();
			card.interestRate();
			card.anualFee();
			System.out.println("---------------");
		}
		
		
		//  How can we print and interest rate of each card
		Iterator<CreditCard> myIterator=alist.iterator();
		
		while(myIterator.hasNext()) {
			CreditCard obj=myIterator.next();	
			obj.interestRate();
		}
		System.out.println("----------------");
		
		//  How to print an annual fee of each card
		for (int i=0; i<alist.size(); i++) {
			CreditCard obj=alist.get(i);
			obj.anualFee();
			
		}
		
		
		

	}

}
