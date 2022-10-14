package OOPS_AbstractClass;

public abstract class Page {
	
	//abstract class object cannot created
	//abstract method cannot have method body
	//abstract    can have constructor
	
	public Page()
	{
		System.out.println("default from page class Constructor");
	}
	public Page(String a, String b)
	{
		System.out.println("2 param constructor");
	}
	public abstract void title();
	public abstract void url();
	public final void pagetitle()
	{
		System.out.println("page - title");
	}
	public void logo()
	{
		System.out.println("Logo-Page");
	}
	
}
