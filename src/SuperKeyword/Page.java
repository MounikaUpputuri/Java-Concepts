package SuperKeyword;

public class Page {
	
	public Page()
	{
		System.out.println("defualt constructor");
	}
	public Page(int a )
	{
		System.out.println(a);
	}
	
	public Page(int a,int b )
	{
		System.out.println(a+b);
	}
	int timeout=100;
	
	public void display()
	{
		System.out.println("Page display");
	}

}
