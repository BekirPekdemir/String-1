package com.class11;

public class TaskMakeCar {

	public static void main(String[] args) {
		// Create an array of cars:american,german,korean, italian. Than retrieve all values from that array.
		
		String[][] carsCountry = {{"FORD", "GMC", "Dodge"},
				{"AUDI", "Mercedes", "BMW"},
				{"Hyundai", "KIA"},
				{"Fiat", "Alfa Romeo", "Masarati"}};
		for (int i=0; i<carsCountry.length; i++){
			for (int a=0; a<carsCountry[i].length; a++) {
				System.out.print(carsCountry[i][a]+" ");
			}
		}System.out.println();
}
}
