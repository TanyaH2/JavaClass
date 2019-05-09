package com.class23_2;

import com.class23.Employee;

public class WaterFallTeam extends Employee {
	public static void main(String[] args) {

		WaterFallTeam wt = new WaterFallTeam();
		wt.salary1 = 90000; // Protected variables and methods can be accessed from a different package
							// through inheritance ONLY
		// wt.salary; - default values cannot be accessed in different package
		wt.getPaid();
		;

		wt.test(); // available cause it is protected
		// wt.test1(); - NOT available cause it is default
	}

}
