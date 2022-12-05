
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
	
	public void notifySpecific(String serviceName,Discount discount) {
		for(Service s:SystemData.getServices()) {
			String name = s.getName();
			name = name.toLowerCase();
			serviceName = serviceName.toLowerCase();
			if(serviceName.contains(name)) {
				s.updateDiscount(discount);
			}
		}
	}
	public void notifyOverAll(Discount dis) {
		for(User u:SystemData.getUsers()) {
			if(u.getTransactions().size()==0)
				u.updateDiscount(dis);
		}
	}
}