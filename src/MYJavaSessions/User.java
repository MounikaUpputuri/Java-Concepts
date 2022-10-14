package MYJavaSessions;

public class User {
	String name;
	int age;
	String city;
	

	public static void main(String[] args) {
		User u1=new User();
		u1.name="Mounika";
		u1.age=12;
		u1.city="Hyderabad";
		
		User u2=new User();
		u2.name="Rajesh";
		u2.age=23;
		u2.city="Bangalore";
		
		User u3=new User();
		u3.name="Mandava";
		u3.age=26;
		u3.city="Ongole";
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println("----------------------");
		u1=u2;
		System.out.println("----------------------");
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//Rajesh
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//Rajesh
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//Mandava
		System.out.println("----------------------");
		u2=u3;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//Rajesh
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//Mandava
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//Mandava
		System.out.println("----------------------");
		u3=u1;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//Rajesh
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//Mandava
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//Rajesh
		
		

	}

}
