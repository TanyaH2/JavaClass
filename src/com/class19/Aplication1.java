package com.class19;

public class Aplication1 {
	public static void main(String[] args) {
		// pet-local variable
		Animal pet1 = new Animal();

		System.out.println(pet1.breed);
		System.out.println(pet1.name);
		System.out.println(pet1.weight);
		System.out.println(pet1.age);
		pet1.canBark();
		pet1.isWild();

		System.out.println();

		Animal pet2 = new Animal();
		pet2.name = "Roxy";

		System.out.println(pet2.breed);
		System.out.println(pet2.name);
		System.out.println(pet2.weight);
		System.out.println(pet2.age);
		pet2.canBark();
		System.out.println(pet2.isWild());
		System.out.println();

		Animal pet3 = new Animal();
		// pet3.name = "Linda";

		System.out.println(pet3.breed);
		System.out.println(pet3.name);
		System.out.println(pet3.weight);
		System.out.println(pet3.age);
		pet3.canBark();
		pet3.isWild();

//		Minimum num=new Minimum();
//	 num.minOfValues(min);

		int my_array[] = { 11, 2, 3, 4, 5, 6, 7, 8, 1, 9, 10 };
		System.out.println("printing the minimum value");

		System.out.println(Minimum.minOfValues(my_array));
		// Minimum.minOfValues(my_array);

		int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		System.out.println(MinMax.minOfValues1(array));
		System.out.println(MinMax.maxOfValues(array));
		
		
		//////////////////////////////////////
		
		
		System.out.println("------------");
		
		Calculator cal=new Calculator();
		
		
		System.out.println(cal.sum(3, 4, 5));

		System.out.println(Calculator.average(3, 4, 5));

		System.out.println(Calculator.min(3, 4, 5));

		System.out.println(Calculator.max(3, 4, 5));
	}

}
