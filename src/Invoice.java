
import java.util.Scanner;

public class Invoice {
	
	static int count = 0;
	static float amount;
	static float discount;
	static float discount_Amount;
	static float invoice_total;
	static float avgInvoice;
	static float avgDiscount;
	
	public static void main(String[] args) {

		System.out.println("Welcome to the Invoice Total Calculator");
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			char again = 0;
			
			do {
			
				System.out.print("\nEnter amount: ");
				amount = scanner.nextFloat();
				
				System.out.print("Discount percent: ");
				discount = scanner.nextFloat();
				
				discount_Amount = amount * discount;
				invoice_total = amount - discount_Amount;
				
				avgInvoice += invoice_total;
				avgDiscount += discount_Amount;
				
				System.out.println("Discount amount: " + discount_Amount);
				System.out.println("Invoice total: " + invoice_total);
				
				System.out.print("Continue? (y/n): ");
				again = scanner.next().charAt(0);
				
				count++;
			
			}while((again == 'y') || (again == 'Y'));
			
			System.out.println("\nNumber of invoices: " + count);
			System.out.println("Average invoice: " + avgInvoice/count);
			System.out.println("Average discount: " + avgDiscount/count);
			
		}
		
	}

}
