package Assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arrays {

	public static void main(String[] args) {
		// Question 1: Write a program to print the following pattern using for loop:
		int number=4;
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=9;j++)
			{
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		System.out.println("---------------");
		//Question 2: Write a program to create a static Array, having following cricket data:
		//--name(String), age(age), team name(String), DOB(String), gender(char), Strike Rate(Double), isActive(boolean)
		//--Try to create multiple Object Arrays for different players 
		//--Try to print all the values of each player on the console using normal for/while loop and for each loop
		String emp[]=new String[3];
		emp[0]="Mounika";
		emp[1]="upputuri";
		emp[2]="Hi";
		int age[]=new int[1];
		age[0]=23;
		String teamname[]=new String[1];
		teamname[0]="virat";
		String DOB[]=new String[1];
		DOB[0]="28-08-1993";
		char gender[]=new char[1];
		gender[0]='F';
		double strikerate[]=new double[1];
		strikerate[0]=12.34;
		boolean isactive[]=new boolean[1];
		isactive[0]=true;
		
		//object array
		Object[] player1=new Object[6];
		player1[0]="name1";
		player1[1]=23;
		player1[2]="team1";
		player1[3]="234";
		player1[4]='F';
		player1[5]=true;
		
		Object[] player2=new Object[6];
		player2[0]="name1";
		player2[1]=23;
		player2[2]="team1";
		player2[3]="234";
		player2[4]='F';
		player2[5]=true;
		
		Object[] player3=new Object[6];
		player3[0]="name1";
		player3[1]=23;
		player3[2]="team1";
		player3[3]="234";
		player3[4]='F';
		player3[5]=true;
		
		for(Object e:player1)
		{
			System.out.println(e);
		}
		System.out.println("-----------");
		for(int i=0;i<player1.length;i++)
		{
			System.out.println(player1[i]);
		}
		System.out.println("-----------");
		int i=0;
		while (i<player1.length) {
			System.out.println(player1[i]);
			i++;
			
		}
		System.out.println("---------");
		/*Question 3: Try to print the following pattern on the console:
		                        n = 4
		                        n = 3
		                        n = 2
		                        n = 1
		                        n = 0*/
		int n[]=new int[5];
		n[0]=4;
		n[1]=3;
		n[2]=2;
		n[3]=2;
		n[4]=0;
		for(int i1=0;i1<n.length;i1++)
		{
			System.out.println("n ="+n[i1]);
		}
		//1. Write a Java program to create a new array list, add some colors (string) and print out the collection
		ArrayList<String> colours=new ArrayList<String>(java.util.Arrays.asList("Blue","yellow","violet","orange","red","white","green"));
		System.out.println(colours);
		//2. Write a Java program to insert an element into the array list at the first and last positions.
		ArrayList<String> insert=new ArrayList<String>(java.util.Arrays.asList("Blue","yellow","violet"));
		insert.add(0, "add me first");
		insert.add(4, "add me last");
		System.out.println(insert);
		//3. Write a Java program to retrieve an element (at a specified index) from a given array list.
		String array=insert.get(4);
		System.out.println(array);
		System.out.println(insert.get(3));
		//4. Write a Java program to update specific array element by given element.
		 insert.set(1, "magenta");
		 insert.set(2, "purple");
		int size= insert.size();
		System.out.println(size);
		System.out.println(insert);
		//5. Write a Java program to remove the third  element from a array list.
		insert.remove(3);
		System.out.println(insert);
		//6. Write a Java program to search an element in a array list.
		if(insert.contains("magenta"))
		{
			System.out.println("magenta is there");
		}
		else {
			System.out.println("magenta is not there");
		}
		System.out.println("--------------");
		// 7. Write a Java program to reverse elements in a array list
		Collections.reverse(insert);
		System.out.println(insert);
		for(i=insert.size()-1;i>0;i--)
		{
			System.out.println(insert.get(i));
		}
		System.out.println("-----------------");
		// 8. Write a Java program to extract a portion of a array list.
//		for(int j=2;j<5;j++) 
//		{
//			System.out.println(insert.get(j));
//		}
		System.out.println("----------");
		//Write a Java program of swap two elements in an array list
		System.out.println(colours);
		Collections.swap(colours, 2, 3);
		System.out.println(colours);
		//10. Write a Java program to empty an array list.
//		insert.removeAll(insert);
//		System.out.println(insert);
		//Write a Java program to trim the virtual capacity of an array list the current list size.
		insert.trimToSize();
		System.out.println(insert);
		
// 12. Write a Java program to print all the elements of a ArrayList using the position of the elements
		for(int k=0;k<insert.size();k++)
		{
			System.out.println(insert.get(k));
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

	private static Collection<? extends String> asList(ArrayList<String> insert) {
		// TODO Auto-generated method stub
		return null;
	}

}

