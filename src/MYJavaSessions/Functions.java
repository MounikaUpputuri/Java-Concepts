package MYJavaSessions;

public class Functions {

	// no inpput and no return
	public void test() {
		System.out.println("test method");
		int i = 10;
		System.out.println(i);
	}

	public void getPrint() {
		System.out.println("print my paper");
	}

	// no input but some output
	public int getBalance() {
		System.out.println("Get Balance");
		int fee = 10;
		int tax = 5;
		int total = fee + tax;
		return total;
	}

	public String getTrainerName() {
		System.out.println("Get Trainer Name:");
		String name = "naveen";
		return name;
	}
	public boolean isEmpActive()
	{
		System.out.println("Is Employee Active");
		return true;
	}
	//some input and some output
	public int add(int a, int b) {  //a,b are method aruguments
		System.out.println("Enter a and b");
		int z=a+b;
		return z;
	}
	public int getCourseName(String CourseName)
	{
		System.out.println("Enter the course name: " + CourseName);
		if(CourseName.equals("Selenium"))
		{
			return 100;
		}
		else if(CourseName.equals("API")) {
			return 70;
		}
		else if(CourseName.equals("JAVA")) {
			return 50;
		}
		else {
			System.out.println("Course Not Found");
			return -1;
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		Functions obj = new Functions();
		obj.test();
		obj.getPrint();
		int p = obj.getBalance();
		System.out.println(p);
		System.out.println(obj.getBalance());
		String n1 = obj.getTrainerName();
		System.out.println("Get Trainer Name:" + n1);
		System.out.println(obj.isEmpActive());
		if(obj.isEmpActive()) {
			System.out.println("PASS");
		}
		boolean b1=obj.isEmpActive();
		System.out.println(b1);
		int s1=obj.add(10,20);//10, 20 are method parameters
		System.out.println(s1);
		int C1=obj.getCourseName("Selenium");
		System.out.println(C1);
		int c2=obj.getCourseName("C#");
		System.out.println(c2);
		if(c2==-1)
		{
			System.out.println("This not part of our training");
		}
		
	
	
	
	
	
	}
	

}
