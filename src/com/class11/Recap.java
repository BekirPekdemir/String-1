package com.class11;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String [] names = new String[6];
	
	names [0] = "Asel";
	names [1] = "Awet";
	names [2] = "Arif";
	names [3] = "Weqas";
	names [4] = "Dzmitri";
	names [5] = "Shiva";
	
	for (int i=0; i<names.length; i++) {
		System.out.println(names[i]);
	}
	// 2. create an array using array literal
	// 0 1 2 3 4 5
	System.out.println("-------For  loop---------");
	
	String[] studentNames = {"Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank"};
	for (int i=0; i<=studentNames.length-1; i++) {
		System.out.println(studentNames[i]);
	}
	System.out.println("-------Advanced for loop---------");
	
	// retrieve values using: advanced for loop, for each
	for (String student : studentNames) {
		System.out.println(student);
	}
	
	
	
	
	
	
 }
}
