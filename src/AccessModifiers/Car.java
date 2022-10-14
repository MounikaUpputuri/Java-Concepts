package AccessModifiers;

public class Car {

	String name;
	public String color;
	private int Licensenumber;
	protected int price;
	
	
	public void class1() {
		System.out.println("A class car");
	}
	private void expense()
	{
		System.out.println("most expensive");
	}
	protected void invest()
	{
		System.out.println("More investimnet");
	}
	
	
	public static void main(String[] args) {

		Car c=new Car();
		c.color="white";
		c.Licensenumber=123;
		c.name="audi";
		c.price=12343;
		c.class1();
		c.expense();
		c.invest();
		
	}

}
