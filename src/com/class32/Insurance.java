package com.class32;

/*
 * Create a class Insurance that will have an attribute as insuranceName 
 * and unimplemented behaviour as getQuote and cancelInsurance. 
 * Create 3 subclasses Car, Pet, Health. 
 * Car class has it’s own attribute as carModel and Class Pet has petType attribute.
 * Create 3 objects of the sub classes and store them in ArrayList. 
 * Using 1 reference variable access methods from different classes.
 */
public abstract class Insurance {

	public String insuranceName;

	public Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public abstract void getQuote();

	public abstract void cancelInsurance();

}

class Car extends Insurance {

public String carModel;
//	public Car(String carModel) {
//		this.carModel=carModel;
//		// TODO Auto-generated constructor stub
//	}
//	public Car(String carModel) {
//		this.carModel=carModel;
//	}

	public Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel=carModel;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getQuote() {
		System.out.println("Get your " + insuranceName + " for your "+carModel+" quote today!");
	}

	@Override
	public void cancelInsurance() {
		System.out.println("You can cancel your " + insuranceName + " by paying canselation fee");

	}

}

class Pet extends Insurance {

public String petType;
//	public Pet(String petType) {
//		this.petType=petType;
//		// TODO Auto-generated constructor stub
//	}

	public Pet(String insuranceName,String petType) {
		super(insuranceName);
		this.petType=petType;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getQuote() {
		System.out.println("Get your " + insuranceName + " for your "+petType+" quote anytime!");

	}

	@Override
	public void cancelInsurance() {
		System.out.println("You can cancel your " + insuranceName + " anytime");

	}

}

class Health extends Insurance {

	public Health(String insuranceName) {
		super(insuranceName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getQuote() {
		System.out.println("Get your " + insuranceName + " quote today and anyday!");

	}

	@Override
	public void cancelInsurance() {
		System.out.println("You can cancel your " + insuranceName + " anyday you want");

	}

}
