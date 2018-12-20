package com.hp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hp.beans.Code;
import com.hp.mapper.CodeMapper;
import com.hp.service.CodeService;

public class CodeServiceImpl implements CodeService{
	@Autowired
	private CodeMapper codeMapper;
	
	
	public void setCodeMapper(CodeMapper codeMapper) {
		this.codeMapper = codeMapper;
	}

	public int addCode(Code code) {
		// TODO Auto-generated method stub
		return codeMapper.addCode(code);
	}

	public void delete() {
		// TODO Auto-generated method stub
		codeMapper.delete();
	}

	public int update(Code code) {
		// TODO Auto-generated method stub
		return codeMapper.update(code);
	}

	public List<Code> codes() {
		// TODO Auto-generated method stub
		return null;
	}
  
}
