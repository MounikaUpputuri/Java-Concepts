package Assignments;

public class Methods {

	public int  sum(int a, int b) {
		int sum=a+b;
		return sum;
	}
	public int product(int c, int d) {
		int product = c * d;
		return product;
	}

	public double circumference(int r) {
		double c = 2 * 3.14 * r;
		return c;
	}

	public double area(int r) {
		double areaofcircle = 3.14 * r * r;
		return areaofcircle;
	}

	public int maximum(int k, int l, int m, int max) {
		if(k>max)
			max=k;
		if(l>max)
			max=l;
		if(m>max)
			max=m;
		return max;
		}
	public int minimum(int ab, int bc, int cd, int min) {
		if (ab < min)
			min = ab;
		if (bc < min)
			min = bc;
		if (cd < min)
			min = cd;
		return min;
	}

	public int oddoreven(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is even number");
		} else {
			System.out.println(a + " odd number");
		}
		return a;
	}

	public void vote(int age) {
		if (age >=18) {
			System.out.println("eligiable for vote");
		} else {
			System.out.println("not eligiable");
		}
	}
	public void prime(int num)
	{
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
			}
		if (count == 2) {
			System.out.println("Entered Number " + num + " is Prime Number");
		} else {
			System.out.println("Entered Number " + num + " is Not Prime Number");
		}
	}
	
	public void grade(int i)
	{
		if(i>=91&&i<=100)
		{
			System.out.println("Grade AA");
		}
		if(i>=81&&i<=90)
		{
			System.out.println("Grade BB");
		}
		if(i>=71&&i<=80)
		{
			System.out.println("Grade CC");
		}
		if(i>=61&&i<=70)
		{
			System.out.println("Grade BC");
		}
		if(i>=51&&i<=60)
		{
			System.out.println("Grade CD");
		}
		if(i>=41&&i<=50)
		{
			System.out.println("Grade DD");
		}
		if(i<=40)
		{
			System.out.println("Fail");
		}
	}
	public void factorial(int number)
	{
		int fact = 1 ;
		int i1=1;
		for(i1=1;i1<=number;i1++)
		{
			fact=fact*i1;
		}
		System.out.println(fact);
	}
	
		

	public static void main(String[] args) {
		// 1.Write a program to print the sum of two numbers entered by user by defining
		// your own method
		Methods obj = new Methods();
		// System.out.print(obj.sum(10, 20));

		// 2. Define a method that returns the product of two numbers entered by
		// user.In 
		System.out.println(obj.product(2, 2));

		// 3.Write a program to print the circumference and area of a circle of radius
		// entered by user by defining your own method. 
		System.out.println(obj.circumference(2));
		System.out.println(obj.area(4));

		// System.out.println(obj.area(9));
		// 4. Define two methods to print the maximum and the minimum number
		// respectively among three numbers entered by user.
		int max=obj.maximum(12, 70, 40, -1);
		System.out.println(max);
		System.out.println(obj.minimum(1, 2, 3, 4));

		// 5. Define a program to find out whether a given number is even or odd.
		obj.oddoreven(30);
		// 6. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is elligible to vote.
		obj.vote(18);
		//7. Define a method to find out if number ﻿is prime or not.
		obj.prime(20);
		//Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
		obj.grade(34);
		obj.grade(94);
		//Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represente﻿d by n! and is equal to 1*2*3*....*(n-1)*n
		obj.factorial(5);
	
	
	
	
	
	}
	
	
	

}
