package OOPS_Encapsulation;

public class BrowserClass {
	
	public void launchbrowser()
	{
		System.out.println("launch browser");
		checkversion();
		osversion();
		checkRAM();
	}
	private void checkversion()
	{
		System.out.println("Check Browser Version");
	}
	private void osversion()
	{
	System.out.println("Check osversion");	
	}
	private void checkRAM()
	{
		System.out.println("check enough RAM");
	}
	public void brversion()
	{
		System.out.println("brvesrion");
		checkRAM();
	}
	public static void main(String[] args) {
	

	}

}
