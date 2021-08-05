package question2;

public class SavingsAccount extends Account {

	private float interestRate;
	
	public SavingsAccount() {
		System.out.println("In Savings Account default constructor");
	}
	
	public SavingsAccount(SavingsAccount savingAccount) {
		super(savingAccount);
		this.interestRate = savingAccount.interestRate;
	}
	
	public void input() {
		System.out.println("In Savings Account input");
	}

	public void print() {
		System.out.println("In Savings Account print");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SavingsAccount [interestRate=");
		builder.append(interestRate);
		builder.append("]");
		return builder.toString();
	}
	
	public float getInterest() {
		return super.getBalance() * interestRate;
	}
	
}
