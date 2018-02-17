package com.practice.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Pointcut("execution(public String getName())")
	public void allGetters() {}
	
	@Before("allGetters()")
	public void LoggingAdviceBeforeMethod1() {
		System.out.println("Before getName() 1");
	}
	
	@Before("allGetters()")
	public void LoggingAdviceBeforeMethod2() {
		System.out.println("Before getName() 2");
	}	
	
	@After("execution(public String getName())")
	public void LoggingAdviceAfterMethod() {
		System.out.println("After  getName()");
	}
}
