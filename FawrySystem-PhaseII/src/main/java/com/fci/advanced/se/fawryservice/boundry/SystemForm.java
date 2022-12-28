package com.fci.advanced.se.fawryservice.boundry;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fci.advanced.se.fawryservice.controllers.FawrySystem;
import com.fci.advanced.se.fawryservice.entities.Account;
import com.fci.advanced.se.fawryservice.entities.Person;
import com.fci.advanced.se.fawryservice.entities.Refund;
import com.fci.advanced.se.fawryservice.entities.Transaction;
import com.fci.advanced.se.fawryservice.entities.User;
import com.fci.advanced.se.fawryservice.payment.Cash;
import com.fci.advanced.se.fawryservice.payment.CreditCard;
import com.fci.advanced.se.fawryservice.payment.Payment;
import com.fci.advanced.se.fawryservice.payment.Wallet;
import com.fci.advanced.se.fawryservice.service.Discount;
import com.fci.advanced.se.fawryservice.service.Donation;
import com.fci.advanced.se.fawryservice.service.InternetPayment;
import com.fci.advanced.se.fawryservice.service.Landline;
import com.fci.advanced.se.fawryservice.service.MobileRecharge;
import com.fci.advanced.se.fawryservice.service.OverAll;
import com.fci.advanced.se.fawryservice.service.Service;
import com.fci.advanced.se.fawryservice.service.Specific;


@RestController
public class SystemForm {
	private FawrySystem controller = FawrySystem.getInstance();
	private Service service;
	private Payment payment;
	
//	public void start() {
//		
//		System.out.println("1- Admin (press 1)\n2- User (press 2).\n3- Exist (press 3).");
//		int request = in.nextInt();
//		if(request == 1) {
//			adminLogin();
//		}
//		else if(request == 2) {
//			System.out.println("1- Log in (press 1)\n2- Sign Up (press 2).");
//			int enter = in.nextInt();
//			if(enter == 1) {
//				userLogin();
//			}
//			else if(request == 2) {
//				userSignup();			
//			}
//			else if(request == 3) {
//				return;
//			}
//			else {
//				start();
//			}
//		}
//	}
	
	
	
//	public void adminForm() {
//		System.out.println("1- List all refunds.\n"
//				+ "2- Add Discount\n3- log out.");
//				
//		int request = in.nextInt();
//		if(request == 1) {
//			ArrayList<Refund> refunds= controller.requestRefunds();
//			
//			
//			
//			for(Refund r:refunds) {
//				printRefund(r);
//			}
//			refundAction(refunds);
//			adminForm();
//		}
//		else if (request == 2) {
//			discountForm();
//			adminForm();
//		}
//		else if(request == 3) {
//			start();
//		}
//		else {
//			adminForm();
//		}
		
//	}
	
                                                          
//		System.out.println("1- Mobile recharge services");
//		System.out.println("2- Internet Payment services");
//		System.out.println("3- Landline services.");
//		System.out.println("4- Donations.");
//		System.out.println("5- View Discount.");
//		System.out.println("6- Refund Request.");
//		System.out.println("7- Charge your wallet.");
//		System.out.println("8- Log out");

		
	
	
	// 2
	public void internetPayment(double amount,String request)
	{
		service = new InternetPayment();
		//completeProcess(amount ,request);
	}
	// 3
	public void landline(double amount,String request)
	{
		service = new Landline();
		//completeProcess(amount ,request);
	}
	// 4
	public void donation(double amount,String request)
	{
		service = new Donation();
		//completeProcess(amount ,request);
	}
	// 5
	public void viewDiscounts()
	{
		controller.viewDiscounts();
	}
	// 6
	public void viewTransactions()
	{
		controller.viewTransactions();
	}
	// 7
	public void chargeWallet(double amount)
	{
		controller.chargeWallet(amount);
	}
	public String completeProcess(double amount,String request, String payType) {
		service.serviceForm( amount, request);
		selectPayment(payType); 
		double price = payment.price();
		payment.pay(price);
		completeTransaction(service.getName() ,price);
		
		return "\nThe cost of " + service.getName()+"= " + price + "\n";
	}

	public void completeTransaction(String type ,double amount) {
		controller.addTransaction(type,amount);
	}

	public void selectPayment(String payType)
	{
		/*System.out.println("1- CreditCard");
		System.out.println("2- Cash");
		System.out.println("3- Wallet.");*/
		payType = payType.toLowerCase();
		if(payType.contains("creditcard"))
		{
			payment=new CreditCard(service,controller.getCurrentUser());
		}
		else if(payType.contains("cash"))
		{
			payment=new Cash(service,controller.getCurrentUser());
		}
		else if(payType.contains("wallet"))
		{
			payment=new Wallet(service,controller.getCurrentUser());
		}
	}
	
	
	
