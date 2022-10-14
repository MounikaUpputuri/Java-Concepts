package OOPS_AbstractClass;

public class LoginPage extends Page{

	@Override
	public void title() {
		System.out.println("Loginpage-title");
		
	}
	public  LoginPage()
	{
		System.out.println("Constructor-LoginPage");
	}

	@Override
	public void url() {
		System.out.println("loginpage-url");
		
	}
	public void dologin(String username, String pwd)
	{
		System.out.println("Login with"+username +" "+pwd);
	}
	

}
