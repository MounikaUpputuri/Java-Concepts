package MYJavaSessions;

public class StaticBlock {
	static {
		System.out.println("Static Block");
	}
	public static void test() {
		System.out.println("static method");
	}
	public static void main(String[] args) {
		System.out.println("main");
		test();
		

	}

}
