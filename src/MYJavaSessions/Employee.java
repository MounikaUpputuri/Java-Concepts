package MYJavaSessions;

public class Employee {
	String name;
	String city;
	double salary;
	int age;
	boolean isperm;
	char gender;
	

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		//e1 is the object reference name
		//new employee() is the object
		//Employee is the class
		//non primitive data type
		e1.name="Tom";
		e1.age=25;
		e1.salary=250.34;
		e1.city="Hyderabad";
		e1.isperm=true;
		
		System.out.println(e1.age+" "+e1.name+" "+e1.city);
		Employee e2=new Employee();
		System.out.println(e2.age+" "+e2.name+" "+e2.city);//in this case output will be 0 null null
		e2.name="Mounika";
		System.out.println(e2.name+e2.gender+" "+e2.age);//Mounika 0 are the output
		System.out.println(e2.gender);//space
		
		
		
		
		
		

	}

}
