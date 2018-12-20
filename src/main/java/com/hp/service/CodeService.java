package com.hp.service;

import java.util.List;
import com.hp.beans.Code;

public interface CodeService {
	/*
	 * 添加词条
	 */
  
   public int addCode(Code code);
   /*
    * 删除词条
    */
   
   public void delete();
   /*
    * 修改词条
    */
   
   public int update(Code code);
   /*
    * 查询词条
    */
   
   public List<Code> codes();
   /*
    * 根据一对多，多对一的查询所有两张表 一张user表 一张codes表 
    */
}
