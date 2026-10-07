package InterfaceAbstractionAccessModifier;

interface Vehicle {
     void start();
     void stop();
}

class Car implements Vehicle{
	public void start() {
		 System.out.println("Car starts");
	}
	public void stop() {
		 System.out.println("Car starts");
	}
}

class Bike implements Vehicle {

    
    public void start() {
        System.out.println("Bike starts");
    }

    
    public void stop() {
        System.out.println("Bike stops");
    }
}
