package question3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationEmployee {

	public static void main(String[] args) {
		
		try {
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("serialFile.txt")));
			
			Address address = new Address("New Delhi");
			Employee employee = new Employee("1", "EgEmployee", address);
			
			
			oos.writeObject(employee);
			
			System.out.println("Serialization performed and serializing object is: ");
			System.out.println(employee.toString());
		
		} 
		
		catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}

}
