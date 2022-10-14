package MYJavaSessions;

import java.util.ArrayList;

public class Customer {
	
	public ArrayList<String> dosearch(String Products)
	{
		System.out.println("Enter the course name"+Products);
		ArrayList<String> prodlist=new ArrayList<String>();
		switch(Products)
		{
		case "Apple":
		{
			prodlist.add("mac");
			prodlist.add("phone");
			prodlist.add("ipad");
			break;
		}
		case "samsung":{
			prodlist.add("mini");
			prodlist.add("samsung pro");
			prodlist.add("sam tablet");
			break;
		}
		case "HP":{
			prodlist.add("laptop");
			prodlist.add("phone");
			break;
		}
		default:{
			System.out.println("not found in product list...");
		}
		
		}
		return prodlist;
	}
		public String launchbrowser(String BrowserName, int version){
			System.out.println("Enter Browser Name"+BrowserName);
			if(BrowserName.equals("Chrome"))
			{
				System.out.println("CHrome Browser launched");
			}
			else if(BrowserName.equals("Firefox"))
			{
				System.out.println("Launched Firefox");
			}
			else
			{
				System.out.println("Invalid browser name"+BrowserName);
			}
			return BrowserName;
		}
		
		
		public String launchbrowser1(String BrowserName){
			System.out.println("Enter Browser Name");
			
			switch(BrowserName) {
			case "Chrome":
			{
				System.out.println("Launch Chrome browser");
			}
			case "Firefox":
			{
				System.out.println("Launch Firefox browser");
			}
			default :
			{
				System.out.println("Invalid broswer name:"+BrowserName);
			}
			}
			return BrowserName;
		}
		
	
	public static void main(String[] args) {
		Customer cus=new Customer();
		ArrayList<String> samsung=cus.dosearch("samsung");
		System.out.println(samsung);
		System.out.println(samsung.size());
		for(String e:samsung)
		{
			System.out.println(e);
		}
		System.out.println("-----------------------------");
		String chrome=cus.launchbrowser("Chrome",90);
		System.out.println(chrome);
		System.out.println("-----------------------------");
		String invalid=cus.launchbrowser1("Hi");
		System.out.println(invalid);

	}

}
