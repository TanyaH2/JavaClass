package com.class27;

public class UserClass {
	public String name;
	public long mN;
//
//	UserClass() {
//
//	}

	UserClass(String name, long mN) {
		this.name = name;
		this.mN = mN;
	}

	public static void main(String[] args) {

		userInfo obj = new userInfo("John Snow", 703439923, "Winterfell");
		obj.userDetails();
	}
}

class userInfo extends UserClass {

	public String address;

	public userInfo(String name, long mN, String address) {
		super(name, mN);
		this.address = address;

	}

	public void userDetails() {
		System.out.println("Student " + name + " has phone number " + mN + " and lives " + address);

	}
}
