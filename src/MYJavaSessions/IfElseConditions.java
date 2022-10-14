package MYJavaSessions;

public class IfElseConditions {

	public static void main(String[] args) {
		// If else condition:
		int a = 30;
		int b = 40;
		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}
		if (a == b) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}
//		if (false)// dead code example
//		{
//			System.out.println("Hi");
//		} else {
//			System.out.println("Bye");
//		}
		boolean flag = false;
		if (flag) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		int number = 10;
		if (number <= 100) {
			if (number >= 90) {
				System.out.println("Grade A");
				if (number >= 75) {
					System.out.println("Garde B");
				}
			} else {
				System.out.println("Invalid number");
			}
		}
		
		String browser="chrome";
		if(browser.equals("chrome"))
		{
			System.out.println("navigate to chrome");
		}
		else if(browser.equals("safari"))
		{
			System.out.println("naviagte to safari");
		}
		else if(browser.equals("firefox")) {
			System.out.println("naviagte to firefox");
		}
		else if(browser.equals("IE")) {
			System.out.println("navigate to IE");
		}
		else {
			System.out.println("invalid selection");
		}
			
		
	}
}
