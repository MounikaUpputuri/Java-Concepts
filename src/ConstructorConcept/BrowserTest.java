package ConstructorConcept;

public class BrowserTest {

	public static void main(String[] args) {
		BrowserVersion BV=new BrowserVersion("Hi", 10.98, "Hello");
		BV.setName("Mounika");
		BV.setPlugin("Chrome");
		BV.setVersion(98.34);	
		System.out.println(BV.getName());
		System.out.println(BV.getPlugin());
		System.out.println(BV.getVersion());
		BV.setPlugin("firefox");
		System.out.println(BV.getName());
		System.out.println(BV.getPlugin());
		System.out.println(BV.getVersion());
		BV.browserversion("Hello", 98.2, "Evening");

	}

}
