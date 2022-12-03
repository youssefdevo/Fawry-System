import java.util.ArrayList;


public class FawrySystem {
   SystemData data;
	private static FawrySystem instance = new FawrySystem();

	//make the constructor private so that this class cannot be instantiated..
	private FawrySystem(){
		data=SystemData.getInstance();
	}

  //Get the only object available
	public static FawrySystem  getInstance(){
     return instance;
	}	
	public boolean validate_AdminAccount(String email,String password){
		ArrayList<Admin>admins = data.getAdmins();
		for(Admin i :admins) {
			Account check = i.getAccount();
			if(check.getEmail()==email && check.getPassword()==password) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Refund> requestRefunds(){
		return data.getRefunds();
	}
	
	public void accRefund(int index) {
		// refund = acc, trans = cancelled.
		data.acceptRefund(index);
	}
	public void rejecRefund(int index) {
		// refund = acc, trans = cancelled.
		data.rejectRefund(index);
	}
}
