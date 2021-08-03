package question1;

//import java.util.*;

public abstract class Employee {
	
	private int id;
	private String name;
	
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	abstract void setRate(double percentage);
	
	abstract double getWeeklySalary();	
	
	abstract void increaseRate(double percentage);

	public abstract void display();
	
}
