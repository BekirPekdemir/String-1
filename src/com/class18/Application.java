package com.class18;

import com.class17.Calculator;
import com.class17.Greeetings1;

public class Application {

	public static void main(String[] args) {
		
		ScannerMethod scnMthd = new ScannerMethod();
		System.out.println(scnMthd.sum(123, 150));	
		
		NestedLoopDemo demo = new NestedLoopDemo();
		demo.printNumber();
	
		NestedLoopDemo2 obj = new NestedLoopDemo2();
		obj.exercise1();
		obj.exercise2();
		obj.exercise3();
		obj.exercise4();
		
		Greeetings1 obj1 = new Greeetings1();
		obj1.askHowAreYou("Omer 1234 @#$%^&");
		
		Calculator cal = new Calculator();
		
		 System.out.println( cal.sum(12, 23));
	}

	
}
