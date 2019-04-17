package com.class24;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp=new Employee();
		FullTimeEmployee ft=new FullTimeEmployee();
		Constructor constructor=new Constructor();
		
		emp.getPaid();//Employee gets paid salary
		ft.getPaid();//Full time employee gets paid salary + bonus
		constructor.getPaid();//Contractor gets paid hourly
	}

}
