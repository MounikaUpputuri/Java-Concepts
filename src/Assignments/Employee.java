package Assignments;

public class Employee {
	//define class vars with private: name, age, salary, isActive, Gender
	private String name;
	private int age;
	private int salary;
	private boolean isactive;
	private char gender;
	
	//create getter and setter for each class private vars

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	public void getemployeeinfo()
	{
		System.out.println(name+ " "+age+" "+gender+" "+isactive+" "+salary);
		
	}

	public static void main(String[] args) {
		

	}

}
