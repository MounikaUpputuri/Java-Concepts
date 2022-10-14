package AccessModifiers;

public class BMW extends Car{

	public static void main(String[] args) {
		Car c=new Car();
		c.color="brown";
		c.name="bmw123";
		c.price=123123;
		c.invest();
		c.class1();
		
		BMW b=new BMW();
		b.color="brown";
		b.price=1231;
		b.name="Bmw";
		b.invest();
		b.class1();
		
	}

}
