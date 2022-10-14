package MYJavaSessions;

public class CallbyValueAndCallbyReference {
	String name;
	String color;
	Double value;
	
	public void getinfo(CallbyValueAndCallbyReference br)
	{
	System.out.println("Get Info");	
	}
	public void sum(int a, int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallbyValueAndCallbyReference b=new CallbyValueAndCallbyReference();
		b.getinfo(b); //call by reference
		b.sum(10, 20);//call by value

	}

}
