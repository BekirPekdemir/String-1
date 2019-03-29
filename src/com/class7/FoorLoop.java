package com.class7;

public class FoorLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=10; i++) {
			System.out.println("Good morning "+i);
		}
		
		/* I want to print from 10 to 1*/
		
		for (int i=10; i>=1; i--) {
			System.out.println(i);
		}
	
		/*     */
		
		for (int i=0; i<=20; i+=2) {
			System.out.println(i);
		}
	
		/*print number from 1 to 100*/
		
		for (int a=1; a<=100; a++) {
			System.out.println(a);
		}
		
		/*/*print number from 100 to 1*/
		
		for (int a=100; a>=1; a--) {
			System.out.println(a);
		}
		
		/*Print odd numbers from 1 to 20*/
		
		for (int b=1; b<=20; b+=2) {
			System.out.println(b);
		}
	
		/*Print even numbers from 20 to 1*/
		
		for (int d=20; d>=1; d-=2) {
			System.out.println(d);
		}
	
		/* print even numbers between 20 and 50*/
		
		for (int d=20; d<=50; d+=2) {
			System.out.println(d);
		}
	
		/* print odd numbers between 20 and 50*/
		
		for (int d=20; d<=50; d+=3) {
			System.out.println(d);
		}
	
	}

}
