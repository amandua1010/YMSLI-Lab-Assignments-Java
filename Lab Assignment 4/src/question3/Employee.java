package question3;

import java.io.Serializable;

class Address implements Serializable {
	
	private String address;

	public Address(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

}

public class Employee implements Serializable {
	
	private String id;
	private String name;
	private Address empAddress;
	private double salary = 30000;

	public Employee(String id, String name, Address empAddress) {
		
		this.id = id;
		this.name = name;
		this.empAddress = empAddress;
		
	}

	void display() {
		System.out.println("Employee: ");
		System.out.println("ID of the Employee: " + id);
		System.out.println("Name of the Employee: " + name);
		System.out.println("Employee Address: " + empAddress.getAddress());
		System.out.println("Salary of the Employee: " + salary);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getEmpAddress() {
		return empAddress;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", empAddress=");
		builder.append(empAddress);
		builder.append("]");
		return builder.toString();
	}
	
}
