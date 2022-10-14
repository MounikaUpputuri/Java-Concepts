package ConstructorConcept;

public class Employee {
	
	String name;
	int age;
	int salary;
	boolean isactive;
	int id;
	
	public Employee() {
		System.out.println("default constructor");
	}
	public Employee(int age)
	{
		System.out.println();
	}

	public Employee(String name, int age, int salary, boolean isactive, int id) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isactive = isactive;
		this.id = id;
	}
	
	public Employee(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public Employee(int salary, boolean isactive, int id) {
		
		this.salary = salary;
		this.isactive = isactive;
		this.id = id;
	}
	public static void main(String[] args) {
		
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
