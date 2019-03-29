package com.class11;

public class TaskCars {

	public static void main(String[] args) {
		
		/*
		 *Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		 * 
		 * */

			String[] carNames = {"BMW", "Mercedes", "Toyota", "Honda", "Mazda", "Ford"};
			for (int i=0; i<=carNames.length-1; i++) {
			System.out.println(carNames[i]); 
			}
	
	System.out.println("-------------");
	
			for (String cars : carNames) {
				System.out.println(cars);
	
			}
	
	}

}
