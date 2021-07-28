package vehicleOverriding;

public class SportsCar extends Car {
	
	private int noOfDoors=2;
	
	public SportsCar(int noOfWheel, int noOfPassenger, int model, String make) {
		super(noOfWheel, noOfPassenger, model, make, 2);
	}
	
	public void display() {
		System.out.println("Number of Doors of Sports Car is: "+this.noOfDoors);
	}
}
