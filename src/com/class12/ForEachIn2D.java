package com.class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		/*
		 * Create a grocery list: fruits{}
		 * veggies {}
		 * dairy {}
		 * Retrive  all values using 2 different loops
		 */

		String [][] list = {
				{"Apple", "Banana","Mango"}, 
				{"Parsley","potato","eggplant"}, 
				{"butter","cheese","milk"}};
		for (int i=0; i<list.length; i++) {
			for (int a=0; a<list[i].length; a++) { 
				System.out.print(list[i][a]+ ", ");
			}
		 System.out.println();
		}
		for (String[] grocery:list) {
			for (String num:grocery) {
				System.out.print(num+" ");
			}
		}
		
		}
	
	}


