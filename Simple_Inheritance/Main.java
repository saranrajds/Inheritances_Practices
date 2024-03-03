package Simple_Inheritance;

public class Main {

	public static void main(String[] args) {
		
		MobilePhone mPhone1 = new MobilePhone();
		mPhone1.makeCall();
		mPhone1.sendMessage("Hi Good Morning");
		
		System.out.println("----------------");
		
		Smartphone mPhone2 = new Smartphone();
		mPhone2.makeCall();
		mPhone2.sendMessage("Hi Good Morning");
		mPhone2.BrowseInternet();
		
		System.out.println("------------------");		

		MobilePhone mPhone3 = new Smartphone();
		mPhone3.makeCall();
		mPhone3.sendMessage("Hi Good Morning");
		
//		mPhone3.BrowseInternet();				
		
//		We Can`t access BrowseInternet, Bcos the BrowseInternet method not found in MobilePhone class 
//		Object is create for Smartphone but the reference is MobilePhone
		
		System.out.println("------------------");

//		Smartphone mPhone4 = new MobilePhone();
//		We can`t convert
	}
}
