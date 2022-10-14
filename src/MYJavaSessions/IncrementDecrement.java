package MYJavaSessions;

public class IncrementDecrement {

	public static void main(String[] args) {
		// Post Increment
		int a=1;
		int b=a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c=-99;
		int d=c++;
		System.out.println(c);//-98
		System.out.println(d);//-99
		
		//pre increment
		int e=-97;
		int f=++e;
		System.out.println(e);//-96
		System.out.println(f);//-96
		
		int m=1;
		int n=++m;
		System.out.println(m);//2
		System.out.println(n);//2
		
		//post decrement
		
		int i=2;
		int j=i--;
		System.out.println(i);//1
		System.out.println(j);//2
		
		//pre decerement
		int L=2;
		int I=--L;
		System.out.println(L);//1
		System.out.println(I);//!
		
		int t1=10;
		System.out.println(t1++);//value will be increased and stored in t1.
		System.out.println(t1);
		
		int t2=20;
		System.out.println(++t2);//first value will be increased and then assigned to t2.
		
		
		
	}

}
