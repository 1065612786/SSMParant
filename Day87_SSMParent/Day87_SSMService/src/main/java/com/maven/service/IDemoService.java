package com.maven.service;

import java.util.List;

import com.maven.pojo.Demo;

public interface IDemoService {
	
	List<Demo> selectAll();
	
	public int addDemo(Demo demo);
	
}
