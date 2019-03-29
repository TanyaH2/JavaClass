package com.class11;

public class RetrievingAllValues {
public static void main(String[] args) {
	
	int[][] num= {
			{11,12,13,14},
			{21,22,23},
			{31,32,33,34}
	};
//	
//	int rows=num.length;
//	System.out.println(rows);
//	
//	int cols=num[0].length;
//	System.out.println(cols);
	
	for (int row=0; row<num.length; row++) {
		for (int col=0; col<num[row].length; col++) {
			System.out.print(num[row][col]+ " ");
		}
		System.out.println();
	}
	
	
	
	String[][] food= {
			{"burger", "fries",  "hot dog", "meatloaf"},
			{"lo main", "fried rice","white rice"},
			{"biriyani","korma","naan", "chick peas"}
	};
	
	for (int a=0; a<food.length; a++) {
		
		for (int q=0; q<food[a].length; q++) {
			System.out.print("I love "+food[a][q]+". ");
		}
		System.out.println();
	}
	
	System.out.println("----------------------------");
	
	for (int a=0; a<food.length; a++) {
		System.out.print(" I love ");
		for (int q=0; q<food[a].length; q++) {
			
			System.out.print(food[a][q]+", ");
		}
		System.out.println();
	}
	System.out.println("-------------------------");
 	//at home advanced
	//1. Create an array of cars: american cars, german cars, korean cars, italian cars. Retrieve all values
	String[][] cars={
	{"Ford","Lincoln","GMC","Buick"},
    {"BMW","MB","Audi"},
    {"KIA","Hyundai","Daewoo","SsangYong"},
    {"Alfa Romeo","Ferrari","Lamborghini", "Maserati"}};
	
	for (int a=0; a<cars.length; a++) {
		for (int q=0; q<cars[a].length; q++) {
		System.out.print(cars[a][q]+", ");
	}
		System.out.println();
	}
	
	
	System.out.println("---------------------------");
	//2. Create an array of countries: north america countries, south america countries, europe countries, 
	//asian countries,african countries. Print all values   from that array
	
	String[][] countries= {
			{"USA", "Canada","Cuba","Mexico","Jamaica"},
			{"Brazil", "Venezuella","Argentina", "Peru","Chile","Ecuador"},
			{"Ukraine", "Italy", "Spain", "France"," England"},
			{"Japan"," China", "Korea", "Tailand","India"},
			{"Algeria", "Tanzania","Uganda","Ghana"}
	};
	for(int a=0; a<countries.length; a++) {
		for(int z=0; z<countries[a].length; z++) {
			System.out.print(countries[a][z]+", ");
		}
		System.out.println();
	}
	
	
	
	
}
}
