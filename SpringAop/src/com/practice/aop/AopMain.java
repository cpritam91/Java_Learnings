package com.practice.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.aop.service.ShapeService;

public class AopMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		ShapeService service = ctx.getBean("shapeService", ShapeService.class);
		
		String triangleName = service.getTriangle().getName();
		
		System.out.println(triangleName);
		
	}

}
