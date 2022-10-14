package MYJavaSessions;

public class StaticAndNonStatic {
	public void m1() {
		System.out.println("m1");
		m2();
		n1();
	}
	public void m2() {
		System.out.println("m2");
		m3();
	}
	public void m3() {
		System.out.println("m3");
	}
	public static void n1()
	{
		System.out.println("n1");
		n2();
	}
	public static void n2() {
		System.out.println("n2");
		StaticAndNonStatic mmm=new StaticAndNonStatic();
		mmm.m1();
		n3();
	}
	public static void n3() {
		System.out.println("n3");
		StaticAndNonStatic mm=new StaticAndNonStatic();
		mm.m1();
	}

	public static void main(String[] args) {
		
		StaticAndNonStatic obj=new StaticAndNonStatic();
		obj.m1();
		obj.m2();
		obj.m3();
		n1();
		n3();
				
	}

}
