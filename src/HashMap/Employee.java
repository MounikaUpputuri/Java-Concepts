package HashMap;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) {

		//Map(Interface) <---HashMap(Class)
		HashMap<String, String> empmap=new HashMap<String, String>();
		empmap.put("M", "Upputuri");
		empmap.put("R", "Mandava");
		System.out.println(empmap.get("M"));//always we have to give key
		System.out.println(empmap.get("Mandava"));
		
		HashMap<String, Integer> empmap1=new HashMap<String, Integer>();
		empmap1.put("Mounika", 200);
		empmap1.put("Rajesh", 3000);
		System.out.println("-----------");
		empmap1.forEach((k,v)->System.out.println(k+":"+v));
		System.out.println("-----------");
		System.out.println(empmap1.get("Mounika"));
		System.out.println(empmap1.get("Rajesh"));
		HashMap<Integer, Integer> empmap2=new HashMap<Integer, Integer>();
		empmap2.put(1, 100);
		System.out.println(empmap2.get(1));
		HashMap<Integer, String> empmap3=new HashMap<Integer, String>();
		empmap3.put(100, "Mounika");
		System.out.println(empmap3.get(100));
		

		



		
		
		
		
		
		
		
		
		
		
	}

}
