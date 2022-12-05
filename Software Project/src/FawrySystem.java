import java.util.ArrayList;


public class FawrySystem {
  private   SystemData data;
  private User currentUser;
  
	private static FawrySystem instance = new FawrySystem();

	//make the constructor private so that this class cannot be instantiated..
	private FawrySystem(){
		data=SystemData.getInstance();
	}

  //Get the only object available
	public static FawrySystem  getInstance(){
     return instance;
	}	
	
	public boolean validate_AdminAccount(String username,String password){
		ArrayList<Admin>admins = data.getAdmins();
		for(Admin i :admins) {
			if(i.getAccount().getUsername().equals(username) && i.getAccount().getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean validate_UserAccount(String username,String password) {
		ArrayList<User> users = data.getUsers();
		for(User i :users) {
			if(i.getAccount().getUsername().equals(username) && i.getAccount().getPassword().equals(password)) {
				this.setCurrentUser(i);
				return true;
			}
		}
		return false;
	}
	public ArrayList<Refund> requestRefunds(){
		return data.getRefunds();
	}
	
	public void accRefund(int index) {
		
		data.acceptRefund(index);
	}
	public void rejecRefund(int index) {
		
		data.rejectRefund(index);
	}
	
	public void addUser(User user) {
		data.addUser(user);
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

	public void addTransaction(String type, double amount) {
		Transaction transaction = new Transaction(currentUser.getAccount().getUsername(),type,amount);
		currentUser.addTransaction(transaction);
	}
	public void addservices()
	{
		Service s1=new MobileRecharge(); 
		data.addService(s1);
		Service s2=new InternetPayment() ; 
		data.addService(s2);
		Service s3=new Landline(); 
		data.addService(s3);
	}

	public void viewDiscounts() {
		for(Service d:data.getServices())
		{
			if(d.getName()=="Donation")continue;
			System.out.println(d.getName()+": "+d.getDiscount().getDiscount_amount());
		}
		
	}
}
