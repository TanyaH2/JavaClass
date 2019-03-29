package com.class4;
/*Create a Java program and store variables to store mortgage rate and mortgage price. 
 * First program should check if rate is higher than 4.5 user will not buy a house, 
 * otherwise user will consider buying. Once user decides to buy a house, 
 * if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.
 * 
 */
public class Task4 {
	public static void main(String[] args) {
		
		double mortRate=3.5;
//		double rateBank=4.5;
    	int housePrice=1700000;
//		int mortPrice=200000;
		
		if(mortRate>4.5) {
			System.out.println("Not buying it");
		}else {
			System.out.println("I'm considering to buy the house!");
	            if(housePrice>200000) {
	            	System.out.println("I will take a loan.");
	            }else {
	            	System.out.println("I will pay cash for the house.");
	            }
		}
		
		
		
		
		
	}

}
