package ConstructorConcept;

public class TestRegistration {

	public static void main(String[] args) {
		 Registration C= new Registration("Hi", "Tom", "MS", "Hi", "Hi", 100);
		 //C.firstname="Upputuri";
		 //System.out.println(C.firstname);
		 C.setFirstname("Mounika");
		 C.setLastname("Upputuri");
		 System.out.println(C.getFirstname());
		 System.out.println(C.getLastname());
		 C.Registrationtest();
		
		 

	}

}
