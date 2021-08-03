package question2.employee;

public class CommisionEmployee extends Employee {
	
	private double weeklySale;
	private double percentageOfSales;
	
	CommisionEmployee(int id, String name, double weeklySale, double percentageOfSales) {
		
		super(id, name);
		this.weeklySale = weeklySale;
		this.percentageOfSales = percentageOfSales;
	
	}

	@Override
	public void setRate(double percentageOfSales) {
		this.percentageOfSales = percentageOfSales;
	}

	@Override
	public double getWeeklySalary() {
		return ( weeklySale * percentageOfSales )/ 100;
	}

	@Override
	public void increaseRate(double percentage) {
		percentageOfSales += ( percentage * percentageOfSales )/ 100;
	}
	
	public void display() {
		System.out.println("Name of the Employee: " + getName());
		System.out.println("Weekly Sale of the Employee: " + weeklySale);
		System.out.println("Percentage Rate of the Employee: " + percentageOfSales);
//		System.out.println("Daily salary :" + df.format(getWeeklySalary() / 7));
		System.out.println("Weekly salary: " + getWeeklySalary());
//		System.out.println("Total salary :" + df.format(getSalary()));
	}
	
}
