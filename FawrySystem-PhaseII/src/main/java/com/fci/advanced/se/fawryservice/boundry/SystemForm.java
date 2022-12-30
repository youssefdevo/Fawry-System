package com.fci.advanced.se.fawryservice.boundry;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.fci.advanced.se.fawryservice.controllers.FawrySystem;
import com.fci.advanced.se.fawryservice.entities.Account;
import com.fci.advanced.se.fawryservice.entities.Refund;
import com.fci.advanced.se.fawryservice.entities.Transaction;
import com.fci.advanced.se.fawryservice.entities.User;
import com.fci.advanced.se.fawryservice.payment.Cash;
import com.fci.advanced.se.fawryservice.payment.CreditCard;
import com.fci.advanced.se.fawryservice.payment.Payment;

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
	
	// start function
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

	
	public String completeProcess(double amount,String request, String payType) {
		service.serviceForm( amount, request);
		selectPayment(payType); 
		payment.setFlag(true);
		double price = payment.price();
		String pay = payment.pay(price);
		if(payment.isFlag())completeTransaction(service.getName() ,price);
		
		return "\nThe cost of " + service.getName()+"= " + price + "\n" + pay;
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
			//payment=new Wallet(service,controller.getCurrentUser());
			payment = controller.getCurrentUser().getWallet();
			payment.setService(service,controller.getCurrentUser());
		}
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
	


	 @GetMapping(value = "/getuser")
	    public User getUserAccount(){
	        return controller.getCurrentUser();
	    }
	
	@PostMapping(value = "/user/signup")
	public String userSignup(@RequestBody Account acc) {
		return controller.addUser(acc);
	}
	
	
	@PostMapping(value = "/user/login")
	public String userLogin(@RequestBody Account acc) {
		controller.setCurrentAdmin(null);
		if(controller.validate_UserAccount(acc.getUsername(),acc.getPassword())) {
			return "User Logged in successfully.\n";
		}
		else {
			return "Invalid account, Please try again..\n";
		}
	}
	@PostMapping(value = "/user/logout")
	public String userLogOut() {
		controller.setCurrentUser(null);
		return "User Logged out successfully";
	}
	
	@PostMapping(value = "/admin/login")
	public String adminLogin(@RequestBody Account acc) {
		controller.setCurrentUser(null);
		if(controller.validate_AdminAccount(acc.getUsername(),acc.getPassword())) {
			return "Admin Logged in successfully.";
		}
		else {
			return "Invalid account, Please try again..";
		}
	}
	
	@PostMapping(value = "/admin/logout")
	public String adminLogOut() {
		controller.setCurrentAdmin(null);
		return "Admin Logged out successfully";
	}
	
	
	
		// 1
	@PostMapping(value = "/user/mobilerecharge/{provider}/{paymentMethod}")
	public String mobileRecharge(@RequestBody MobileRecharge mb ,@PathVariable("paymentMethod") String pay,@PathVariable("provider") String prov)
	{
			if(controller.getCurrentUser()==null)return "Please login as a user first";
			this.service = mb;
			return completeProcess(mb.getAmount(),prov,pay);
	
	}
	
	// 2
	 @PostMapping(value = "/user/internetpaymment/{provider}/{paymentMethod}")
	public String internetPayment(@RequestBody InternetPayment ip ,@PathVariable("paymentMethod") String pay,@PathVariable("provider") String prov)
	{
		 if(controller.getCurrentUser()==null)
			 return "Please login as a user first";
		 this.service = ip;
		 return completeProcess(ip.getAmount(),prov,pay);
	}
	
	    // 3
	@PostMapping(value = "/user/donation/{place}/{paymentMethod}")
	public String donation(@RequestBody Donation d ,@PathVariable("paymentMethod") String pay,@PathVariable("place") String place)
	{
		 if(controller.getCurrentUser()==null)return "Please login as a user first";
		 this.service = d;
		 return completeProcess(d.getAmount(),place,pay);
	}
	
	// 4
	@PostMapping(value = "/user/landline/{receipt}/{paymentMethod}")
	public String landline(@RequestBody Landline li ,@PathVariable("paymentMethod") String pay,@PathVariable("receipt") String receipt)
		{
			if(controller.getCurrentUser()==null)return "Please login as a user first";
			this.service = li;
			return completeProcess(li.getAmount(),receipt,pay);
		}
	 
	
	   // 5  user view discounts.
	@GetMapping(value = "/user/viewDiscounts")
		public ArrayList<String> viewDiscounts()
		{
			ArrayList<String>temp = new ArrayList<>();
			temp.add("Please login as a user first");
			if(controller.getCurrentUser()==null)
				return temp;
			else
				return controller.viewDiscounts();
		}
	
	   
	
		// 6
	@GetMapping(value = "/user/viewTransactions")
	public ArrayList<Transaction> viewTransactions()
	{		
		return controller.viewTransactions();
	}
	
	
	//  7
	@PostMapping(value = "/user/chargewallet/{amount}")
	public String chargeWallet(@PathVariable("amount") double amount)
	{
		  if(controller.getCurrentUser()==null)return "Please login as a user first";
		  return controller.chargeWallet(amount);
	}
	
	
	// 8
	 @PostMapping(value = "/user/makerefund/{index}")
	public String makeRefund(@PathVariable("index") int index) {
		 if(controller.getCurrentUser()==null)return "Please login as a user first";
		int size = controller.getCurrentUser().getTransactions().size();
		if(index>size || index < 1 ) {
			 return "invalid request..\n\n";
		}
		
		return controller.addRefund(index);
	}
	 
	 
	//admin add discounts
	@PostMapping(value = "/admin/addOvarallDiscount/{value}")
	public String addOvarallDiscount(@PathVariable("value") double value)
	{ 
		if(controller.getCurrentAdmin()==null)return "Please login as a Admin first";
		Discount dis=new OverAll();			
		dis.setDiscount(value);
		controller.setOverAll(dis);
		return "added successfully";
	}
	
	//admin add discounts
	@PostMapping(value = "/admin/addSpecificDiscount/{serviceName}/{value}")
	public String addSpecificDiscount(@PathVariable("serviceName") String name, @PathVariable("value")double value)
	{
		if(controller.getCurrentAdmin()==null)return "Please login as a Admin first";
		Discount dis=new Specific();
		dis.setDiscount(value);
		controller.setSpecific(name,dis);
		return "added successfully";
	}
	//admin view refunds
	@GetMapping(value = "/admin/ListRefunds")
	public ArrayList<Refund> listAllRefunds()
	{
		return controller.requestRefunds();
	}
	
	
	//admin refund action
	@PostMapping(value = "/admin/refundAction/{index}/{state}")
	public String refundAction(@PathVariable("index") int index, @PathVariable("state") int state) {
		if(controller.getCurrentAdmin()==null)return "Please login as a Admin first";
		if(index >= 1 && index <= controller.requestRefunds().size()){
			
			if(state  == 1) {
				acceptRefund(index);
				return "Refund accepted successfully";
			}
			
			else if(state  == 2) {
				rejectRefund(index);
				return "Refund cancelled successfully";
			}
		}
		return "Invalid ID, please try again.";
	}
	
	
	
	public void acceptRefund(int index) {
		controller.accRefund(index);
	}
	
	public void rejectRefund(int index) {
		controller.rejecRefund(index);
	}
	
	@GetMapping(value = "/admin/viewHistory")
	public ArrayList<User> getHistory(){
		if(controller.getCurrentAdmin()==null)return null;
		return controller.getHistroy();
	}
}

















