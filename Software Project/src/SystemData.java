import java.util.ArrayList;

public class SystemData {
	private static ArrayList<Admin>admins;
	private static ArrayList<User>users;
	private static ArrayList<Refund>refunds;
	private static SystemData instance = new SystemData();

	//make the constructor private so that this class cannot be instantiated..
	private SystemData(){
		admins = new ArrayList<>();
		users = new ArrayList<>();
		Admin defultAdmin = new Admin("admin","123","admin@gmail.com");
		admins.add(defultAdmin);
	}

   //Get the only object available
	public static SystemData getInstance(){
      return instance;
	}	
   

	public void addAdmin(Admin admin) {
	   SystemData.admins.add(admin);
	}
   
	public void addUser(User user) {
	   SystemData.users.add(user);
	} 
	
	public void addRefund(Refund refund) {
		   SystemData.refunds.add(refund);
	}
	
	public ArrayList<Admin> getAdmins(){
		return admins;
	}
	
	public ArrayList<Refund> getRefunds(){
		return refunds;
	}
	
	public void acceptRefund(int index) {
		
	}
}
