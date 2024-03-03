package Multilevel_Inheritance;

public class MobilePhone implements IFunctionality {
	
	public void makeCall() {
		System.out.println("Callig....");
	}
	
	public void sendMessage(String str) {
		System.out.println("Message Sending "+str);
	}
}
