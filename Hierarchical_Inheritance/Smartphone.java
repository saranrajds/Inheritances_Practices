package Hierarchical_Inheritance;

public class Smartphone extends MobilePhone implements IBrowseInternet {

	@Override
	public void BrowseInternet() {
		System.out.println("BrowseInternet");		
	}

}
