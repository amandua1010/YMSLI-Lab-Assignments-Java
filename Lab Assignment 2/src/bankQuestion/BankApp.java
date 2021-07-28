package bankQuestion;
import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		
		Account account = null;
		int savingsAccountFlag = 0, currentAccountFlag = 0;
		System.out.println("Input “1” for opening Current Account");
		System.out.println("Input “2” for opening Savings Account");
	
		Scanner obj1 = new Scanner(System.in);
		int inputForAccount = obj1.nextInt();

		System.out.println("Input the Username you want to use: ");
		String userName = obj1.next();
		
		System.out.println("Input the Initial Balance: ");
		double initialBalance = obj1.nextInt();

		// user chooses to open current account
		if (inputForAccount == 1) {
			
			currentAccountFlag = 1;
			System.out.println("Input your Trade License Number: ");
			int tradeLicenseNumber = obj1.nextInt();
			account = new CurrentAccount(userName, initialBalance, tradeLicenseNumber);
			
		} 
		
		// user chooses to open a savings account
		else {
			
			savingsAccountFlag = 1;
			System.out.println("Input the Withdraw Limit for the account for one transaction: ");
			int maxWithdrawLimit = obj1.nextInt();
			account = new SavingsAccount(userName, initialBalance, maxWithdrawLimit);
			
		}

		int choice=0;
		
		do {

			System.out.println("Input “1” to Deposit Money in the account");
			System.out.println("Input “2” to Withdraw Money from the account");
			System.out.println("Input “3” to Display Balance of the account");
			System.out.println("Input “0” to Exit");
			
			choice = obj1.nextInt();
			
			if(choice == 1) {
				System.out.println("Input the amount you want to deposit in the account: ");
				double moneyDeposited = obj1.nextDouble();
				account.deposit(moneyDeposited);
			}
			
			else if(choice == 2) {
				if(savingsAccountFlag == 1) {
					System.out.println("Input the amount you want to withdraw from the account: ");
					double requestedAmount = obj1.nextDouble();
					((SavingsAccount)account).withdraw(requestedAmount);
				}
				
				else if(currentAccountFlag == 1) {
					System.out.println("Input the amount you want to withdraw from the account: ");
					double requestedAmount = obj1.nextDouble();
					((CurrentAccount)account).withdraw(requestedAmount);
				}
			}
			
			else if(choice == 3) {
				System.out.println(account.getAccountBalance());
			}
			
			else if(choice == 0) {
				System.out.println("Please visit again.");
				break;
			}
			
			else {
				System.out.println("Wrong Input");
				break;
			}

		} 
		while (choice != 0);
		
		obj1.close();
		
	}

}
