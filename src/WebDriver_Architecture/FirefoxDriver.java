package WebDriver_Architecture;

public class FirefoxDriver implements WebDriver {
	
	
	@Override
	public void searchelement() {
		System.out.println("findelement-chromedriver");
	}

	@Override
	public void searchelements() {
		System.out.println("searchelements-chrome");
	}

	@Override
	public void click() {
		System.out.println("click-chrome");
	}

	@Override
	public void sendkeys(String value) {
		System.out.println("sendkeys"+value);
	}

	@Override
	public void geturl(String url) {
		System.out.println("url"+url);
	}

	@Override
	public void gettitle() {
		System.out.println("gettitle-chrome");
	}

	@Override
	public void close() {
		System.out.println("close - chrome");
	}

}
