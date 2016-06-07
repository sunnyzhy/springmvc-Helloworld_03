package com.zhy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	/*
	 * 通过视图解析器（ViewResolver）得到实际的物理视图
	 * 视图解析器的解析规则：prefix + returnvalue + suffix
	 * 结合本实例，视图解析器的解析出来的物理视图为：/WEB-INF/views/helloworld.jsp
	 * */
	@RequestMapping("/mvc")
	public String hello(){
		
		System.out.println("call controller");
		return "helloworld";
	}
}
