package com.hp.service;

import java.util.List;
import com.hp.beans.Code;

public interface CodeService {
	/*
	 * ��Ӵ���
	 */
  
   public int addCode(Code code);
   /*
    * ɾ������
    */
   
   public void delete();
   /*
    * �޸Ĵ���
    */
   
   public int update(Code code);
   /*
    * ��ѯ����
    */
   
   public List<Code> codes();
   /*
    * ����һ�Զ࣬���һ�Ĳ�ѯ�������ű� һ��user�� һ��codes�� 
    */
}
