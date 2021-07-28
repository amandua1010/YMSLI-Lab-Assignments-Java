package bankQuestion;

public class SavingsAccount extends Account {
	
	private int interest = 5;
	private int withdrawLimit;
	private int minimumBalance = 500;
	
	public SavingsAccount(String memberName, double accountBalance, int withdrawLimit) {
		
		super(memberName, accountBalance);  // calling constructor of Account class
		this.withdrawLimit = withdrawLimit;
		
	}

	public double getBalance() {
		return super.getAccountBalance() + (super.getAccountBalance() * interest * 0.01);
	}
	
	public void withdraw(double requestedAmount) {
		
//		if(requestedAmount > withdrawLimit) {
//			System.out.println("Entered amount is more than withdraw limit of the account. Please try again");
//			return ;
//		}
//		
//		if(getBalance() >= requestedAmount) {
//			
//			if(getBalance() - requestedAmount >= minimumBalance) {
//				this.deposit(super.getAccountBalance() * interest * 0.01 - requestedAmount);
//			}
//			
//			else {
//				System.out.println("Minimum balance limit, sorry");
//			}
//		}
//		
//		else {
//			System.out.println("Current Balance is less than requested amount. Please try again");
//		}
		
		if(requestedAmount > withdrawLimit) {
			System.out.println("Entered amount is more than withdraw limit of the account. Please try again");
			return ;
		}
		
		else if(getBalance() - requestedAmount > minimumBalance) {
			setAccountBalance(getAccountBalance() - requestedAmount);
			System.out.println(requestedAmount + " amount has been debited");
		}
		
		else {
			System.out.println("Current Balance is less than requested amount. Please try again");
		}
		
	}
	
}
