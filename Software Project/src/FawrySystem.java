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
		for(int i=0;i<data.g)
		
	}
}
