package com.class22;

public class Child2 extends Parent{

	String hairType="straight";
	
	public static void main(String[] args) {
		
		Child2 childObject=new Child2();
		System.out.println("Child2 eye color "+childObject.eyeColor);
		System.out.println("Child2 hair color "+childObject.hairColor);
		System.out.println("Child2 has "+childObject.nose+" nose");
		
		
		childObject.playTennis();
		childObject.playSoccer();
		childObject.driverCar();
		childObject.sing();
		Parent parentObject=new Parent();
		//parentObject.hairType --> not accessible in Parent Class
		//parentObject.playTennis()--> not accessible in Parent Class
		
	}
	
	public void playTennis() {
		System.out.println("Child2 can play tennis");
	}
	public void playSoccer() {
		System.out.println("Child2 can play soccer");
	}
	public static void driverCar() {
		System.out.println("Child2 can driver car");
	}
}
