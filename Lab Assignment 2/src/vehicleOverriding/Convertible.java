package vehicleOverriding;

public class Convertible extends Car {
	
	private boolean isHoodOpen;
	
	public Convertible(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor, boolean isHoodOpen) {
		
		super(noOfWheel, noOfPassenger, model, make, noOfDoor);
		this.isHoodOpen=isHoodOpen;
	
	}
	
	public void display() {
		
		System.out.println("Details of Convertible Car are as follows:-");
		super.display();
		
		if(this.isHoodOpen == true) {
			System.out.println("The hood of Convertible Car is Open");
		}
		
		else {
			System.out.println("The hood of Convertible Car is closed");
		}
		
	}
	
}
