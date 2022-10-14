package OOPS_Encapsulation;

public class Company {

	public String name;
	private int shareprice;
	public String hq;

	public int getshareprice() {
		return shareprice;
	}

	public void setShareprice(int shareprice) {
		this.shareprice = shareprice;
	}
	public void employeecompany(String name, String hq, int shareprice)
	{
		System.out.println(name+" "+hq+" "+shareprice);
	}

	public static void main(String[] args) {
		//
		Company cm = new Company();
		cm.shareprice = 100;
		cm.name = "Hello";
		cm.hq = "Hi";

	}

}
