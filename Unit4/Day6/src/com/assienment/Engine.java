package com.assienment;

public class Engine {
	int rmp ;
	int power ;
	String manufacturer;
	boolean hasTurbo = false ;
	
	public boolean enableTurbo() {
		hasTurbo = true ;
		return hasTurbo ;
		
	}
	
	public static void main(String[] args) {
		Car car1 = new Car("Harrier" , "Tata" , "black" ,new Engine()) ;
		car1.engine.manufacturer = "tata" ;
		car1.engine.rmp = 10000  ;
		car1.engine.power = 110 ;
		
		System.out.println("First Car Details");
		car1.printDetails(); 
		
		System.out.println("\nSecond Car Details");
		Car car2 = new Car() ;
		car2.model = "Nano" ;
		car2.companyName = "Tata" ;
		car2.color = "Orange" ;
		car2.engine = new Engine() ;
		car2.engine.rmp = 7000 ;
		car2.engine.power = 80 ;
		car2.engine.manufacturer = "Tata"  ;
		car2.printDetails();
	}
}
