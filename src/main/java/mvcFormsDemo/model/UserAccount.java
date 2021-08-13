package mvcFormsDemo.model;

public class UserAccount {
	
	private String fname;
	private String lname;
	private String email;
	private String username;
	private String password;
	
	public UserAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserAccount(String fname, String lname, String email, String username, String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserAccount [fname=" + fname + ", lname=" + lname + ", email=" + email + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
	
	
	

}
