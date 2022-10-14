package MYJavaSessions;

public class StringConcat {

	public static void main(String[] args) {
		// String Concatination
		
		String s="Hi";
		String s1="Automation";
		String s2="Hello";
		String s3="Testing";
		int a=100;
		int b=200;
		
		System.out.println(s1+s2);//concatination operator
		System.out.println(a+b);//addtion operator
		
		System.out.println(a+b+s1+s2+s3);
		System.out.println(s+s1+s2+a+b);
		System.out.println(s1+s2+(a+b));
		
		double d=12.34;
		double d1=23.54;
		System.out.println(s1+s2+d+d1);
		
		char c1='A';//ASCII number for A is 65
		char c2='B';//ASCII number for B is 66
		System.out.println(c1+c2);
		System.out.println(c1+""+c2);
		
		byte b1=12;
		byte b2=39;
		System.out.println(b1+b2);
		int b3=b1+b2;
		System.out.println(b3);
		
		int g=10;
		int h=3;
		System.out.println(g/h);
		//System.out.println(9/0);//Arithmetic exception
		System.out.println(0/9);
		System.out.println(0.0/0);//not a number
		System.out.println(0/0.0);//not a number
		System.out.println(5.0/0.0);//infinity
		
		char t='a';
		System.out.println((int)t);//type casting is conversion of data types.
		
	}

}
