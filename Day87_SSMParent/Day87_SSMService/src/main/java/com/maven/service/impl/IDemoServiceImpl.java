package com.maven.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.dao.IDemoDao;
import com.maven.pojo.Demo;
import com.maven.service.IDemoService;

@Service
public class IDemoServiceImpl implements IDemoService {
	
	@Autowired
	private IDemoDao demoDao;

	@Override
	public List<Demo> selectAll() {
		// TODO Auto-generated method stub
		return demoDao.selectAll();
	}

	@Override
	public int addDemo(Demo demo) {
		// TODO Auto-generated method stub
		return demoDao.addDemo(demo);
	}

}
