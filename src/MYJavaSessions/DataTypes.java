package MYJavaSessions;

public class DataTypes {

	public static void main(String[] args) {
		//byte
		//size:1byte=8bits
		//range:-128 to 127
		byte b=127;
		byte b1=-128;
		byte b2=50;
		b2=10;
		b2=30;
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b2+b);
		
		//Short:
		//size: 2 bytes=16bits
		//range:-32768 to 32767
		short s1=1234;
		System.out.println(s1);
		
		//integer
		//size:4 bytes=4*8=32bits
		//range:-2147483648 to 2147483647
		int i =1;
		int j=123456;
		System.out.println(i+j);
		
		//long 
		//size=8bytes=8*8=64 bits
		//range= -922337203685475808 to 922337203685475807
		long l=121212121;
		long l1=1212121212121212L;
		System.out.println(l+l1);
		
		//float
		//size=4bytes=32bits
		//range: after. it can take up to 7 digits.
		float f1=12.34f;
		float f2=(float) 12.36;
		float f3=100;
		System.out.println(f3);
		System.out.println(f1+f2);
		
		//double
		//size: 8bytes=64bits
		//range: can take up to 6 digits after .
		double d=34.56743243434334344343434343434344444444444444444444434443;
		double d1=1.1;
		System.out.println(d);
		System.out.println(d1);
		
		//character is single digit value
		//size: 2bytes=16bits
		//range:
		char c='M';//a-g,A-G
		char c1='1';//0-9
		System.out.println(c);
		System.out.println(c1);
		
		//boolean is true or false
		//size:  around 1 bit
		//range:
		boolean T=true;
		boolean F=false;
		System.out.println(T);
		System.out.println(F);
			
		
		
		
		
		
		

	}

}
