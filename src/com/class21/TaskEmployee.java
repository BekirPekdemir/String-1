package com.class21;
	
	/*
	Create a Class called Employee:
	Create three  variables  eID , salary and set the CEO to “Sumair”
	Create two objects of the class Employee
	Set the value of eID, salary for each of the objects
	Print out the eID , salary and  CEO for each of the objects
	*/

	public class TaskEmployee {
	
	  	static String Ceo=" Sumair ";
	    String eID;
	    int salary;
	    
	    public static void main(String[] args) {
	    
		TaskEmployee obj1 = new TaskEmployee();
		obj1.eID="Bekir ";
		obj1.salary=100000 ;
		
		TaskEmployee obj2= new TaskEmployee();
		obj2.eID="Sedat ";
		obj2.salary=110000 ;
	    
		obj1.infoEmployee();
	    obj2.infoEmployee();
	    
	    }

	public void infoEmployee() {
	    System.out.println(eID + salary + Ceo);

	}
	
}
	
