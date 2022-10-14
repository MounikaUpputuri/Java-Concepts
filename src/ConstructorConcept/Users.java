package ConstructorConcept;

public class Users {
	String name;
	int age;
	int id;
	public Users(String name, int age, int id) {
		
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public Users(int age, int id) {
		
		this.age = age;
		this.id = id;
	}
	public Users(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	
	
	

}
