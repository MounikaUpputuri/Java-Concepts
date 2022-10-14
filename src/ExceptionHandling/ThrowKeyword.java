package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		try {
		throw new Exception("MounikaException");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//use case for throw
		String data=null;
		if(data==null)
			try {
				throw new Exception("data not found");
			}
		catch(Exception e)
		{
			System.out.println("Data not found exception is coming");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
