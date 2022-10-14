package OOPS_AbstractClass;

public abstract class WebApp {
	
	//we can acheive 0% abstraction --no abs method
	//we can acheive 100% abstraction--only abs method
	// partial abs method (abs method+non abs method)
	
	public void url() {
		System.out.println("url-webapp");
	}
	public void title()
	{
		System.out.println("title-webapp");
	}
	
	public abstract void header();
	public abstract void footer();
	
	

}
