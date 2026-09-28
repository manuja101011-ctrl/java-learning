package oopsAccept;

public class Vehicle {
	private int speed;

  void start() {
	  System.out.println("Vehicle starts");
  }
  
  void stop() {
	  System.out.println("Vehicle stops"); 
  }
  
  void setSpeed(int speed) {
	  this.speed=speed;
  }
  int getSpeed() {
	  return speed;
  }
}

class 	Bike extends Vehicle{
	void start() {
		  System.out.println("Bike starts");
	}
	
}

class Car extends Vehicle{
	void start() {
		System.out.println("Car starts");
	}
	
}