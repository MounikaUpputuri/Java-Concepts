package SuperKeyword;

public class LoginPage extends Page {
	
	public LoginPage()
	{
		//super();
		super(10,20);
		System.out.println("default constructor");
		
	}

	
	int timeout=200;
	public void logininfo()
	{
		System.out.println("Login info methods");
	}
	
	public void display()
	{
		System.out.println("LP display");//child
		super.display();//parent
	}
	

	public void gettimeout()
	{
		System.out.println(timeout);
		System.out.println(super.timeout);//parent class variable
	}
}
