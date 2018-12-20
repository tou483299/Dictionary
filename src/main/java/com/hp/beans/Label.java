package com.hp.beans;

import java.util.List;

public class Label {
private Integer label_id;
private String 	lable_content;
private List<Code> code_id;


public Integer getLabel_id() {
	return label_id;
}
public void setLabel_id(Integer label_id) {
	this.label_id = label_id;
}
public String getLable_content() {
	return lable_content;
}
public void setLable_content(String lable_content) {
	this.lable_content = lable_content;
}
public List<Code> getCode_id() {
	return code_id;
}
public void setCode_id(List<Code> code_id) {
	this.code_id = code_id;
}
public Label(Integer label_id, String lable_content, List<Code> code_id) {
	super();
	this.label_id = label_id;
	this.lable_content = lable_content;
	this.code_id = code_id;
}
@Override
public String toString() {
	return "Label [label_id=" + label_id + ", lable_content=" + lable_content + ", code_id=" + code_id + "]";
}
public Label() {
	super();
	// TODO Auto-generated constructor stub
} 



}
