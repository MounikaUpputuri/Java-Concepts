package OOPS_AbstractClass;

public class HomePage extends Page {

	@Override
	public void title() {
		System.out.println("Home page -title");
	}

	@Override
	public void url() {
		System.out.println("Homepage url");		
	}
	@Override
	public void logo()
	{
		System.out.println("Logo-Homepage");
	}
	public void logout()
	{
		System.out.println("Logout");
	}

}
