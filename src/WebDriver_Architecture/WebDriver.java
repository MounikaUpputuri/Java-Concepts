package WebDriver_Architecture;

public interface WebDriver extends Search {
	
	public  void searchelement();
	public void searchelements();
	public void click();
	public void sendkeys(String value);
	public void geturl(String url);
	public void gettitle();
	public void close();
	
	
}
