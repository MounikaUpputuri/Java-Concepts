package MYJavaSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		// 
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		System.out.println(numbers);
		//array literals
		int i[]= {10,20,30,40,50};
		System.out.println(i);//gives only memory allocation
		System.out.println(Arrays.toString(i));
		
		ArrayList<String> Names=new ArrayList<String>(Arrays.asList("Mounika", "Rajesh","Mandava"));
		System.out.println(Names);
		
		ArrayList<String> l1=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l2=new ArrayList<String>(Arrays.asList("A","B","C","F","E"));
		ArrayList<String> l3=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		System.out.println(l3);
		
		Collections.sort(l3);//will sort the alphabetical order
		System.out.println(l2);
		System.out.println(l1.equals(l3));//it will give boolean answer either true or false
		System.out.println(l2.equals(l3));
		if(l1.equals(l3))
		{
			System.out.println("Pass");
		}
		ArrayList<String> l4=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l5=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
//		l4.removeAll(l5);//l4 will remove common elements from l5 and disaply extra elements in ll4.
//		System.out.println(l4);//remove will remove all the comman things in both the arrays
		l5.removeAll(l4);
		System.out.println(l5);
		
		//find out common elements 
		ArrayList<String> lang1=new ArrayList<String>(Arrays.asList("JAVA","PYTHON","JS","DS","Algo"));
		ArrayList<String> lang2=new ArrayList<String>(Arrays.asList("JAVA","PYTHON","JS","DS","PHP"));
		lang1.retainAll(lang2);//retain means it give common things in both the elements
		System.out.println(lang1);
		
		ArrayList<String> l6=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l7=new ArrayList<String>(Arrays.asList("p","q","r","s"));
		l6.addAll(l7);//adds all values to l6 from l7
		System.out.println(l6);
		System.out.println(l7);
		//l7.clear();//it will clear the entire arraylist
		System.out.println(l7);
		
		@SuppressWarnings("unchecked")
		ArrayList<String>clonelist=(ArrayList<String>)l7.clone();
		System.out.println(clonelist);
		
		ArrayList<String> l8=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		l8.add(0,"HI");//it will be added before 0th index
		System.out.println(l8);
		l8.add(10, "Hello");// array outbound exception.
		System.out.println(l8);
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
