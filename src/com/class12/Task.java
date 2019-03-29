package com.class12;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

//	Accept username, password and confirm password and check following requirements:
//
//		Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
//		Password should be minimum 8 characters, if less → message=”Password is too short”.
//		Password cannot contain username if so, → message=”Password cannot contain username”.
//		Password should match confirmed password, if not  → message “Passwords do not match”.
//		Only after all requirements met → message “Your username and password has been created”

//		String message;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please provide your  Username");
//		String userName = scan.nextLine();
//		System.out.println("Please provide your Password with min of 8 char");
//		String pass = scan.nextLine();
//		System.out.println("Please confirm your Password");
//		String confPass = scan.nextLine();

//	if(userName.isEmpty()==true && pass.isEmpty()==true) {
//		System.out.println("Username and Password cannot be empty");
//	}else if(pass.length()<8) {
//		System.out.println("Password is too short");
//	}else if(pass.equals(userName)) {
//		System.out.println("Password cannot contain username");
//	}else if(!pass.equals(confPass)) {
//		System.out.println("Passwords do not match");
//		
//	}else {
//		System.out.println("Your username and password has been created");
//	}

//		if (!(userName.isEmpty() && pass.isEmpty())) {// 1 checkpoint
//
//			if (pass.length() > 8) {// 2 checkpoint
//
//				if (!(pass.contains(userName))) { // 3 checkpoint
//
//					if (confPass.equals(pass)) {
//						// System.out.println("Your username and password has been created");
//
//					} else {
//						message="Your pasword do not match";
//					}
//				} else {
//					message="Password cannot contain username";
//				}
//			} else {
//				message="Password is too short";
//			}
//		} else {
//			message="Username and Password cannot be empty";
//		}
//		System.out.println(message);
	
//		
//		
//		Scanner scan;
//		String userName, password, confirmedPassword, message;
//		
//		scan=new Scanner(System.in);
//		System.out.println("Please enter username");
//		userName=scan.nextLine();
//		
//		System.out.println("Please enter password");
//		password=scan.nextLine();
//		
//		System.out.println("Please confirm password");
//		confirmedPassword=scan.nextLine();
//		
//		if (!(userName.isEmpty() && password.isEmpty())) {//1 checkpoint
//			if(password.length()>8) {//2 checkpoint
//				if (!password.contains(userName)) {//3 checkpoint
//					if (password.equals(confirmedPassword)) {//4 checkpoint
//						message="Your username and password has been created";
//					}else {
//						message="Passwords do not match";
//					}
//				}else {
//					message="Password cannot contain username";
//				}
//			}else {
//				message="Password is too short";
//			}
//		}else {
//			message="Username and Password cannot be empty";
//		}
		//System.out.println(message);
	System.out.println("===================");
		
//		Accept username, password and confirm password and check following requirements:
		//
//				Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
//				Password should be minimum 8 characters, if less → message=”Password is too short”.
//				Password cannot contain username if so, → message=”Password cannot contain username”.
//				Password should match confirmed password, if not  → message “Passwords do not match”.
//				Only after all requirements met → message “Your username and password has been created”	
		
		
		
		
	int[]str={12,2,3,5,756,476};
	  
	  for(int a=str.length-1; a<=0; a--){
	    System.out.println(str[a]);
	  }
		
	  Scanner scan=new Scanner(System.in);
	  int num=scan.nextInt();
	  
	  if(num>0){
	    System.out.println("The number is positive");
	  }else  if(num<0){
	    System.out.println("The number is negative");
	  }else{
	    System.out.println("The number is neutural");
	  }
		
		
		
		
		
		
		
		
		
		
		
	}}

