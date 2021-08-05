package question2;

public class Account {
	
	private Owner owner;
	private float balance;
	private String number;
	
	public Account(){
		System.out.println("In Account default constructor");
	}
	
	public Account(Owner owner, float balance, String number) {
		this.owner = owner;
		this.number = number;
		this.balance = balance;
	}
	
	public Account(Account account) {
		this.owner = account.owner;
		this.number = account.number;
		this.balance = account.balance;
	}
	
	public void input() {
		System.out.println("In Account input");
	}

	public void print() {
		System.out.println("In Account print");
	}
	
	public void deposit() {
		System.out.println("In Account deposit");
	}
	
	public void withdraw() {
		System.out.println("In Account withdraw");
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [owner=");
		builder.append(owner);
		builder.append(", balance=");
		builder.append(balance);
		builder.append(", number=");
		builder.append(number);
		builder.append("]");
		return builder.toString();
	}

	public float getBalance() {
		float temp = 1.2f;
		return temp;
	}
	
}
