package vehicleOverriding;

public class Vehicle {
	
	private int noOfWheel;
	private int noOfPassenger;
	private int model;
	private String make;
	
	public Vehicle(int noOfWheel, int noOfPassenger, int model, String make) {
		
		this.noOfWheel = noOfWheel;
		this.noOfPassenger = noOfPassenger;
		this.model = model;
		this.make = make;
		
	}
	
	public void display() {
		
		System.out.println("Make of the Car: " + this.make);
		System.out.println("Model of the Car: " + this.model);
		System.out.println("No of Wheels of the Car: " + this.noOfWheel);
		System.out.println("No of Seats/ Passengers in the Car: " + this.noOfPassenger);
	
	}
	
}
