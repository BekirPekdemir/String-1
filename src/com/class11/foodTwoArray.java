package com.class11;

public class foodTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] food = {
				{"burger", "fries", "hot dog", "meatloaf"},
				{"lo mein", "fried rice"},
				{"biriyani", "korma", "naan", "chick peas"}
		};
		
		for (int i=0; i<food.length; i++) {
			System.out.println("I love "+food);
			for (int j=0; j<food.length; j++) {
				System.out.println();
			}
		}
		
	}
}
