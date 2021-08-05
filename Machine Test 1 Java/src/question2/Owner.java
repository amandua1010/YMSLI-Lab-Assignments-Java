package question2;

public class Owner{
	
	private String name;
	private Date dateOfBirth;
	private String nic;
	
	public Owner() {
		System.out.println("In Owner default constructor");
	}
	
	public Owner(String name, String nic, Date dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.nic = nic;
	}
	
	public Owner(Owner owner) {
		this.name = owner.name;
		this.dateOfBirth = owner.dateOfBirth;
		this.nic = owner.nic;
	}
	
	public void input() {
		System.out.println("In Owner input");
	}
	
	public void print() {
		System.out.println("In Owner print");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Owner [name=");
		builder.append(name);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append(", nic=");
		builder.append(nic);
		builder.append("]");
		return builder.toString();
	}

	
}
