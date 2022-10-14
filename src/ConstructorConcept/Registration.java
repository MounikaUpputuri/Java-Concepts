package ConstructorConcept;

public class Registration {
	
	private String firstname;
	private String Lastname;
	private String email;
	private String password;
	private String confirmpwd;
	private int phonenumber;
	
	public Registration(String firstname, String lastname, String email, String password, String confirmpwd,
			int phonenumber) {
		
		this.firstname = firstname;
		this.Lastname = lastname;
		this.email = email;
		this.password = password;
		this.confirmpwd = confirmpwd;
		this.phonenumber = phonenumber;
	}
	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return Lastname;
	}


	public void setLastname(String lastname) {
		Lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getConfirmpwd() {
		return confirmpwd;
	}


	public void setConfirmpwd(String confirmpwd) {
		this.confirmpwd = confirmpwd;
	}


	public int getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public void Registrationtest()
	{
		System.out.println(firstname +" "+Lastname+" "+email+" "+password+" "+confirmpwd+" "+phonenumber);
	}


	public static void main(String[] args) {
		

	}

}
