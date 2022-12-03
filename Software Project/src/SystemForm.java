import java.util.ArrayList;
import java.util.Scanner;

public class SystemForm {
	private Scanner in  = new Scanner(System.in);
	private FawrySystem controller = FawrySystem.getInstance();
	
	public void start() {
		System.out.println("1- Admin (press 1)\n 2- User (press 2).\n");
		int request = in.nextInt();
		if(request == 1) {
			adminLogin();
		}
		else if(request == 2) {
			System.out.println("1- Log in (press 1)\n 2- Sign Up (press 2).\n");
			int enter = in.nextInt();
			if(enter == 1) {
				userLogin();
			}
			else if(request == 2) {
				userSignup();			}
		}
	}
	
	public void adminLogin() {
		System.out.print("Enter E-mail: ");
		String email = in.nextLine();
		
		System.out.print("Enter Password: ");
		String password = in.nextLine();
		
		if(controller.validate_AdminAccount(email,password)) {
			System.out.println("Logged in successfully.");
			adminForm();
		}
		else {
			System.out.println("Invalid account, Please try again..");
			adminLogin();
		}
	}
	
	public void adminForm() {
		System.out.println("1- List all refunds.\n"
				+ " 2- List all transactions.\n"
				+ " 3- Add Discount");
					
		int request = in.nextInt();
		if(request == 1) {
			ArrayList<Refund> refunds= controller.requestRefunds();
			for(Refund r:refunds) {
				printRefund(r);
			}
			refundAction(refunds);
		}
		
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
		else if(request>=1 && request<= refunds.size()){
			System.out.println("press 1 to accept, 2 to reject");
			int request2 = in.nextInt();
			if(request2 == 1) {
				acceptRefund(request);
			}
			else {
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
	
	

}



















