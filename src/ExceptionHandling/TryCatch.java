package ExceptionHandling;

public class TryCatch {
	
	String name;

	public static void main(String[] args) {
		System.out.println("Hii");
		System.out.println("Hii");
		System.out.println("Hii");
		TryCatch obj=new TryCatch();
		obj.name="Tom";
		//obj=null;
		//System.out.println(obj.name);//null pointer exception
		
		
		try {
			int i=10/0;
			System.out.println(obj.name);
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
		}
		catch(Exception e)
		{
			System.out.println("some exception is coming");
			e.printStackTrace();
		}
		catch(Throwable e)
		{
			System.out.println("some exception is coming");
			e.printStackTrace();
		}
		//error should be handled by error not exception vice versa
//		catch(Error e)
//		{
//			System.out.println("some exception is coming");
//			e.printStackTrace();
//		}
//		catch(Object e)
//		{
//			System.out.println("some exception is coming");
//			e.printStackTrace();
//		}
		/*catch(ArithmeticException e) {
			System.out.println("arthimatic exception is coming");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("null poniter exception");
			e.printStackTrace();
		}*/
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		
		
		
		
		
	}

}
