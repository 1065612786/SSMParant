package com.chen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chen.pojo.Dept;
import com.chen.service.IDeptService;

@RestController
public class DeptController {
	
	@Autowired
	private IDeptService deptService;
	
	@RequestMapping("/Depts")
	public List<Dept> getAllDepts(){
		return deptService.getAllDepts();
	}
}
