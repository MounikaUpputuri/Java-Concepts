package OOPS_Inheritence;

public  class Car extends Vechicle{ //public final class car extends vehicle
	
	//final class can not be parent
	//final method can not be overridden
	
	public  void start() //ex public final void start()
	{
		System.out.println("start");
	}
	public void stop()
	{
	System.out.println("stop");	
	}
	public void refuel()
	{
		System.out.println("Refuel");
	}
	public static void hello()
	{
		System.out.println("Car-static");
	}

}
