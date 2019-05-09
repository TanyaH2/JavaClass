package com.class28;

public class TestVehicle {
public static void main(String[] args) {
	Car car=new BMW("bmw");
	car.drive();
	car.start();
	car.brake();
	Vehicle.displayTotalVehicle();
	
	Car car1=new Toyota("toyota");
	car1.drive();
	car1.start();
	car1.brake();
	Vehicle.displayTotalVehicle();

	System.out.println(Vehicle.vehicleCount);
	
	new BMW("bmw1");
	new Toyota("toyota1");
	System.out.println(Vehicle.vehicleCount);
	Vehicle.displayTotalVehicle();
	}
}
