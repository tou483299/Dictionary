package com.hp.beans;

public class Talk {
private Integer talk_id;
private String talk_content;
private Code code_id;


public Integer getTalk_id() {
	return talk_id;
}
public void setTalk_id(Integer talk_id) {
	this.talk_id = talk_id;
}
public String getTalk_content() {
	return talk_content;
}
public void setTalk_content(String talk_content) {
	this.talk_content = talk_content;
}
public Code getCode_id() {
	return code_id;
}
public void setCode_id(Code code_id) {
	this.code_id = code_id;
}
@Override
public String toString() {
	return "Talk [talk_id=" + talk_id + ", talk_content=" + talk_content + ", code_id=" + code_id + "]";
}
public Talk(Integer talk_id, String talk_content, Code code_id) {
	super();
	this.talk_id = talk_id;
	this.talk_content = talk_content;
	this.code_id = code_id;
}
public Talk() {
	super();
	// TODO Auto-generated constructor stub
}


}
