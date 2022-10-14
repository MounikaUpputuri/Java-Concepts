package OOPS_Encapsulation;

public class Employee {
	
	public static void main(String[] args) {
		Company cm=new Company();
		cm.hq="Mounika";
		cm.name="Baby";
		System.out.println(cm.name);
		cm.setShareprice(200);
		System.out.println(cm.getshareprice());
		cm.setShareprice(300);
		System.out.println(cm.getshareprice());
		cm.employeecompany("Hi", "Hello", 20);
		System.out.println(cm.getshareprice()+" "+cm.hq+" "+cm.name);
		
	
	
		
	}

}
