package vehicleOverriding;

public class Car extends Vehicle {
	
	private int noOfDoor;

	public Car(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor) {
		
		super(noOfWheel, noOfPassenger, model, make);
		this.noOfDoor = noOfDoor;
	
	}
	
	public void display() {
		
		System.out.println("Details of Car are as follows:");
		super.display();
		System.out.println("No of Doors of Car: " + this.noOfDoor);
	
	}
	
}