	// list of refund -------------------
	public void listallrefunds()
	{
		ArrayList<Refund> refunds= controller.requestRefunds();
		for(Refund r:refunds) {
			printRefund(r);
		}
		//refundAction(refunds);
	}
	public void printRefund(Refund r) 
	{
		Transaction trans = r.getTrans();
		trans.printTransaction();
	}
	//-------------------------------------
	
	
	public void refundAction(ArrayList<Refund> refunds ,int index,int state ) {
		//System.out.println("please select number from 1 to "+ refunds.size() + " to select the refund,\n or 0 to back.\n");
		if(index >= 1 && index <= refunds.size()){
//			System.out.println("press 1 to accept, 2 to reject.");
			if(state  == 1) {
				acceptRefund(index);
			}
			else if(state  == 2) {
				rejectRefund(index);
			}
		}
//		else {
//			System.out.println("invalid input, please try again.\n");
//		}
	}
	
	public void acceptRefund(int index) {
		controller.accRefund(index);
	}
	public void rejectRefund(int index) {
		controller.rejecRefund(index);
	}
	
//	public void addDiscountForm(int requset ,double value) { 
//		Discount dis;
//		Scanner in2 = new Scanner(System.in);
//		System.out.println("1- Overall Discount\n2- Specific Discount");
//		if(requset == 1) {
//			dis = new OverAll();
//			
//			System.out.println("Enter the discount value: ");
//			int value = in2.nextInt();
//			//set discount value.
//			
//			dis.setDiscount(value);
//			controller.setOverAll(dis);
//		}
//		else if(requset == 2) {
//			dis = new Specific();
			
//			System.out.println("Enter the service name you want to apply discount: ");
//			String name = in2.nextLine();
//			System.out.println("Enter the discount value: ");
//			int value = in2.nextInt();
			
			//set discount value.
//			dis.setDiscount(value);
//			
//			controller.setSpecific(name,dis);
//			
//		}
//		else {
//			System.out.println("invalid input\n\n");
//			discountForm();
//		}
//	
//	}
	
	//admin
	public void addOvarallDiscount(double value)
	{ 
		Discount dis=new OverAll();			
		dis.setDiscount(value);
		controller.setOverAll(dis);
	}
	//admin
	public void addSpacivicDiscount(String name ,double value)
	{ 
		Discount dis=new Specific();
		dis.setDiscount(value);
		controller.setSpecific(name,dis);
	}
	
	public String adminLogin(String username , String password) {
//		Scanner in2 = new Scanner(System.in);
//		System.out.println("Enter Username: ");
//		String username = in2.nextLine();
//		
//		System.out.println("Enter Password: ");
//		String password = in2.nextLine();
//		
		if(controller.validate_AdminAccount(username,password)) {
			return "Logged in successfully.";
		}
		else {
			return "Invalid account, Please try again..";
		}
	}
	
	public void makeRefund(int index) {
		int size = controller.getCurrentUser().getTransactions().size();
		if(index>size || index < 1 ) {
			System.out.println("invalid request..\n\n");
		}
		controller.addRefund(index);
	}

	 @GetMapping(value = "/getuseracc")
	    public Account getUserAccount(){
	        return controller.getCurrentUser().getAccount();
	    }
	
	@PostMapping(value = "/usersignup")
	public String userSignup(@RequestBody Account acc) {
		return controller.addUser(acc);
	}
	
	
	@PostMapping(value = "/userlogin")
	public String userLogin(@RequestBody Account acc) {
		
		if(controller.validate_UserAccount(acc.getUsername(),acc.getPassword())) {
			return "User Logged in successfully.\n";
		}
		else {
			return "Invalid account, Please try again..\n";
		}
	}
	
	@PostMapping(value = "/adminlogin")
	public String adminLogin(@RequestBody Account acc) {
		if(controller.validate_AdminAccount(acc.getUsername(),acc.getPassword())) {
			return "Admin Logged in successfully.";
		}
		else {
			return "Invalid account, Please try again..";
		}
	}
	
	
	
	
	//mobileRecharge/{10,"we"}
		// 1
		@PostMapping(value = "/mobilerecharge/{provider}/{paymentMethod}")
	public String mobileRecharge(@RequestBody MobileRecharge mb ,@PathVariable("paymentMethod") String pay,@PathVariable("provider") String prov)
	{
			this.service = mb;
			return completeProcess(mb.getAmount(),prov,pay);
	
	}
	 @GetMapping(value = "/mobilerechargee")
	public String getService(){
	        return "Youssef";
	}
	
	
}

















