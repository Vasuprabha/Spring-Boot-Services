package com.sample.Model;

public class User {

	private String U_NAME;
	private String E_MAIL;

	public User() {
	}

	public User(String uName, String eMail) {
		this.U_NAME = uName;
		this.E_MAIL = eMail;
	}

	public String getU_NAME() {
		return U_NAME;
	}

	public void setU_NAME(String u_NAME) {
		U_NAME = u_NAME;
	}

	public String getE_MAIL() {
		return E_MAIL;
	}

	public void setE_MAIL(String e_MAIL) {
		E_MAIL = e_MAIL;
	}

}
