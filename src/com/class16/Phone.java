package com.class16;

public class Phone {

	
	String  brand;
	Boolean bluetooth;
	int screen, ram;

		public static void main(String[] args) {
			
			Phone ph1= new Phone();
			ph1.brand="Iphone";
			ph1.bluetooth=true;
			ph1.screen=2;
			ph1.ram=16;
						
			ph1.watchMovie();
			ph1.playMusic();
			
			Phone ph2= new Phone();
			ph2.brand="Android";
			ph2.bluetooth=true;
			ph2.screen=4;
			ph2.ram=32;
			
			ph2.watchMovie();
			ph2.playMusic();
			
			Phone ph3= new Phone();
			ph3.brand="Iphone";
			ph3.bluetooth=true;
			ph3.screen=6;
			ph3.ram=64;
						
			ph3.watchMovie();
			ph3.playMusic();
		
	}

		private void playMusic() {
			System.out.println("We can wacth movie on a phone "+brand);
		}

		private void watchMovie() {
			System.out.println("We can wacth movie on an our phone "+brand);
		}



}
