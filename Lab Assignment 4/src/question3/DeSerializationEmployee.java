package question3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationEmployee {

	public static void main(String[] args) {

		try {

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("serialFile.txt")));

			Employee employee = (Employee) ois.readObject();

			System.out.println("Deserialization done");
			System.out.println("Deserialized Object is: " + employee);
			System.out.println();
			employee.display();

		}

		catch (IOException e) {
			e.printStackTrace();
		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
