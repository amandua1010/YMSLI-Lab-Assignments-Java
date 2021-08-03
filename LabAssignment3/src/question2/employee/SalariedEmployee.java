package question2.employee;

public class SalariedEmployee extends Employee {
	
	private double weeklyAmount;
	
	SalariedEmployee(int id, String name, double weeklyAmount) {
		super(id, name);
		this.weeklyAmount = weeklyAmount;
	}
	
	@Override
	public void setRate(double weeklyAmount) {
		this.weeklyAmount = weeklyAmount;
		System.out.println("weekly amount salaried.");
	}
	
	@Override
	public double getWeeklySalary() {
		return weeklyAmount;
	}
	
	@Override
	public void increaseRate(double percentage) {
		weeklyAmount += ( weeklyAmount * percentage )/ 100;
	}
	
	@Override
	public void display() {
		System.out.println("Name of the Employee: " + getName());
//		System.out.println("Daily salary:" + df.format(weeklySalary / 7));
		System.out.println("Weekly Salary of the Employee: " + weeklyAmount);
//		System.out.println("Total salary :" + df.format(getSalary()));
	}
	
}
