package com.class20;

/*
 * Create a method createEmail().
 * Based on provided users  name, lastName and  email type,
 * your method should return complete email Address:
 * johnsnow@gmail.com
 * johnsnow@yahoo.com
 * 
 */
public class Review {
	public static void main(String[] args) {

		Review obj = new Review();
		String email = obj.createEmail("John", "Snow", "Gmail");
		System.out.println(email);

		String email1 = obj.createEmail("Bob", "Snow", "Gmail");
		System.out.println(email1);
	}

	// return type methodName

	String createEmail(String name, String lastName, String emailType) {
		String email = name + lastName + "@" + emailType + ".com";
		return email.toLowerCase();

	}
}
