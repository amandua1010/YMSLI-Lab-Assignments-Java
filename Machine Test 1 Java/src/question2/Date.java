package question2;

public class Date {
	
	private int day;
	private int month;
	private int year;
	
	public Date() {
		System.out.println("In Date default constructor");
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(Date date) {
		this.day = date.day;
		this.month = date.month;
		this.year = date.year;
	}
	
	public void input() {
		System.out.println("In Date input");
	}

	public void print() {
		System.out.println("In Date print");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Date [day=");
		builder.append(day);
		builder.append(", month=");
		builder.append(month);
		builder.append(", year=");
		builder.append(year);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
