package com.class26;

public class TestPhone {
	public static void main(String[] args) {

		
		System.out.println("\n Object of the Parent Class");
		Phone p = new Phone();
		p.MakeACall();
		p.hasCamera();

		System.out.println("\n Object of the iPhone Class");
		iPhone iP = new iPhone();
		iP.MakeACall();
		iP.hasCamera();

		System.out.println("\n Object of the Samsung Class");
		Samsung s = new Samsung();
		s.MakeACall();
		s.hasCamera();
		
		System.out.println("\n Object of the Nokia Class");
		Nokia n = new Nokia();
		n.MakeACall();
		n.hasCamera();
		n.canNotBreak();
		
		System.out.println("\n Object of the iPhone Class refering to the parent");
		Phone pIp=new iPhone();
		pIp.MakeACall();
		pIp.hasCamera();
		
		System.out.println("\n Object of the Nokia Class Class refering to the parent");
		Phone pn = new Nokia();
		pn.MakeACall();
		pn.hasCamera();
		//pn.canNotBreak(); ce: cannot acces Child specific methods" The method canNotBreak() is undefined for the type Phone"
		
		//creating a variable of a ParentType
		Phone parentPhone;
		//assinging iphone object
		parentPhone=new iPhone();
		parentPhone.MakeACall();
		parentPhone.hasCamera();
		//assinging samsung object
		parentPhone=new Samsung();
		parentPhone.MakeACall();
		parentPhone.hasCamera();
		//assinging Nokia object 
		parentPhone=new Nokia();
		parentPhone.MakeACall();
		parentPhone.hasCamera();
		
	}
}
