package Hierarchical_Inheritance;

public class MobilePhone implements IFunctionality, IChargerStatus, ISwitchOff, ISwitchOn {
	
	public void makeCall() {
		System.out.println("Callig....");
	}
	
	public void sendMessage(String str) {
		System.out.println("Message Sending "+str);
	}

	@Override
	public void chargerStatus() {
		System.out.println("chargerStatus");		
	}

	@Override
	public void switchOff() {
		System.out.println("switchOff");		
	}

	@Override
	public void switchOn() {
		System.out.println("switchOn");		
	}
}
