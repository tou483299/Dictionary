package com.hp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hp.beans.Code;

public interface CodeMapper {
	/*
	 * ��Ӵ���
	 */
   @Insert("insert into code(code_title,code_content,add_img,lable_id) values(#{code_title},#{code_content},#{add_img},#{lable_id})")	
   public int addCode(Code code);
   /*
    * ɾ������
    */
   @Delete("delete from code where code_id=#{code_id}")
   public void delete();
   /*
    * �޸Ĵ���
    */
   @Update("update code set code_title=#{code_title},code_content=#{code_content} where code_id=#{code_id}")
   public int update(Code code);
   /*
    * ��ѯ����
    */
   @Select("select * from code")
   public List<Code> codes();
   /*
    * ����һ�Զ࣬���һ�Ĳ�ѯ�������ű� һ��user�� һ��codes�� 
    */
   

}
