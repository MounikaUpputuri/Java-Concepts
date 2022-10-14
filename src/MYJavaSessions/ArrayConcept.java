package MYJavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		// Integer Array
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		// i[4]=50;//index out of bound error
		System.out.println(i[0]);
		System.out.println(i[1]);
		int len = i.length;
		System.out.println(len);
		// to print all tha values from the array.
		for (int k = 0; k < len; k++) {
			System.out.println(i[k]);// 10 20 30 40
		}
		for (int j = 0; j <= len - 1; j++) {
			System.out.println(i[j]);// 10 20 30 40
		}
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);// 10 20 30 40
		}
		System.out.println("----------");
		for (int e : i) {
			System.out.println(e);
		}
		// double array
		double d[] = new double[3];
		d[0] = 10.12;
		d[1] = 12.32;
		d[2] = 13.21;
		System.out.println(d[2]);
		for (double j : d) {
			System.out.println(j);
		}

		// character array
		char c[] = new char[3];
		c[0] = 'A';
		c[1] = 'B';
		c[2] = 'C';
		for (char e : c) {
			System.out.println(e);
		}
		// String array
		String lang[] = new String[3];
		lang[0] = "Java";
		lang[1] = "Selenium";
		lang[2] = "python";
		// for each loop
		int index=0;
		for (String Q : lang) {
			System.out.println(index+":"+Q);
			index++;
		}
		// for loop for the same
		for (int p = 0; p < lang.length; p++) {
			System.out.println(p+":"+lang[p]);
		}
		//object array
		Object emp[]=new Object[3];
		emp[0]="Hello";
		emp[1]=10;
		emp[2]=10.34;
		for(Object Hi: emp)
		{
			System.out.println(Hi);
		}
		

	}

}
