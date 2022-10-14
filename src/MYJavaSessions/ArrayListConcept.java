package MYJavaSessions;
import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// array List - default class
		//need to create of object of arraylist using new keyword
		//it maintains the order and index
		
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add("Testing");
		ar.add(10.34);
		System.out.println(ar.get(0));
		System.out.println(ar.get(3));
		//to print all values of arraylist
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		//integer arraylist
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(200);
		ar1.add(300);
		//for each loop
		for( int e: ar1)
		{
			System.out.println(e);
		}
		//String ArrayList
		ArrayList<String> str= new ArrayList<String>();
		str.add("Hi");
		str.add("Hello");
		str.add("Mounika");
		System.out.println(str.size());
		for(String k:str)
		{
			System.out.println(k);
		}
		//object ArrayList
		ArrayList<Object>obj =new ArrayList<Object>();
		obj.add("Mounika");
		obj.add(10);
		obj.add("Hi");
		obj.add(10.67);
		System.out.println(obj.size());
		for(int j=0;j<obj.size();j++)
		{
			System.out.println(obj.get(j));
		}
		
	}

}
