package com.class1;

import java.util.Scanner;

public class TaskString3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        System.out.println("Moms first name?");
        String momsName=sc.nextLine();
        System.out.println("Dad’s first name?");
        String dadName=sc.nextLine();
        System.out.println("Boy or Girl?");
        String gender=sc.nextLine();
        
        switch(gender){
        
        case "girl":
            System.out.println(momsName.substring(0, momsName.length()/2)+dadName.substring(dadName.length()/2));
            break;
        case "boy":
            System.out.println(dadName.substring(0, dadName.length()/2)+momsName.substring(momsName.length()/2));
            break;

	}
  }
}
