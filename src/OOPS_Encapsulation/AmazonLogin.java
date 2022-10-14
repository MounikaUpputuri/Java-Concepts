package OOPS_Encapsulation;

public class AmazonLogin {

	public static void main(String[] args) {
		LoginPage lp=new LoginPage();
		lp.setUsername("Mouni.upputuri@gmail.com");
		lp.setPassword("Mounika@123!");
		String un=lp.getUsername();
		System.out.println(un);
		lp.getPassword();
		lp.login(lp.getUsername(),lp.getPassword());
		lp.setPassword("Admin@123");
		lp.login(lp.getUsername(),lp.getPassword());
	}

}
