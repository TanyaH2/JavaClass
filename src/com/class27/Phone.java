package com.class27;

public abstract class Phone {

	public void makeCall() {
		System.out.println("Phone can make a call");
	}
	public void sendText() {
		System.out.println("Phone can send text");
	}
	public abstract void unlockPhone();
	public abstract void viewPictures();
	
}

class Iphone extends Phone{ //concrete class - is the class that is inherited 
	                        //from the abstract class or implemented by interface and providing
                           	//complete implementation of all unimplemented/abstract classes

	@Override
	public void unlockPhone() {
		// TODO Auto-generated method stub
		System.out.println("To unlock Iphone we can use FaceId or FingerPrint");
	}

	@Override
	public void viewPictures() {
		// TODO Auto-generated method stub
		System.out.println("To view pictures on Iphone you can go to Images");
	
	}
	
}
class Samsung extends Phone{

	@Override
	public void unlockPhone() {
		// TODO Auto-generated method stub
		System.out.println("To unlock Samsung we need to enter Password");
	}

	@Override
	public void viewPictures() {
		// TODO Auto-generated method stub
		System.out.println("To view pictures on Samsung you can ");
	}
	
}