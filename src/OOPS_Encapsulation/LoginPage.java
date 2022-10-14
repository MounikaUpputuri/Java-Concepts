package OOPS_Encapsulation;

public class LoginPage {

	private String Username;
	private String Password;

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	public void login(String Username, String password)
	{
		System.out.println("login with "+Username+" and"+" "+password);
	}

	public static void main(String[] args) {
		
		
		
		

	}

}
