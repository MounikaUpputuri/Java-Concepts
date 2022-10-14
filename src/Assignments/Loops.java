package Assignments;

public class Loops {

	public static void main(String[] args) {
		//1. WAP to print i am a batman (5 times)
		//int batman=5;
		for(int i=0;i<5;i++)
		{
			System.out.println("I am Batman");
		}
		System.out.println("----------");
		//2. WAP to print following 9 time with number
		for(int j=1;j<=9;j++)
		{
			System.out.println("I am Batman"+" "+j);
		}
		System.out.println("----------");
		//3. 3. WAP to print 10 to 1 using for, while and do-while loop
		for(int k=10;k>=1;k--)
		{
			System.out.println(k);
		}
		System.out.println("----------");
		int q=10;
		while (q>=1) {
			System.out.println(q);
			q--;
		}
		System.out.println("----------");
		int R=10;
		do {
			System.out.println(R);
			R--;
			
		} while (R>=1);
		//4. Write a program in Java to print "Hello World" ten times using while loop
		int U=1;
		while (U<10) {
			System.out.println("Hello World");
			U++;
			
		}
		System.out.println("----------");
		//5. Write a program in Java to print 1 to 10 using while loop
		int F=1;
		while (F<10) {
			System.out.println(F);
			F++;
			
		}
		System.out.println("----------");
		//6. WAP to find out the max number from the given positive numbers
		int n1=23;
		int n2=34;
		int n3=45;
		int max=-1;
		if(n1>max);
		max=n1;
		if(n2>max);
		max=n2;
		if(n3>max);
		max=n3;
		System.out.println(max);
		System.out.println("----------");
		//7. print all odd and even numbers between 1 to 100
		for(int h=1;h<100;h++)
		{
			if(h%2==0)
			{
				System.out.println(h+" is even number");
			}
		}
		System.out.println("----------");
		for(int y=0;y<100;y++)
		{
			if(y%2!=0) {
				System.out.println(y+" is odd number");
			}
		}
		//8. What will be the output of this program: infinte loop
//		int i = 1;
//
//		while(i<=1)
//			System.out.println("Hi Java");
		System.out.println("----------");
		//9. Print A-Z , a-z, 0-9 with the respective ASCII numbers on the console.
		for(char c='A';c<'Z';c++)
		{
			System.out.println((int)c+"."+c);//static cast
		}
		System.out.println("----------");
		for(char c='a';c<'z';c++)
		{
			System.out.println((int)c+"."+c);
		}
		System.out.println("----------");
		for(int z=0;z<9;z++)
		{
			System.out.println((char)z+"."+z);
		}
		for(int t=97;t<=121;t++)
		{
			System.out.println((char)t+"."+t);//static cast
		}
		System.out.println("----------");
		for(int d=65;d<=89;d++)
		{
			System.out.println((char)d+"."+d);
		}
		System.out.println("----------");
		//10. Print this series: 1.0 2.0 3.0  ...... 10.0
		for(double a=1.0;a<=10.0;a++)
		{
			System.out.println(a);
		}
		//11. Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		System.out.println("----------");
		int l=1;
		while (l<10) {
			System.out.println(l);
			l++;
			if(l==7)
			{
				System.out.println("See you tomorrow");
				break;
			}
		}
		//12. Write a cricket score card system using for and while loops:
		System.out.println("----------");
		//if condition
		int score = 0;
		if(score==0) 
		{
			System.out.println("Zero - duck");
		}
		else if(score==25)
		{
			System.out.println("good job");
		}
		else if(score==50)
		{
			System.out.println("good job - half century");
		}
		else if(score==100)
		{
			System.out.println("good job - century");
		}
		else {
			System.out.println("not a valid number");
		}
		//for loop
		System.out.println("----------");
		for(int scores=0;scores<=100;scores++)
		{
			if(scores==25)
			{
				System.out.println("good job");
			}
			if(scores==50)
			{
				System.out.println("good job-half century");
			}
			if(scores==100)
			{
				System.out.println("good job - century");
			}
			if(scores==0)
			{
				System.out.println("zero-duck");
			}
		}
		//while loop
		System.out.println("----------");
		int scoree=0;
		while (scoree<=100) 
		{
			if(scoree==0) {
				System.out.println("zero-duck");
			}
			if(scoree==25)
			{
				System.out.println("good job");
			}
			if(scoree==50)
			{
				System.out.println("good job-half century");
			}
			if(scoree==100)
			{
				System.out.println("good job-century");
			}
			scoree++;
		}
		}
	

	}


