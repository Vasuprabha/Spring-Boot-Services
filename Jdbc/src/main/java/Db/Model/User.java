package Db.Model;

public class User {

	private String username;
	private String email;

	public User() {
	}

	public User(String uName, String eMail) {
		this.username= uName;
		this.email= eMail;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



}
