package MYJavaSessions;

public class Switch {

	public static void main(String[] args) {
		//switch can not handle boolean type of data
		String browser="Chrome";
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "IE":
			System.out.println("launch IE");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;

		default:
			System.out.println("not a valid browser");
			break;
		}
		int num=100;
		switch (num) {
		case 100:
			System.out.println("Grade A");
			break;
		case 90:
			System.out.println("Grade B");
			break;

		default:
			System.out.println("fail");
			break;
		}
		
		boolean flag=true;
				if(!flag)
				{
					System.out.println("fail");
				}
				else {
					System.out.println("pass");
				}
		
		
		
		
		
		
		
	}

}
