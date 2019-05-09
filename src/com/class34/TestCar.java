package com.class34;

import java.util.*;

public class TestCar {
	public static void main(String[] args) {

		// Create a map in which we will store carNumber and Car Object itself

		Car car1 = new Car("Toyota", "Corolla");
		Car car2 = new Car("Honda", "Accord");
		Car car3 = new Car("Lada", "Priora");
		car1.printCarDetails();
		car2.printCarDetails();
		car3.printCarDetails();

		System.out.println();

		Map<Integer, Car> carMap = new HashMap<>();
		carMap.put(1, new Car("Nissan", "Xterra"));
		carMap.put(2, new Car("Tesla", "A"));
		carMap.put(3, new Car("Ford", "F150"));

		Collection<Car> carValues = carMap.values();
		for (Car car : carValues) {
			car.printCarDetails();

		}

	}
}
