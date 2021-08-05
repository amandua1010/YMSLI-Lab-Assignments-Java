package question1;

public class Merchandise implements Comparable<Merchandise> {
	
	private String itemCode;
	private int quantity;
	private double unitPrice;

	public Merchandise(String itemCode, int quantity, double unitPrice) {
		this.itemCode = itemCode;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public String getItemCode() {
		return itemCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Merchandise [itemCode=");
		builder.append(itemCode);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", unitPrice=");
		builder.append(unitPrice);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public int compareTo(Merchandise item) {
		return this.itemCode.compareTo(item.itemCode);
	}
	
}
