package question2;

public class CurrentAccount extends Account {
	
	private float minimumBalance;
	
	public CurrentAccount() {
		System.out.println("In Current Account constructor");
	}
	
	public CurrentAccount(CurrentAccount currentAccount) {
		super(currentAccount);
		this.minimumBalance = currentAccount.minimumBalance;
	}
	
	public void input() {
		System.out.println("In Current Account input");
	}

	public void print() {
		System.out.println("In Current Account print");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CurrentAccount [minimumBalance=");
		builder.append(minimumBalance);
		builder.append("]");
		return builder.toString();
	}
	
	public float getInterest() {
		return super.getBalance() * minimumBalance;
	}
	
}
