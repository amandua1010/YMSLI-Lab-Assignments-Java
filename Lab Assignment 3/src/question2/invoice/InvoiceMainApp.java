package question2.invoice;

import java.util.Scanner;

public class InvoiceMainApp {

	public static void main(String[] args) {
		
		Scanner obj1 = new Scanner(System.in);
		
		String partNum;
		String partDescription;
		int quantity;
		double pricePerItem;
		
		System.out.println("Input Part Num: ");
		partNum=obj1.nextLine();
		
		System.out.println("Input Part Description: ");
		partDescription=obj1.nextLine();
		
		System.out.println("Input quantity: ");
		quantity=obj1.nextInt();
		
		System.out.println("Input price per item: ");
		pricePerItem=obj1.nextDouble();
		
		Invoice invoice = new Invoice(partNum, partDescription, quantity, pricePerItem);
		System.out.println(invoice.toString());
		System.out.println("Total Payment: " + invoice.getPayment());
		
		obj1.close();
		
	}

}
