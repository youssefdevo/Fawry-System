
public class Admin {
	private Account acc;
	
	Admin(String name,String mail,String password){
		this.acc = new Account(name,mail,password);
	}
	public Account getAccount() {
		return this.acc;
	}
	
	public void notifySpecific(String serviceName,Discount discount) {
		boolean found = false;
		for(Service s:SystemData.getServices()) {
			String name = s.getName();
			name = name.toLowerCase();
			serviceName = serviceName.toLowerCase();
			if(serviceName.contains(name)) {
				s.updateDiscount(discount);
				found = true;
			}
		}
		if(!found) {
			if(serviceName.equals("internet")) {
				Service s = new InternetPayment();
				s.updateDiscount(discount);
				SystemData.addService(s);
			}
			else if(serviceName.equals("mobile")) {
				Service s = new MobileRecharge();
				s.updateDiscount(discount);
				SystemData.addService(s);
			}
			else if(serviceName.equals("landline")) {
				Service s = new Landline();
				s.updateDiscount(discount);
				SystemData.addService(s);
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