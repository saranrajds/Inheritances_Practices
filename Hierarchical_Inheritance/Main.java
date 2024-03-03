package Hierarchical_Inheritance;

public class Main {

	public static void main(String[] args) {
		
		MobilePhone mPhone1 = new MobilePhone();
		mPhone1.makeCall();
		mPhone1.sendMessage("Hi Good Morning");
		mPhone1.chargerStatus();
		
		System.out.println("----------------");
		
		Smartphone mPhone2 = new Smartphone();
		mPhone2.makeCall();
		mPhone2.sendMessage("Hi Good Morning");
		mPhone2.BrowseInternet();
		mPhone1.chargerStatus();
		
		System.out.println("------------------");		

		MobilePhone mPhone3 = new Smartphone();
		mPhone3.makeCall();
		mPhone3.sendMessage("Hi Good Morning");
//		mPhone3.BrowseInternet(); -----------> erroe
		
		System.out.println("--------- Reference---------");	
		
		IBrowseInternet iB = new Smartphone();
		iB.BrowseInternet();
//		iB.sendMessage(); -------------> error

//		Smartphone sPhone = new MobilePhone();       -----> error
		
		System.out.println("---------------------------");
	}
}
