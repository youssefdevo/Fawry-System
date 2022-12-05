import java.util.ArrayList;
import java.util.Scanner;

public class SystemForm {
	private Scanner in  = new Scanner(System.in);
	private FawrySystem controller = FawrySystem.getInstance();
	private Service service;
	private Payment payment;
	public void start() {
		System.out.println("1- Admin (press 1)\n2- User (press 2).");
		int request = in.nextInt();
		if(request == 1) {
			adminLogin();
		}
		else if(request == 2) {
			System.out.println("1- Log in (press 1)\n2- Sign Up (press 2).");
			int enter = in.nextInt();
			if(enter == 1) {
				userLogin();
			}
			else if(request == 2) {
				userSignup();			}
		}
	}
	
	
	
	public void adminForm() {
		System.out.println("1- List all refunds.\n"
				+ "2- Add Discount");
				
		int request = in.nextInt();
		if(request == 1) {
			ArrayList<Refund> refunds= controller.requestRefunds();
			for(Refund r:refunds) {
				printRefund(r);
			}
			refundAction(refunds);
		}
		else if (request == 2) {
			discountForm();
		}
		else {
			adminForm();
		}
		
	}
	/*
	 * 
	 * 1- Mobile recharge services.
	 * 
	 * 
	 * */
	public void userForm() {
		System.out.println("1- Mobile recharge services");
		System.out.println("2- Internet Payment services");
		System.out.println("3- Landline services.");
		System.out.println("4- Donations.");
		System.out.println("5- View Discount.");
		System.out.println("6- Refund Request.");
		System.out.println("7- Log out");

		int request = in.nextInt();
		
		if(request == 1) {
			service = new MobileRecharge();
			service.serviceForm();

			selectPayment();
			payment.pay(service.getAmount());
			completeTransaction("Mobile Recharge" ,service.getAmount());
			userForm();
		}
		else if(request == 2) {
			service = new InternetPayment();
			service.serviceForm();
		
			selectPayment();
			payment.pay(service.getAmount());
			completeTransaction("Internet Payment" ,service.getAmount());
			userForm();
		}
		else if(request == 3) {
			service = new Landline();
			service.serviceForm();
			selectPayment();
			payment.pay(service.getAmount());
			completeTransaction("Landline" ,service.getAmount());
			userForm();
		}
		else if(request == 4) {
			service = new Donation();
			service.serviceForm();
			selectPayment(); 
			payment.pay(service.getAmount());
			completeTransaction("Donation" ,service.getAmount());
			userForm();
		}
		else if(request==5)
		{
			controller.viewDiscounts();
		}
		else if(request==6)
		{
			
		}
		else if(request == 7) {
			start();
		}
	}
	
	
	public void selectPayment()
	{
		System.out.println("1- CreditCard");
		System.out.println("2- Cash");
		System.out.println("3- Wallet.");
		int request = in.nextInt();
		if(request==1)
		{
			payment=new CreditCard();
		}
		else if(request==2)
		{
			payment=new Cash();
		}
		else if(request==3)
		{
			payment=new Wallet();
		}
	}

	public void completeTransaction(String type ,double amount) {
		controller.addTransaction(type,amount);
	}
	public void printRefund(Refund r) {
		Transaction trans = r.getTrans();
		printTransaction(trans);
	}
	
	public void printTransaction(Transaction t) {
		System.out.println("User name: "+t.getUsername()+".");
		System.out.println("Service type: "+t.getService_type()+".");
		System.out.println("Amount: "+t.getAmount()+".");
	}
	public void refundAction(ArrayList<Refund> refunds) {
		System.out.println("please select from 1 to "+ refunds.size() + "to select the refund\n or 0 to back.");
		int request = in.nextInt();
		if(request == 0) {
			adminForm();
		}
		else if(request >= 1 && request <= refunds.size()){
			System.out.println("press 1 to accept, 2 to reject");
			int request2 = in.nextInt();
			if(request2 == 1) {
				acceptRefund(request);
			}
			else if(request2 == 2) {
				rejectRefund(request);
			}
		}
		else {
			System.out.println("invalid input, please try again.");
			adminForm();
		}
	}
	
	public void acceptRefund(int index) {
		controller.accRefund(index);
	}
	public void rejectRefund(int index) {
		controller.rejecRefund(index);
	}
	
	public void discountForm() {
		
	}
	
	public void adminLogin() {
		Scanner in2 = new Scanner(System.in);
		System.out.println("Enter Username: ");
		String username = in2.nextLine();
		
		System.out.println("Enter Password: ");
		String password = in2.nextLine();
		
		if(controller.validate_AdminAccount(username,password)) {
			System.out.println("Logged in successfully.");
			adminForm();
		}
		else {
			System.out.println("Invalid account, Please try again..");
			start();
		}
	}
	
	@SuppressWarnings("resource")
	public void userLogin() {
		Scanner in2 = new Scanner(System.in);
		System.out.println("Enter Username:");
		String username = in2.nextLine();
		
		System.out.println("Enter Password:");
		String password = in2.nextLine();
		
		if(controller.validate_UserAccount(username,password)) {
			System.out.println("Logged in successfully.");
			userForm();
		}
		else {
			System.out.println("Invalid account, Please try again..");
			start();
		}
	}
	
	@SuppressWarnings("resource")
	public void userSignup() {
		Scanner in2 = new Scanner(System.in);
		String username, mail, password;
		System.out.println("Enter username: ");
		username = in2.nextLine();
		System.out.println("Enter E-mail: ");
		mail = in2.nextLine();
		System.out.println("Enter Password: ");
		password = in2.nextLine();
		Account account = new Account(username,mail,password);
		User user = new User(account);
		controller.addUser(user);
		start();
	}
	
	
}
/*
 * Discount -> users
 * 
 * Sign up ,over all  null.
 *  
 * 
 * 
 * 
 * 
 * */


















