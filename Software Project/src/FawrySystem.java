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
}
