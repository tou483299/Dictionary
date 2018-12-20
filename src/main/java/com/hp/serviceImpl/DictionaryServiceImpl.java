package com.hp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hp.beans.Code;
import com.hp.beans.Talk;
import com.hp.beans.User;
import com.hp.mapper.DictionaryMapper;
import com.hp.service.DictionaryService;

public class DictionaryServiceImpl implements DictionaryService {

	@Autowired
	private DictionaryMapper dictionaryMapper;

	public void setDictionaryMapper(DictionaryMapper dictionaryMapper) {
		this.dictionaryMapper = dictionaryMapper;
	}

	@Override
	public int dialZan(Integer user_id) {
		// TODO Auto-generated method stub
		return dictionaryMapper.dialZan(user_id);
	}

	@Override
	public List<Code> searchCode(String code_content) {
		// TODO Auto-generated method stub
		return dictionaryMapper.searchCode(code_content);
	}

	@Override
	public int insertTalk(Code code, Talk talk) {
		// TODO Auto-generated method stub
		return dictionaryMapper.insertTalk(code, talk);
	}

	@Override
	public List<Code> getCodes(User user) {
		// TODO Auto-generated method stub
		return dictionaryMapper.getCodes(user);
	}

	@Override
	public User loginUser(User user) {
		// TODO Auto-generated method stub
		return dictionaryMapper.loginUser(user);
	}
	
}
