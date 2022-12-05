import java.util.ArrayList;
import java.util.Scanner;

public class SystemForm {
	private Scanner in  = new Scanner(System.in);
	private FawrySystem controller = FawrySystem.getInstance();
	private Service service;
	private Payment payment;
	public void start() {
		
		System.out.println("1- Admin (press 1)\n2- User (press 2).\n3- Exist (press 3).");
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
				userSignup();			
			}
			else if(request == 3) {
				return;
			}
			else {
				start();
			}
		}
	}
	
	
	
	public void adminForm() {
		System.out.println("1- List all refunds.\n"
				+ "2- Add Discount\n3- log out.");
				
		int request = in.nextInt();
		if(request == 1) {
			ArrayList<Refund> refunds= controller.requestRefunds();
			for(Refund r:refunds) {
				printRefund(r);
			}
			refundAction(refunds);
			adminForm();
		}
		else if (request == 2) {
			discountForm();
			adminForm();
		}
		else if(request == 3) {
			start();
		}
		else {
			adminForm();
		}
		
	}
	
	public void userForm() {
		System.out.println("1- Mobile recharge services");
		System.out.println("2- Internet Payment services");
		System.out.println("3- Landline services.");
		System.out.println("4- Donations.");
		System.out.println("5- View Discount.");
		System.out.println("6- Refund Request.");
		System.out.println("7- Charge your wallet.");
		System.out.println("8- Log out");

		int request = in.nextInt();
		
		if(request == 1) {
			service = new MobileRecharge();
			completeProcess();
		}
		else if(request == 2) {
			service = new InternetPayment();
			completeProcess();
		}
		else if(request == 3) {
			service = new Landline();
			completeProcess();
		}
		else if(request == 4) {
			service = new Donation();
			completeProcess();
		}
		else if(request==5)
		{
			controller.viewDiscounts();
			userForm();
		}
		else if(request==6)
		{
			controller.viewTransactions();
			int index = in.nextInt();
			int size = controller.getCurrentUser().getTransactions().size();
			if(index>size || index < 1 ) {
				System.out.println("invalid request..\n\n");
				userForm();
			}
			makeRefund(index-1);
			userForm();
			
		}
		else if(request == 7){
			Scanner in2 = new Scanner(System.in);
			System.out.println("Enter the amount: ");
			double amount = in2.nextDouble();
			controller.chargeWallet(amount);
			userForm();
		}
		else if(request == 8) {
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
			payment=new CreditCard(service,controller.getCurrentUser());
		}
		else if(request==2)
		{
			payment=new Cash(service,controller.getCurrentUser());
		}
		else if(request==3)
		{
			payment=new Wallet(service,controller.getCurrentUser());
		}
	}
	public void completeProcess() {
		service.serviceForm();
		selectPayment(); 
		double price = payment.price();
		System.out.println("\nThe cost of " + service.getName()+"= " + price + "\n");
		payment.pay(price);
		completeTransaction(service.getName() ,price);
		userForm();
	}

	public void completeTransaction(String type ,double amount) {
		controller.addTransaction(type,amount);
	}
	public void printRefund(Refund r) {
		Transaction trans = r.getTrans();
		trans.printTransaction();
	}
	
	
	public void refundAction(ArrayList<Refund> refunds) {
		System.out.println("please select number from 1 to "+ refunds.size() + " to select the refund,\n or 0 to back.\n");
		int request = in.nextInt();
		if(request == 0) {
			adminForm();
		}
		else if(request >= 1 && request <= refunds.size()){
			System.out.println("press 1 to accept, 2 to reject.");
			int request2 = in.nextInt();
			if(request2 == 1) {
				acceptRefund(request);
			}
			else if(request2 == 2) {
				rejectRefund(request);
			}
		}
		else {
			System.out.println("invalid input, please try again.\n");
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
		Scanner in2 = new Scanner(System.in);
		Discount dis;
		System.out.println("1- Overall Discount\n2- Specific Discount");
		int req = in.nextInt();
		if(req == 1) {
			dis = new OverAll();
			System.out.println("Enter the discount value: ");
			int value = in2.nextInt();
			//set discount value.
			dis.setDiscount(value);
			controller.setOverAll(dis);
		}
		else if(req == 2) {
			dis = new Specific();
			System.out.println("Enter the service name you want to apply discount: ");
			String name = in2.nextLine();
			System.out.println("Enter the discount value: ");
			int value = in2.nextInt();
			//set discount value.
			dis.setDiscount(value);
			
			controller.setSpecific(name,dis);
			
		}
		else {
			System.out.println("invalid input\n\n");
			discountForm();
		}
	
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
			System.out.println("Logged in successfully.\n");
			userForm();
		}
		else {
			System.out.println("Invalid account, Please try again..\n");
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
	
	public void makeRefund(int index) {
		controller.addRefund(index);
	}
}

















