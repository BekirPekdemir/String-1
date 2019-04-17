package com.class14;

public class TaskStringManipulation {

	public static void main(String[] args) {
		
		/*Create a String that will hold a sentence. 
		 * Write a program to get a new String without any spaces.
		 
		 * You have a String a=“Today is a good day! It is Thursday! We have a Java Class!
		 * “. How would you find out how many sentences are in that String?
		 */

		
		String str = "Today is saturday";
		String newStr=str.replace(" ", "");
		System.out.println(newStr);
		
		//Create a String that should be combination of letters, numbers and special characters.
		//Find out how many alpha characters are there in the String.

		System.out.println();
		
		String str1="439 && Good to see you%^&";
		String newString=str1.replaceAll("[^A-Za-z]", "");
		System.out.println(newString.length());
		
		System.out.println();
		
		String a = "“Today is a good day! It is Thursday! We have a Java Class!";
		String[] array=a.split("a[?]");
		System.out.println(array.length);
		

	}

}
