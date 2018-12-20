package com.hp.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hp.beans.User;
import com.hp.mapper.DictionaryMapper;

import redis.clients.jedis.JedisPool;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-mvc-servlet.xml")
public class DictTest {
	@Autowired // 自动注入redis连接池
	private JedisPool jedisPool;
	@Autowired
	private DictionaryMapper DictTest;

	public void setDictTest(DictionaryMapper dictTest) {
		DictTest = dictTest;
	}

	@Test
	public void test() {

//	
//		Jedis jedis = jedisPool.getResource();
//		jedis.set("a", "hello");
//		System.out.println(jedis.get("a"));
//		System.out.println(jedis.del("a"));
		User user = new User();
		user.setUser_name("tom");
		user.setUser_password("12313");
		System.out.println(DictTest.loginUser(user));
		
	}

}
