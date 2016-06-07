package com.zhy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	/*
	 * ͨ����ͼ��������ViewResolver���õ�ʵ�ʵ�������ͼ
	 * ��ͼ�������Ľ�������prefix + returnvalue + suffix
	 * ��ϱ�ʵ������ͼ�������Ľ���������������ͼΪ��/WEB-INF/views/helloworld.jsp
	 * */
	@RequestMapping("/mvc")
	public String hello(){
		
		System.out.println("call controller");
		return "helloworld";
	}
}
