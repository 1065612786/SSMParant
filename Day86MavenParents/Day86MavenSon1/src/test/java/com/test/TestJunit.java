package com.test;

import org.junit.Test;
import org.springframework.stereotype.Controller;

@Controller
public class TestJunit {
	
	@Test
	public void test01(){
		System.out.println("这是Son1的测试方法");
	}
}
