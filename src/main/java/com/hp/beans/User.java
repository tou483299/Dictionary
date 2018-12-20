package com.hp.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable {
private Integer user_id;
private String user_name;
private String user_password;
private String user_img;
private Integer user_value;
private Date user_punch;
private List<Code> code_id;



public List<Code> getCode_id() {
	return code_id;
}
public void setCode_id(List<Code> code_id) {
	this.code_id = code_id;
}
public Integer getUser_id() {
	return user_id;
}
public void setUser_id(Integer user_id) {
	this.user_id = user_id;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getUser_password() {
	return user_password;
}
public void setUser_password(String user_password) {
	this.user_password = user_password;
}
public String getUser_img() {
	return user_img;
}
public void setUser_img(String user_img) {
	this.user_img = user_img;
}
public Integer getUser_value() {
	return user_value;
}
public void setUser_value(Integer user_value) {
	this.user_value = user_value;
}
public Date getUser_punch() {
	return user_punch;
}
public void setUser_punch(Date user_punch) {
	this.user_punch = user_punch;
}

@Override
public String toString() {
	return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_password=" + user_password + ", user_img="
			+ user_img + ", user_value=" + user_value + ", user_punch=" + user_punch + ", code_id=" + code_id + "]";
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(Integer user_id, String user_name, String user_password, String user_img, Integer user_value,
		Date user_punch, List<Code> code_id) {
	super();
	this.user_id = user_id;
	this.user_name = user_name;
	this.user_password = user_password;
	this.user_img = user_img;
	this.user_value = user_value;
	this.user_punch = user_punch;
	this.code_id = code_id;
}



}
