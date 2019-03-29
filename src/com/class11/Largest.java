package com.class11;

public class Largest {

	public static void main(String[] args) {
		
		// create an array of integers and find largest number
		  
		        
		        int[] numbers = { 115, 19, 3221, 1, 441, -23417, 9 };
		        int largest= numbers[0];
		        
		        for (int i = 0; i<=numbers.length-1; i++) {
		            if (numbers[i]>largest) {
		            	largest = numbers[i];
		            }
		        }
		     
		        System.out.println("The largest number is "+largest);

	}

}
