package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="VASU_USERS")
public class Users {
	
@Column(name="userName")
	private String userName;
@Column(name="email")
	private String email;
	
public Users(){
	
}
public Users(String userNmae,String email)
{
	this.userName=userName;
	this.email=email;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString()
{
	return "Crudrepository  [User name= "+userName+ "+ Email= "+email+"]";
	
}


}
