package com.class9;

import java.util.Scanner;

public class NestedLoopTask4 {

	public static void main(String[] args) {
		/* Write a guessing game where the user has to guess a secret number between 1
        * and 20. After every guess input, the program tells the user whether their
        * number was too large or too small. The program will keep asking the user to
        * enter the number until he finds the correct number. When the correct answer
        * is found the system should display "Congratulations!!. You got it!".
        */

       int a, b, input;
       b = 7;

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       input = sc.nextInt();
       
       while (input != b) {
           
    	   if (input < b) {
               System.out.println("your number too small");
               input = sc.nextInt();
           } else if (input > b) {
               System.out.println("your number too big");
               input = sc.nextInt();
           }
       }
       System.out.println("Congratulations!!. You got it!");
	
	}
}
