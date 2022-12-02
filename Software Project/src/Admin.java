
public class Admin {
	private Account acc;
	private SystemData data;
	Admin(String name,String pass,String mail){
		this.acc = new Account(name,pass,mail);
		data = SystemData.getInstance();
	}
	
	
}
