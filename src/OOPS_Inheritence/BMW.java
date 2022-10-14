package OOPS_Inheritence;

public class BMW extends Car {
	
	//overridden method
	@Override
	public void start()
	{
		System.out.println("BMW--start");
	}
	public void autoparking()
	{
		System.out.println("BMW-auto parking");
	}

	public static void hello()
	{
		System.out.println("BMW-static");
	}
}
