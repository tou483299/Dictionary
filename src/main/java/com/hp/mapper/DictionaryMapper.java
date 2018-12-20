package com.hp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hp.beans.Code;
import com.hp.beans.Talk;
import com.hp.beans.User;

public interface DictionaryMapper {
	/**
	 * 点赞功能
	 */
	@Update("update code set code_zan=code_zan+1 where code_id=#{code_id}")
	public int dialZan(Integer user_id);
	/**
	 * 搜索功能
	 */
	@Select("select * from code where code_content=#{code_content}")
	public List<Code> searchCode(String code_content);
	/**
	 * 评论功能
	 */
	@Insert("insert into talk(talk_content,code_id) values(#{talk_content},#{code_id})")
	public int insertTalk(Code code,Talk talk);
	/**
	 * 获取作者作品
	 */
	@Select("select code_id from userInfo where user_id=#{user_id}")
	public List<Code> getCodes(User user);
	
	/**
	 * 用户登陆
	 */
	@Select("select * from userInfo where user_name=#{user_name} and user_password=#{user_password}")
	public User loginUser(User user);
}
