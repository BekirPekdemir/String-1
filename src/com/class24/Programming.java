package com.class24;

public class Programming {

		/*
		*1. Create a class named �Programming�. While creating an object of the class, 
		*if nothing is passed to it, then the message �I love programming languages� should be printed. 
		*If some String is passed to it, then in place of �programming languages� the value variable should be printed. Example, if we pass �Java�, then �I love Java� should be printed.
		2. Create 1 class with a static method that has 3 overloaded forms. 
		Then call each overloaded method with specific arguments and observe result.
		3. Create 1 class with a private method that has 3 overloaded forms. 
		Then call each overloaded method with specific arguments and observe result. (edited)  
		 */

		public Programming(){
			System.out.println("I love programming languages");
		}

		public Programming(String str){
			System.out.println("I love language "+str);
		}

		public static void main(String[] args) {
			Programming obj = new Programming();
			Programming obj1 = new Programming("Java");
	
	}

}
