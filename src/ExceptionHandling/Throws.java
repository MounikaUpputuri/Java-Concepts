package ExceptionHandling;

public class Throws {
	
	//exception can not handled by thows exception
	public void m1()
	{
		System.out.println("A");
		m2();
	}
	public void m2()
	{
		System.out.println("B");
		m3();
//		try {
//		m3();
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("Arthimatic exception is coming");
//			e.printStackTrace();
//		}
	}
	public void m3() throws ArithmeticException
	{
		System.out.println("C");
		try {
		int i=10/0;
		}
		catch(Exception e)
		{
			System.out.println("Some exception is coming");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Throws obj=new Throws();
		obj.m1();
		System.out.println("bye");

		
		
		
	}

}
