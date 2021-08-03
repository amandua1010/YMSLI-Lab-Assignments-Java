package question2.employee;

public class HourlyEmployee extends Employee {
	
	private int hoursWorkedPerWeek;
	private double perHourAmount;
	
	
 	public HourlyEmployee(int id,String name, int hoursWorkedPerWeek, double perHourAmount) {
		
 		super(id, name);
 		this.hoursWorkedPerWeek = hoursWorkedPerWeek;
		this.perHourAmount = perHourAmount;
	
 	}

	@Override
	public void setRate(double salaryPerHour) {
		this.perHourAmount=salaryPerHour;
	}

	@Override
	public double getWeeklySalary() {
		return hoursWorkedPerWeek * perHourAmount;
	}

	@Override
	public void increaseRate(double percentage) {
		perHourAmount += ( percentage * perHourAmount )/ 100;
	}

	@Override
	public void display() {
		System.out.println("Name of the Employee: " + getName());
		System.out.println("Hourly salary of the Employee: " + perHourAmount);
		System.out.println("Weekly salary of the Employee: " + getWeeklySalary());
//		System.out.println("Total salary :" + df.format(getSalary()));
	}
	
}
