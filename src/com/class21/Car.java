package com.class21;

public class Car {

	public String color; //null
	public static int totalCars; //0+1=1+1=2
	public static void main(String[] args) {
		
		Car car1=new Car();
		car1.color="White";
		Car.totalCars++;
		
		Car car2=new Car();
		car2.color="Red";
		totalCars++;
		
		Car car3= new Car();
		car3.color= "Green";
		totalCars++;
		
		Car car4= new Car();
		car4.color="Pink";
		totalCars++;
		
		Car car5= new Car();
		car5.color="Yellow";
		totalCars++;
		
		System.out.println("Total car  we made is "+totalCars);
		
		
		}
}
