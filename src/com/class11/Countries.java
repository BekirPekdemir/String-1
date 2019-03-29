package com.class11;

public class Countries {

	public static void main(String[] args) {
		
		
		//Create an array of countries. While retrieving all values from an array print capital for each country. 
		// (use 2 different loops).

	

		String[]country= {"Russia","Usa", "Kazakstan", "Turkey"};
        for(int i=0; i<=country.length-1;i++) {
            
        	if(country[i].equals("Usa")) {
                System.out.println("Capital is Washington DC");
            }
        	else if(country[i].equals("Russia")) {
                System.out.println("Capital is Moscow");
            }
        	else if(country[i].equals("Kazakstan")) {
                System.out.println("Capital is Nursultan");
        	}
        	else if(country[i].equals("Turkey")) {
                System.out.println("Capital is Ankara");		
		}
	
        	        	
        	
        	
        }
       }
	}
