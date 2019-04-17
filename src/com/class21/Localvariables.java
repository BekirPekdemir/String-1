package com.class21;

public class Localvariables {

	public static void main(String[] args) {
		Localvariables obj = new Localvariables();
		String name = " ";
		obj.hello(name);
		System.out.println(name);

	}
	public static void hello(String name) {
		name="Jack";
		System.out.println("Hello "+name);
	}

}
