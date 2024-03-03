package Simple_Inheritance;

public class MobilePhone {

	protected String brand;
	protected String model;
	
	public void makeCall() {
		System.out.println("Callig....");
	}
	
	public void sendMessage(String str) {
		System.out.println("Message Sending "+str);
	}
}
