package com.class12;

public class Recap {

	public static void main(String[] args) {

		int [][] arr = {
				{1,2,3}, // 1 array that stored with index 0
				{10,20,30}, // 2 array that stored with index 1
				{100,200,300}};// 3 array that stored with index 2
		for (int i=0; i<arr.length; i++) {
			for (int a=0; a<arr[i].length; a++) { //0 //1 //2
				System.out.print(arr[i][a]+",");
			}
		 System.out.println();
		}
		
		System.out.println("------For each Loop-------");
		for (int[]singleArray : arr) {
			for (int numbers : singleArray) { //{1,2,3}
				System.out.print(numbers+" ");
			}
		System.out.println();
		}
	
	
	
	
	}

}
