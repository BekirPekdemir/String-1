package com.class11;

public class TaskMrMiss {

	public static void main(String[] args) {
		
		// 
		
		String [][] names = {
								{"Mr", "Mrs", "Ms", "Miss"},
								{"Smith", "Jordan", "Jakson", "Obama"}
							};
			System.out.println(names[0][1]+" "+names[1][0]);
			System.out.println(names[0][0]+" "+names[1][3]);
			System.out.println(names[0][2]+" "+names[1][2]);
			System.out.println(names[0][3]+" "+names[1][2]);
	}

}
