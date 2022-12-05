import java.util.Scanner;


public class CreditCard implements Payment{
	private String creditCardNumber;
	private Scanner in = new Scanner(System.in);
	public void pay(double amount) {
		System.out.println("Enter the credit card number:");
		// TODO Auto-generated method stub
		creditCardNumber = in.nextLine();

		System.out.println("Transaction completed successfully");
	}

}
