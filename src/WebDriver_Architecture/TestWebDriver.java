package WebDriver_Architecture;

public class TestWebDriver {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//ChromeDriver driver =new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		
		//cross browser logic
		String browser="Firefox";
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver =new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("SafariBrowser"))
		{
			driver=new SafariBrowser();
		}
		else {
			System.out.println("please enter valid browser");
		}
		
		
		driver.geturl("www.google.com");
		driver.gettitle();
		
		

	}

}
