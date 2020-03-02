package beans;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity

public class User implements Serializable{
	@Id @GeneratedValue
private Long id;
private String username;
private String password;
private Boolean enabled;
private String email;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(Long id, String username, String password, Boolean enabled, String email) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.enabled = enabled;
	this.email = email;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
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
public Boolean getEnabled() {
	return enabled;
}
public void setEnabled(Boolean enabled) {
	this.enabled = enabled;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}