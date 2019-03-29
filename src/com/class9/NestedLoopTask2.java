package com.class9;

import java.util.Scanner;

public class NestedLoopTask2 {

	public static void main(String[] args) {
		
		/*Ask user to enter the item they want to buy and  the price for the item. 
		 *Then ask user to pay for it. 
		 *Every time user enters money accumulate the amount and tell user how much is left to pay off the amount. 
		 *Whenever user done with payments tell them "Thank you for shopping!"
		*/
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter your item");
		String item=scan.nextLine();
		System.out.println("Please enter your item price");
		int itemPrice=scan.nextInt();
		int remainBalance = itemPrice;
		int totalPayment = 0, payment;
		
		do {
			System.out.println("Please enter payment amount");
			payment =scan.nextInt();
			totalPayment += payment;
			remainBalance = itemPrice - totalPayment;
			System.out.println("Your pay off amount is: "+remainBalance);
						
		} while (remainBalance > 0);
		System.out.println("Thank you for shopping");
		
	}
}
