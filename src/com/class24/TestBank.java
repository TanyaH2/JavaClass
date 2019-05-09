package com.class24;

public class TestBank {
public static void main(String[] args) {
	
	Bank bank= new Bank();
	BOA1 boa= new BOA1();
	PNC1 pnc= new PNC1();
	WF1 wf= new WF1();
	
	int interestRate;
	
	interestRate=bank.chargeInterest();
	System.out.println("Bank Chargest  interest="+interestRate);
	
	interestRate=boa.chargeInterest();
	System.out.println("BOA Chargest  interest="+interestRate);
	
	interestRate=pnc.chargeInterest();
	System.out.println("PNC Chargest  interest="+interestRate);
	
	interestRate=wf.chargeInterest();
	System.out.println(" Chargest  interest="+interestRate);
	
}
}
