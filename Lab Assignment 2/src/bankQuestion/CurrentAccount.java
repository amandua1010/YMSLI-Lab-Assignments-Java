package bankQuestion;

public class CurrentAccount extends Account {
	
	private int tradeLicenseNumber;

	public CurrentAccount(String memberName, double accountBalance,int tradeLicenseNumber) {
		super(memberName, accountBalance);    // calling constructor of Account class
		this.tradeLicenseNumber = tradeLicenseNumber;
	}
	
	public double getBalance() {
		return super.getAccountBalance();
	}

	public void withdraw(double requestedAmount) {

		if (getBalance() >= requestedAmount) {
//			deposit(-1 * requestedAmount);
			setAccountBalance(getAccountBalance() - requestedAmount);
			System.out.println("Requested Amount Withdrawn");
		} 
		
		else {
			System.out.println("You don't have sufficient balance in your account. Please try again");
		}

	}
	
}
