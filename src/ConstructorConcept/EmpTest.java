package ConstructorConcept;

public class EmpTest {

	public static void main(String[] args) {
		Employee em=new Employee();
		em.age=12;
		em.id=10;
		em.isactive=true;
		
	Employee em1=new Employee("Hi", 23);
	System.out.println(em1.name+ " "+em1.age);
	Users U=new Users("Hi", 25);
	System.out.println(U.name+" "+U.id);
	
		
	
	
	}

}
