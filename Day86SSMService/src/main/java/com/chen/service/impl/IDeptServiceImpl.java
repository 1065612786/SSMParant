package com.chen.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chen.dao.IDeptDao;
import com.chen.pojo.Dept;
import com.chen.service.IDeptService;

@Service
public class IDeptServiceImpl implements IDeptService {
	
	@Autowired
	private IDeptDao deptDao;


	@Override
	public List<Dept> getAllDepts() {
		// TODO Auto-generated method stub
		return deptDao.getAllDepts();
	}

}
