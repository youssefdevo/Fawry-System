
public class Transaction {
	private String service_type;
	private double amount;
	private String state;
	private String username;
	
	
	
	Transaction(String username,String serviceType,double amount){
		this.setUsername(username);
		this.setService_type(serviceType);
		this.setAmount(amount);
		this.setState("Completed");
	}
	
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String setState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getService_type() {
		return service_type;
	}
		
	public void setService_type(String service_type) {
		this.service_type = service_type;
	}
	
		
}
