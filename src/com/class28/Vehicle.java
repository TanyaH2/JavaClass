package com.class28;

public abstract class Vehicle {

static int vehicleCount;
	Vehicle(){
		vehicleCount++;
	}
	//public static abstract  void gps(); ---Cannot have abstract methods as static(Cannot Override)
	//private abstract void speed (); ---Cannot have abstarct method as private (not a part  of inheritance)
	//public abstract final void break();--- Cannot have abstract methods as final(Cannot Override)
	public abstract void start();
	public abstract void drive();
	public void brake() {
		System.out.println("Stop vehicle by pressing break");
	}
	public static void displayTotalVehicle() {
		System.out.println("Total numner of vehicle buit is="+vehicleCount);
	}
	
}

abstract class Car extends Vehicle{
	/*
	 * by Default compiler will create default constractor and 
	 * by  default  inside the child constructor we call a parent  
	 * class constructor
	 * 
	 * Car(){
	 * super();
	 * 	}
	 */
	
	public String make;// instance veriables allowed in the abstract  class
	//we cannot create  an Object of abstract class, but  since we have an instance variable
	// inside the class we needsomeone to initialize them--> perform by constructor
	Car(String make){
		this.make=make;
		System.out.println(this.make);
	}
}

class BMW extends Car{
	BMW(String make) {
		super(make);
		
	}

	/*
	 * by Default compiler will create default constractor and 
	 * by  default  inside the child constructor we call a parent  
	 * class constructor
	 * 
	 * BMW(){
	 * super(); //added by default
	 * 	}
	 */
	
	@Override
	public void start() {
		
		System.out.println("BMW car  starts remoted");

	}

	@Override
	public void drive() {
System.out.println("BMW car drives fast");		
	}
	
}

class Toyota extends Car{

	Toyota(String make) {
		super(make);
		
	}

	@Override
	public void start() {
System.out.println("Toyota car starts with oush button");		
	}

	@Override
	public void drive() {
System.out.println("Toyota car  drives safe");		
	}
	
}
