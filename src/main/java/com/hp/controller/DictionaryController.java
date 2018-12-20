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
	@Autowired // 自动注入redis连接池
	private JedisPool jedisPool;
	@Autowired
	private DictionaryService dictionaryService;
	public void setDictionaryService(DictionaryService dictionaryService) {
		this.dictionaryService = dictionaryService;
	}
	
	/**
	 * 获取redis
	 */
	public Jedis getRedis() {
		Jedis redis = jedisPool.getResource();
		return redis;
	}
	
	/**
	 * 点赞功能
	 */
	
	@RequestMapping(value="dialZan.do")

	public String DialZan(@RequestParam("user_id")Integer user_id) {
		int uNum=dictionaryService.dialZan(user_id);
		return uNum>0?"True":"False";
	}
	/**
	 * 搜索功能
	 */
	@RequestMapping(value="searchCode.do")
	public String searchCode() {
		
		return "";
	}
	/**
	 * 评论功能
	 */
	@RequestMapping(value="talkCode.do")
	public String talkCode() {
		
		return "";
	}
	/**
	 * 获取作者作品
	 */
	@RequestMapping(value="getCodes.do")
	public String getCodes() {
		
		return "";
	}
	/**
	 * 用户登出
	 */
	@RequestMapping(value="exitUser.do")
	public String exitUser(@RequestParam("user_name")String user_name) {
		return getRedis().del(user_name)>0?"True":"False";
	}
	/**
	 * 用户登陆
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
	 * 用户信息
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
		//使用缓存
		
		System.out.println(dictionaryService.loginUser(user));
		return "";
	}
}
