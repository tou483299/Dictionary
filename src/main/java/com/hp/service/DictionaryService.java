package com.hp.service;

import java.util.List;

import com.hp.beans.Code;
import com.hp.beans.Talk;
import com.hp.beans.User;

public interface DictionaryService {
	/**
	 * 点赞功能
	 */
	public int dialZan(Integer user_id);
	/**
	 * 搜索功能
	 */
	public List<Code> searchCode(String code_content);
	/**
	 * 评论功能
	 */
	public int insertTalk(Code code,Talk talk);
	/**
	 * 获取作者作品
	 */
	public List<Code> getCodes(User user);
	
	/**
	 * 用户登陆
	 */
	public User loginUser(User user);
}
