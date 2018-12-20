package com.hp.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hp.beans.User;
import com.hp.service.DictionaryService;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Controller
public class DictionaryController {
	@Autowired // �Զ�ע��redis���ӳ�
	private JedisPool jedisPool;
	@Autowired
	private DictionaryService dictionaryService;
	public void setDictionaryService(DictionaryService dictionaryService) {
		this.dictionaryService = dictionaryService;
	}
	
	/**
	 * ��ȡredis
	 */
	public Jedis getRedis() {
		Jedis redis = jedisPool.getResource();
		return redis;
	}
	
	/**
	 * ���޹���
	 */
	
	@RequestMapping(value="dialZan.do")

	public String DialZan(@RequestParam("user_id")Integer user_id) {
		int uNum=dictionaryService.dialZan(user_id);
		return uNum>0?"True":"False";
	}
	/**
	 * ��������
	 */
	@RequestMapping(value="searchCode.do")
	public String searchCode() {
		
		return "";
	}
	/**
	 * ���۹���
	 */
	@RequestMapping(value="talkCode.do")
	public String talkCode() {
		
		return "";
	}
	/**
	 * ��ȡ������Ʒ
	 */
	@RequestMapping(value="getCodes.do")
	public String getCodes() {
		
		return "";
	}
	/**
	 * �û��ǳ�
	 */
	@RequestMapping(value="exitUser.do")
	public String exitUser(@RequestParam("user_name")String user_name) {
		return getRedis().del(user_name)>0?"True":"False";
	}
	/**
	 * �û���½
	 */
	@RequestMapping(value="loginUser.do")
	public String loginUser(User user) {
		
		User user1=dictionaryService.loginUser(user);
		if(user1!=null) {
			getRedis().set("", "");
		}
		return getRedis().del()>0?"True":"False";
	}
	/**
	 * �û���Ϣ
	 */
	@RequestMapping(value="getUserInfo.do")
	public String getUserInfo(HttpServletRequest request) {
		Cookie[] cs = request.getCookies();
		Cookie cook=null;
		for (int i=0;i<cs.length;i++) {
			if(cs[i].getName().equals("username".getBytes())) {
				cook=cs[i];
			}
		}
		 byte[] user1 = getRedis().get(cook.getValue().getBytes());
		 User user=null;
		//ʹ�û���
		
		System.out.println(dictionaryService.loginUser(user));
		return "";
	}
}
