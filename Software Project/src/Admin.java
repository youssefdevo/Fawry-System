
public class Admin {
	private Account acc;
	private SystemData data;
	Admin(String name,String mail,String password){
		this.acc = new Account(name,mail,password);
		data = SystemData.getInstance();
	}
	public Account getAccount() {
		return this.acc;
	}
	
}
