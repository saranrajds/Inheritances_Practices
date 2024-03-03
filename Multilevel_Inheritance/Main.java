package Multilevel_Inheritance;

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
		
		Mobile_1133 p1133 = new Mobile_1133();
		p1133.makeCall();
		p1133.sendMessage("Hi");
		p1133.Security();
		
		System.out.println("------------------");		

		MobilePhone mPhone3 = new Smartphone();
		mPhone3.makeCall();
		mPhone3.sendMessage("Hi Good Morning");
				
		System.out.println("-------  Interface Reference-----------");
		
		IFunctionality ifun1 = new Mobile_1133();
		ifun1.sendMessage("1133 phone");
		ifun1.makeCall();
//		ifun1.Security(); -----> error

	}
}
