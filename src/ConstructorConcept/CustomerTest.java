package ConstructorConcept;

public class CustomerTest {

	public static void main(String[] args) {
	
		Customer c=new Customer();
		c.setName("Mounika");
		System.out.println(c.getName());
		c.setComp("Google");
		c.setSal(10000);
		System.out.println(c.getcomp());
		System.out.println(c.getSal());

	}

}
