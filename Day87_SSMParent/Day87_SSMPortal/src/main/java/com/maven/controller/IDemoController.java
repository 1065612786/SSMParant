package com.maven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.maven.pojo.Demo;
import com.maven.service.IDemoService;

@RestController
public class IDemoController {
	
	@Autowired
	private IDemoService demoService;
	
	@RequestMapping("/Demos")
	public List<Demo> getAllDepts(){
		return demoService.selectAll();
	}
	
	
	@RequestMapping(value="/addDemo",method=RequestMethod.POST)
	@ResponseBody
	public String addDemo(Demo demo){
		System.out.println(demo);
		int res=demoService.addDemo(demo);
		if (res==0) {
			return "{\"error\":\"信息有誤\"}";
		} else {
            return "{\"success\":\"添加成功\"}";
		}
	}
}	
