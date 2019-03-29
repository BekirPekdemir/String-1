package com.class1;

public class TaskString2 {

	public static void main(String[] args) {
		
		
		//Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters and has 3 or more characters, 
		//print the character in the middle of the String

			String myWord=new String("Wasington");
			
			if (!myWord.isEmpty()) {
				if (myWord.length()%2!=0 && myWord.length()>=3) {
					System.out.println(myWord.charAt(myWord.length()/2));
				}
			}
			
	
	
	}

}
