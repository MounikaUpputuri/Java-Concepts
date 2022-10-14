package OOPS_Interface;

public interface USMedical extends WHO{
	
	//can not have any method body
	//only method type -abstract method(non static)
	//no method body , only method declaration
	//interfcae can not have business logic
	//after JDK1.8 you can static methods with body 
	//static interface can be accessed by interface name
	
	public void Phsycioservices();
	public void Cardioservices();
	public void oncologyservices();
	public void emergency();
	//after JDK1.8 you can static methods with body 
		//static interface can be accessed by interface name
	public static void billing()
	{
		System.out.println("Billing method");
	}
	//can have default method with method body
	
	 default void payment()
	{
		System.out.println("US medical payment");
	}
	
	
	
	
	
	
	

}
