package com.class14;

public class StringSplit {

	public static void main(String[] args) {
		
		String str = "Wellcome Syntax Students! Batch 4 you are great";
		String[] array = str.split("!");
		System.out.println("The length of the array is "+array.length);
		for (String substring: array) {
			System.out.println(substring);
		}
		System.out.println("------------------");
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
