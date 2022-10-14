package BuilderPattern;

public class EcommApp {
	
	public EcommApp login()
	{
		System.out.println("Login with");
		return this;
	}
	public EcommApp login(String un, String pwd)
	{
		System.out.println("Login with"+":"+un+" :"+pwd);
		return this;

	}
	public EcommApp search(String search)
	{
		System.out.println("Search with "+search);
		return this;

	}
	public EcommApp Productname(String Productname)
	{
		System.out.println("addtocart with "+Productname);
		return this;

	}
	public EcommApp DoPayment(String cc, int cvv)
	{
		System.out.println("do payment with "+cc+" "+cvv);
		return this;

	}
	public EcommApp DoPayment(String cc, int cvv,int otp)
	{
		System.out.println("do payment with "+cc+" "+cvv+" "+otp);
		return this;

	}
	public EcommApp logout()
	{
		System.out.println("logout");
		return this;
	}
	
	
	
	
	
	
	
	

}
