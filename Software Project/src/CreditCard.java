import java.util.Scanner;


public class CreditCard extends Payment{
	CreditCard(Service s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	private String creditCardNumber;
	private Scanner in = new Scanner(System.in);
	public void pay(double amount) {
		System.out.println("Enter the credit card number:");
		// TODO Auto-generated method stub
		creditCardNumber = in.nextLine();

		System.out.println("Transaction completed successfully\n\n");
	}

}
