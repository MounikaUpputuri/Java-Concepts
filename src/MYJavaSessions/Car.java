package MYJavaSessions;

public class Car {
	String name;
	String color;
	int price;
	//static class variable should be common value for the all objects
	static int wheels=4;
	static String city="Bangalore";
	public static void method()
	{
		System.out.println("print method");
	}
	public static void main(String[] args) {
		// 
		Car c1=new Car();
		c1.name="BMW";
		c1.color="black";
		c1.price=123;
		
		Car c2=new Car();
		c2.color="Audi";
		c2.price=234;
		
		Car c3=new Car();
		c3.color="grey";
		c3.price=987;
		
		System.out.println(c1.name+" "+c1.price+" "+c1.color);
		//How to access static class
		//1. within the same class , you can access then directly.
		System.out.println(wheels);
		
		//2.we can access by class name
		System.out.println(Car.wheels);
		
		//3.we can access by object(not recommended)
		System.out.println(c1.wheels);
		method();
		System.out.println(city);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
