import java.util.Scanner;

public class SystemForm {
	private Scanner in  = new Scanner(System.in);
	
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
		//obj.validate_AdminAccount(email,password);	
	}
	public void adminForm() {
		System.out.println("1- List all refunds.\n"
				+ " 2- List all transactions.\n"
				+ " 3- Add Discount");
		
	}
	
	
	
}

/*
 1- List all refunds
 2- List all transactions
 3- Add Discount
 */



















