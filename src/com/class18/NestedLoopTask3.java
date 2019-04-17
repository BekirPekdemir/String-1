package com.class18;

public class NestedLoopTask3 {

	public static void main(String[] args) {

		/*	*
		 * 	**
		 * 	***
		 * 	****
		 * 	*****
		 * 	****
		 * 	***
		 * 	**
		 * 	*
		 */
		
		for (int a=1; a<=5; a++) {
			
			for (int b=1; b<=a; b++) {
				
				System.out.print("*");
				}
			System.out.println();
		}
		
		for (int c=4; c>=1; c--) {
			
			for (int d=c; d>=1; d--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		
  }
}
