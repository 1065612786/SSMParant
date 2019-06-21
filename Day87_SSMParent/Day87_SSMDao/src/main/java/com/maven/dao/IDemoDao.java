package com.maven.dao;

import java.util.List;

import com.maven.pojo.Demo;

public interface IDemoDao {
	
	List<Demo> selectAll();
	
	public int addDemo(Demo demo);
	
	public int delDemo(int id);
	
	public int updDemo(Demo demo);
}
