package ConstructorConcept;

public class Customer {

	
	private String name;
	private String comp;
	private int sal;
	
	public Customer()
	{
		System.out.println("default constructor");
	}
	
	
	public Customer(String name, String comp, int sal) {
		
		this.name = name;
		this.comp = comp;
		this.sal = sal;
	}


	public Customer(String comp, int sal) {
		
		this.comp = comp;
		this.sal = sal;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getcomp() {
		return comp;
	}


	public void setComp(String comp) {
		this.comp = comp;
	}


	public int getSal() {
		return sal;
	}


	public void setSal(int sal) {
		this.sal = sal;
	}


	public static void main(String[] args) {
		// 

	}




	

}
