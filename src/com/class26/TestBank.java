package com.class26;

public class TestBank {
public static void main(String[] args) {
	
	Bank balance;
	balance= new BankA();
	balance.getBalance();
	balance= new BankB();
	balance.getBalance();
	balance= new BankC();
	balance.getBalance();
}
}
