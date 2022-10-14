package MYJavaSessions;

public class EcommMethodOverLoading {
	//Ecommerce
	
	public void login(String UserName, String Password)
	{
		System.out.println("Login with:"+UserName+" "+Password);
	}
	public void login(String firstname, String lastname, int age )
	{
		System.out.println();
	}
	public void login(String Name, int otp)
	{
		System.out.println("Login using :"+Name+" "+otp);
	}
	public void login(int otp, int phonenumber)
	{
		System.out.println("Login using "+otp+" "+phonenumber);
	}
	//uber booking
	public void booking(String credit, int otp)
	{
		System.out.println("booking using "+credit+" "+otp);
	}
	public void booking(String debit,String arrival, String destination)
	{
		System.out.println("Booking using:"+debit+" :"+destination);
	}
	public void booking(int mobile, int upi, int otp)
	{
		System.out.println("booking using "+mobile+" "+upi+" "+otp);
	}
	
	public static void main(String[] args) {
		
		EcommMethodOverLoading obj=new EcommMethodOverLoading();
		obj.login(12, 13456);
		

	}

}
