package com.class14;

public class TaskSwapNumber {

	public static void main(String[] args) {
	
		// write a program to swap 2 numbers without a temporary variable? Swap 2 strings without a temporary variable?
		
		int x=10;
		int y=50;
		
		x=y*x;
		y=x/y;
		y=x/y;
		x=x/y;
		System.out.println(x);
		System.out.println(y);
		String a="Bekir";
		String b="Anar";
		System.out.println(a.replace("Bekir", "Anar"));
		System.out.println(b.replace("Anar", "Bekir"));
		
		System.out.println();
		
		int num[] = {98,14,1367,368,87};
		int max=num[0];
		int min=num[0];
		int secondMax=num[1];
		
		for (int i=0; i<=num.length-1; i++) {
			if (max<=num[i]) {
				max=num[i];
			}
			if (min>=num[i]) {
				min=num[i];
			}
			if (secondMax<=max) {
				secondMax=num[i];
			}
		
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(secondMax);
		
		System.out.println();
		
		
		
		
	
	}	
}
	


