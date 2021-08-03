package question1;

import java.util.*;

public class EmployeeMainApp {
	
	private static void increaseRate(Scanner obj1, List<Employee> employeesList) {
		
		System.out.println("Input 1: For Salaried Employee");
		System.out.println("Input 2: For Hourly Employee");
		System.out.println("Input 3: For Comission Employee");
		int inputEmployee = obj1.nextInt();
		
		System.out.println("Enter Increase Rate of the Employee: ");
		double percentageIncrease = obj1.nextDouble();
		
		switch (inputEmployee) {
		
		case 1:
			for (Employee employee : employeesList) {
				if (employee instanceof SalariedEmployee) {
					employee.increaseRate(percentageIncrease);
				}
			}
			break;
			
		case 2:
			for (Employee employee : employeesList) {
				if (employee instanceof HourlyEmployee) {
					employee.increaseRate(percentageIncrease);
				}
			}
			break;
			
		case 3:
			for (Employee employee : employeesList) {
				if (employee instanceof CommisionEmployee) {
					employee.increaseRate(percentageIncrease);
				}
			}
			break;
			
		default:
			System.out.println("Invalid Input.");
			break;
			
		}
	}

	private static void printEmployeesList(List<Employee> employeesList) {
		
		int currentIndex = 0;
		for (Employee employee : employeesList) {
			System.out.println( (currentIndex+1) + ". Employee: " );
			employee.display();
			System.out.println();
			currentIndex++;
		}
		
	}

	private static void addNewEmployee(Scanner obj1, List<Employee> employeesList) {
		
		System.out.println("Input 1: To Add Salaried Employee");
		System.out.println("Input 2: To Add Hourly Employee");
		System.out.println("Input 3: To Add Comission Employee");
		int inputEmployee = obj1.nextInt();
		
		System.out.println("Enter the ID of Employee: ");
		int id = obj1.nextInt();
		
		System.out.println("Enter the Name of Employee: ");
		String name = obj1.next();

		switch (inputEmployee) {
		
		case 1:
			System.out.println("Input Weekly Salary of the Employee: ");
			double weeklyAmount = obj1.nextDouble();
			
			Employee newEmployee1 = new SalariedEmployee(id, name, weeklyAmount);
			employeesList.add(newEmployee1);
			System.out.println("New Salaried Employee Added.");
			break;
			
		case 2:
			System.out.println("Input Hourly Salary of the Employee: ");
			double perHourAmount = obj1.nextDouble();
			
			System.out.println("Input hours worked per week by the Employee: ");
			int hoursWorkedPerWeek = obj1.nextInt();
			
			Employee newEmployee2 = new HourlyEmployee(id, name, hoursWorkedPerWeek, perHourAmount);
			employeesList.add(newEmployee2);
			System.out.println("New Hourly Employee Added.");
			break;
		
		case 3:
			System.out.println("Input Weekly Sale by the Employee: ");
			double weeklySale = obj1.nextDouble();
			
			System.out.println("Input percentage of sales of the Employee: ");
			double percentageOfSales = obj1.nextDouble();
			Employee newEmployee3 = new CommisionEmployee(id, name, weeklySale, percentageOfSales);
			
			employeesList.add(newEmployee3);
			System.out.println("New Commission Employee Added.");
			break;
			
		default:
			System.out.println("Invalid Input.");
			break;
		}
		
	}

	public static void main(String[] args) {
		
		List<Employee> employeesList = new ArrayList<>();
		Scanner obj1 = new Scanner(System.in);
		int input;

		do {
			System.out.println("Input 1: Add Employee in the current list");
			System.out.println("Input 2: Print Employee in the current list");
			System.out.println("Input 3: Increase Rate for the employee");
			System.out.println("Input 4: Exit out of the system");

			input = obj1.nextInt();

			switch (input) {
			
			case 1:
				addNewEmployee(obj1, employeesList);
				break;
				
			case 2:
				printEmployeesList(employeesList);
				break;
				
			case 3:
				increaseRate(obj1, employeesList);
				break;
				
			case 4:
				System.out.println("Thank you for visiting");
				break;
				
			default:
				System.out.println("---Wrong choice---");
				break;
				
			}

		} while (input != 4);

	}

}
