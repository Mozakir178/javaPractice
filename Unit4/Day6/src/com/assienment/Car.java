package com.assienment;

public class Car {
String model;
String companyName;
String color ;
Engine engine ;

 Car(){
	 
 }
 
 Car(String model , String companyName , String color ,Engine engine  ){
	 this.model = model ;
	 this.companyName = companyName ;
	 this.color = color ;
	 this.engine = new Engine() ;
	 engine.enableTurbo() ;
	
 }
 
 public void printDetails() {
	 System.out.println("Car Model : " + model);
	 System.out.println("Car companyName : " + companyName);
	 System.out.println("Car color : " + color);
	 System.out.println("Car RPM : " + engine.rmp);
	 System.out.println("Car power : " + engine.power);
	 System.out.println("Car Engine Manufacture : " + engine.manufacturer);
	 System.out.println("Car Has Turbo : " + engine.enableTurbo());
	 
 }
}
