package OOPS_AbstractClass;

public class TestPage {

	public static void main(String[] args) {
		LoginPage lp=new LoginPage();
		lp.title();
		lp.logo();
		lp.pagetitle();
		lp.url();
		lp.dologin("Mounika", "Mounika");
		lp.pagetitle();
		
		
		
		HomePage hp=new HomePage();
		hp.title();
		hp.logo();
		hp.url();
		hp.logout();
		
		//top casting
		
		Page p=new LoginPage();
		p.pagetitle();
		p.logo();
		p.title();
		p.url();
		
		//down casting is not allowed @ the compile time itself
		//LoginPage l=new Page();
		
		
		
		
	}

}
