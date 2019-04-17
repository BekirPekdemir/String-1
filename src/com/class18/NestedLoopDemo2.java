package com.class18;

public class NestedLoopDemo2 {

	public static void main(String[] args) {
		
		NestedLoopDemo2 obj = new NestedLoopDemo2();
		obj.exercise1();
		obj.exercise2();
		obj.exercise3();
		obj.exercise4();
		}
		
		
			
			
	/*
	 *  ******	 rows=4, columns=6
	 *  *	 *
	 *  *    *
	 *  ****** 
	 */
	
             
  
	
	void exercise1() {
		for (int i=1; i<=7; i++) {
			
			for (int y=1; y<=7; y++) {
				
				System.out.print(y);
			}
			System.out.println();
		
		
	}

	}
	void exercise2() {
		for (int a=0; a<4; a++) {
			
			for (int b=0; b<6; b++) {
				
				System.out.print("*");
			}
			System.out.println();
		
	}
	
}
	void exercise3() {
		for (int a=5; a>0; a--) {
		
		for (int b=5; b>0; b--) {
		
		System.out.print(b);
		}
	System.out.println();	
}
	
}
	void exersize4() {
		
		for (int k=1; k<=4; k++) {
	        
			for (int h=1; h<=k; h++) {
	            
				System.out.print("*");
			}
			
			System.out.println();
			}

}
	void exercise4() {
		
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
	