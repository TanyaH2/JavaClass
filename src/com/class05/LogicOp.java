package com.class05;

import java.util.Scanner;

public class LogicOp {

	
//	Write a Java program to ask user enter daily sales amount
//	Based on the sales range commission will be different;
//	Example: sales is <100 == > commission =2
//	sales more than 100 and less than 200 =5		
	
	public static void main(String[] args) {
		
		 Scanner scan;
	        boolean sale;
	        int discount;
	        int price;
	        double finalPrice;
	        
	        scan=new Scanner(System.in);
	        System.out.println("Please enter if there is a sale");
	        sale=scan.nextBoolean();
	        
	      	 if(sale) {
	                System.out.println("Please enter price of the item");
	                price=scan.nextInt();
	                System.out.println("Let's check all discounts");
	                if (price<20) {
	                    discount=20;
	                    finalPrice=price-(price*0.2);
	                }else if (price>=20 && price<100) {
	                    discount=30;
	                    finalPrice=price-(price*0.3);
	                }else if (price>=100 && price<500) {
	                    discount=50;
	                    finalPrice=price-(price*0.5);
	                }else {
	                    discount=75;
	                    finalPrice=price-(price*0.75);
	                }
	                
	                System.out.println("Final price is "+finalPrice);
	        }else {
	            System.out.println("Not Interested");
	        }
	    }
	}