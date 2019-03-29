package com.class7;

	import java.util.Scanner;

	public class ScannerAndLoop {

		public static void main(String[] args) {
		
				
		/*Ask user to pay for a soda
		 *keep asking user to pay for soda until entered price is not equl 1.99 
		 *after user got a right amount print "Please enjoy your soda"
		 */
		
			Scanner scan = new Scanner(System.in);
			double amount;
			do {
			System.out.println("Please pay for your soda");
			amount = scan.nextDouble();
			}
			while (amount!=1.99); 
			System.out.println("Please enjoy your soda");
	
	}
	
}