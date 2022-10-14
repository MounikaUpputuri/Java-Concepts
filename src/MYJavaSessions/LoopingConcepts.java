package MYJavaSessions;

public class LoopingConcepts {

	public static void main(String[] args) {
		// while loop
		//
		int i = 1;
		while (i < 19) {
			System.out.println(i);
			i++;
		}
		// infinite Loop example
//		int j=10;
//		while(true)
//		{
//			System.out.println(j);
//		}
		int k = 1;
		while (k < 20) {
			System.out.println(k);
			k++;
			if (k == 20)
				break;
		}
		// use while loop to print 10 to 1
		int num = 10;
		while (num >= 1) {
			System.out.println(num);
			num--;
		}
		System.out.println("--------------------------------");
		// For Loop (typical for loop or index based for loop)
		for (int j = 1; j <= 10; j++) {
			System.out.println(j);
		}
		// infinite for loop
//		for(int m=1;m<10;)
//		{
//			System.out.println("hello world");
//		}
		System.out.println("--------------------------------");
		// even numbers
		for (int n = 2; n <= 10; n = n + 2) {
			System.out.println(n);
		}
		System.out.println("--------------------------------");
		// odd numbers
		for (int odd = 1; odd <= 10; odd = odd + 2) {
			System.out.println(odd);
		}
		// print A-Z
		System.out.println("--------------------------------");
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.println(c);
		}
		// print a-z
		for (int as = 97; as <= 122; as++) {
			System.out.println((char) as);
		}
		// even numbers
		for (int n = 2; n <= 10; n++) {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		}
		System.out.println("--------------------------------");
		// print Hi after every 5 numbers
		for (int y = 1; y < 100; y++) {
			System.out.println(y);
			if (y % 5 == 0) {
				System.out.println("Hi");
			}
		}
		// do while loop
		int q = 1;
		do {

			System.out.println(q);
			q++;

		} while (q <= 10);
		System.out.println("--------------------------------");

		int w = 0;
		do {

			w++;
			System.out.println(w);

		} while (w <= 10);
		//00 01 02 03 
		//10 11 12 13
		//20 21 22 23
		//30 31 32 33
		
		for(int o=0;o<4;o++)
		{
			for(int p=0;p<4;p++) {
				System.out.print(o+""+p +" ");
			}
			System.out.println();
		}

	}
}