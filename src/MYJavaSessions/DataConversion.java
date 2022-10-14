package MYJavaSessions;

public class DataConversion {

	public static void main(String[] args) {
		
		String x="100";
		System.out.println(x+20);
		//conversion of string to integer
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		String y="100A";
		String m=y.replace("A", "");
		System.out.println(m);
		int n=Integer.parseInt(m);//exception number format
		System.out.println(n);
		
		String p="12.33";
		System.out.println(p+20);
		Double d=Double.parseDouble(p);
		System.out.println(d);
		
		int q=100;
		String total=String.valueOf(q);
		System.out.println(total);
		
		
		
		
		

	}

}
