package com.class1;

public class TaskString4 {

	public static void main(String[] args) {
		
		/*
		 * Create a String and print it in reverse order (Sunday → yadnuS).
		 * 
		 * Create a String and if the String is not empty perform the following:
		 * if the String has an odd number of characters and has 3 or more characters,
		 * print the character in the middle of the String
		 * 
		 */
		
		String text="Good morning every one";
        for(int i=text.length()-1; i>=0; i--) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
        
        if(!(text.isEmpty())) {
            if(text.length()%2!=0 && text.length()>3) {
                
                System.out.println(text.charAt(text.length()/2));
                
            }
        }
    }
}

