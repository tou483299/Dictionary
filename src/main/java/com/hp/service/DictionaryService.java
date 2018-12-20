package com.hp.service;

import java.util.List;

import com.hp.beans.Code;
import com.hp.beans.Talk;
import com.hp.beans.User;

public interface DictionaryService {
	/**
	 * ���޹���
	 */
	public int dialZan(Integer user_id);
	/**
	 * ��������
	 */
	public List<Code> searchCode(String code_content);
	/**
	 * ���۹���
	 */
	public int insertTalk(Code code,Talk talk);
	/**
	 * ��ȡ������Ʒ
	 */
	public List<Code> getCodes(User user);
	
	/**
	 * �û���½
	 */
	public User loginUser(User user);
}
