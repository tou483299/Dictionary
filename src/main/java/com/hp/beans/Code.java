package com.hp.beans;

import java.util.Date;
import java.util.List;

public class Code {
private Integer code_id; 
private String code_title;
private String code_content;
private String add_img;
private Date add_time;
private Integer see_sum;
private List<Label> lable_id;



public Integer getCode_id() {
	return code_id;
}
public void setCode_id(Integer code_id) {
	this.code_id = code_id;
}
public String getCode_title() {
	return code_title;
}
public void setCode_title(String code_title) {
	this.code_title = code_title;
}
public String getCode_content() {
	return code_content;
}
public void setCode_content(String code_content) {
	this.code_content = code_content;
}
public String getAdd_img() {
	return add_img;
}
public void setAdd_img(String add_img) {
	this.add_img = add_img;
}
public Date getAdd_time() {
	return add_time;
}
public void setAdd_time(Date add_time) {
	this.add_time = add_time;
}
public Integer getSee_sum() {
	return see_sum;
}
public void setSee_sum(Integer see_sum) {
	this.see_sum = see_sum;
}
public List<Label> getLable_id() {
	return lable_id;
}
public void setLable_id(List<Label> lable_id) {
	this.lable_id = lable_id;
}
@Override
public String toString() {
	return "Code [code_id=" + code_id + ", code_title=" + code_title + ", code_content=" + code_content + ", add_img="
			+ add_img + ", add_time=" + add_time + ", see_sum=" + see_sum + ", lable_id=" + lable_id + "]";
}
public Code(Integer code_id, String code_title, String code_content, String add_img, Date add_time, Integer see_sum,
		List<Label> lable_id) {
	super();
	this.code_id = code_id;
	this.code_title = code_title;
	this.code_content = code_content;
	this.add_img = add_img;
	this.add_time = add_time;
	this.see_sum = see_sum;
	this.lable_id = lable_id;
}
public Code() {
	super();
	// TODO Auto-generated constructor stub
}



}
