package Assignments;



public class MethodOverLoading {
	
	public void login(int phone, String password)
	{
		System.out.println("Login with password");
	}
	public void login(int phone, int otp)
	{
		System.out.println("Login with phone &otp");
	}
	public void login(String username, String password)
	{
		System.out.println("login with username and password");
	}
	public void login(String username, String password, int otp)
	{
		System.out.println("Login with username and password and otp");
	}
	public int serachrestaurant(String name) {
		return 100;
	}
	public <integer> void serachrestaurant(String name, String food) {
	
	
	}
	
	
 
	public static void main(String[] args) {
		// Consider a food delivery system and try to overload following feaures:
		
		MethodOverLoading obj=new MethodOverLoading();
		obj.login(19234,879);
		obj.login(9876, "Password");
		obj.login("UserName", "PassWord");
		obj.login("username2", "password", 9876);
		System.out.println(obj.serachrestaurant("Hi"));
		obj.serachrestaurant("Hihi", "Food");
	}

}
