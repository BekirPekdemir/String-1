package com.class9;

public class NestedLoopDemo2 {

	public static void main(String[] args) {
		
		for (int i=1; i<=7; i++) {
			
			for (int y=1; y<=7; y++) {
				
				System.out.print(y);
			}
			System.out.println();
		}
		/*I want to print pattern
		 * 1111111---> rows=7, columns=7
		 * 2222222
		 * 3333333
		 * 4444444
		 * 5555555
		 * 6666666
		 * 7777777
		 * */

		for (int a=0; a<4; a++) {
			
			for (int b=0; b<6; b++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*---------------------*/
		
			for (int a=5; a>0; a--) {
			
				for (int b=5; b>0; b--) {
				
				System.out.print(b);
				}
			System.out.println();	
		}
		
	/*-----------------------------------------*/
			
			for (int k=1; k<=4; k++) {
		        
				for (int h=1; h<=k; h++) {
		            
					System.out.print("*");
				}
				
				System.out.println();
				}
	
	/*
	 *  ******	 rows=4, columns=6
	 *  *	 *
	 *  *    *
	 *  ****** 
	 */
	
             for (int i=1; i<=4; i++) {
		        
				  for (int h=1; h<=6; h++) {
		            
					  if (i==1 || i==4 || h==1 || h==6) {
						  
						  System.out.print("*");
				  	}else {
				  		System.out.print(" ");	
				  	}
					  
				  	}
				
				  System.out.println();	
	}
  }
}
