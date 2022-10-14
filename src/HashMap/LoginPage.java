package HashMap;

import java.util.HashMap;

public class LoginPage {
	
	
	public static String getUserCred(String role) {
		HashMap<String, String> credmap=new HashMap<String, String>();
		credmap.put("admin", "admin@az.com;admin123");
		credmap.put("cashmanager","cashmanager@az.com;cashmanager@123");
		return credmap.get(role);
		}
	public static void dologin(String un, String pwd) {
		System.out.println("login with "+un+":"+pwd);
	}
	public static void main(String[] args) {
		//roll based access control - RBAC roles/users
		//hash map will help very effectively for RBAC
		String cred[]=getUserCred("admin").split(";");
		String un=cred[0].trim();
		String pwd=cred[1].trim();
		dologin(un, pwd);

		
		
		
		
		
	}

}
