import java.util.ArrayList;

public class SystemData {
	private static ArrayList<Admin>admins;
	private static ArrayList<User>users;
	private static ArrayList<Refund>refunds;
	private static SystemData instance = new SystemData();

	//make the constructor private so that this class cannot be instantiated
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
   

	void addAdmin(Admin admin) {
	   this.admins.add(admin);
	}
   
	void addUser(User user) {
	   this.users.add(user);
	}

}
