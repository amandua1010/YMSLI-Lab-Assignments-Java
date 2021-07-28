package vehicleOverriding;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		System.out.println("Input “1” to create a Vehicle object");
		System.out.println("Input “2” to create a Car object");
		System.out.println("Input “3” to create a Convertible Car object");
		System.out.println("Input “4” to create a Sports Car object");

		Scanner obj1 = new Scanner(System.in);
		
		int objectType  = obj1.nextInt();
		
		obj1.nextLine();
		
		Vehicle vehicle = null;

		System.out.println("Input Make of the Car: ");
		String make = obj1.nextLine();
		
		System.out.println("Input Model of the Car: ");
		int model = obj1.nextInt();
		
		System.out.println("Input Number of Wheels of the Car: ");
		int noOfWheel = obj1.nextInt();
		
		System.out.println("Input Number of Passengers in the Car: ");
		int noOfPassenger = obj1.nextInt();

		if(objectType == 1) {
			
			vehicle = new Vehicle(noOfWheel, noOfPassenger, model, make);
			vehicle.display();
			
		}
		
		else if(objectType == 2) {
			
			System.out.println("Input the Number of Doors for the Car: ");
			int noOfDoors = obj1.nextInt();
			
			vehicle = new Car(noOfWheel, noOfPassenger, model, make, noOfDoors);
			vehicle.display();
		
		}
		
		else if(objectType == 3) {
			
			System.out.println("Input the Number of Doors for Convertible Car:");
			int noOfDoors = obj1.nextInt();
			
			System.out.println("Is the Hood of the Convertible Car Open True or False.");
			boolean isHoodOpen = obj1.nextBoolean();
			
			vehicle = new Convertible(noOfWheel, noOfPassenger, model, make, noOfDoors, isHoodOpen);
			vehicle.display();
		
		}
		
		else if(objectType == 4) {
			
			vehicle = new SportsCar(noOfWheel, noOfPassenger, model, make);
			vehicle.display();
		
		}
		
		else {
			System.out.println("You have entered the wrong input.");
		}
		
		obj1.close();
		
	}
	
}
