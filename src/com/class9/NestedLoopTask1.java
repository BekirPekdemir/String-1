package com.class9;

import java.util.Scanner;

public class NestedLoopTask1 {

	public static void main(String[] args) {
		
		/* 1- Write a program that reads a range of integers (start and end point), provided
		 * by a user and then from that range prints the sum of the even and odd integers.
		 * 
		 * 2-Ask user to enter the item they want to buy and the price for the item. Then ask 
		 * user to pay for it. Every time user enters money accumulate
		 */
	
		int startRange, endRange;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter start range");
		startRange=scan.nextInt();
	
		System.out.println("Please enter end points");
		endRange=scan.nextInt();
		int sumOdd=0, sumEven=0;
			for (int x=startRange; x<=endRange; x++) {
				
				if (x%2==0) {
					sumEven+=x;
				}else {
					sumOdd+=x;
				}
				
			}
		System.out.println("Odd total is: " +sumOdd+ "Even total is: " +sumEven);
	
	
	
	
	}

}
