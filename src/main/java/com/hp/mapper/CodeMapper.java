package com.hp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hp.beans.Code;

public interface CodeMapper {
	/*
	 * 添加词条
	 */
   @Insert("insert into code(code_title,code_content,add_img,lable_id) values(#{code_title},#{code_content},#{add_img},#{lable_id})")	
   public int addCode(Code code);
   /*
    * 删除词条
    */
   @Delete("delete from code where code_id=#{code_id}")
   public void delete();
   /*
    * 修改词条
    */
   @Update("update code set code_title=#{code_title},code_content=#{code_content} where code_id=#{code_id}")
   public int update(Code code);
   /*
    * 查询词条
    */
   @Select("select * from code")
   public List<Code> codes();
   /*
    * 根据一对多，多对一的查询所有两张表 一张user表 一张codes表 
    */
   

}
