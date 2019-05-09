package com.class26;

public class Phone {
	void MakeACall(){
		System.out.println("Phone can make a call");
	}
	void hasCamera(){
		System.out.println("Phone has Camera");
	}

}

class iPhone extends Phone{
	void MakeACall(){
		System.out.println("iPhone can call with FaceTime");
	}
	void hasCamera(){
		System.out.println("iPhone has dual HD Camera");
	}
}

class Samsung extends Phone{
	void hasCamera(){
		System.out.println("Samsung has 3 lenses camera");
	}
	
}

class  Nokia extends Phone{
	public void canNotBreak() {
		System.out.println("Nokia is unbreakable");
	}
	
}
