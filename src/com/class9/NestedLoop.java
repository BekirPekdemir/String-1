package com.class9;

public class NestedLoop {

	public static void main(String[] args) {
		
		for (int i=0; i<3; i++) {
						
			for (int y=0; y<4; y++) {
				
				System.out.println("I am outer loop"+y);	
			}
		
		System.out.println("-----I am outer loop----"+i);
		}

	}

}
