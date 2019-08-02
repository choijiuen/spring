package com.bit.day09.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeRun implements MethodBeforeAdvice{

	
	public void beforeMethod(JoinPoint joinPoint) {		//화살표 나와야지 AOP 작동되는 거다 

		System.out.println("before run....");
	}
	
	public void after(JoinPoint joinPoint) {		//화살표 나와야지 AOP 작동되는 거다 

		System.out.println("after run....");
	}
	
	public void around(ProceedingJoinPoint joinPoint) {		//화살표 나와야지 AOP 작동되는 거다 

		System.out.println("around before run....");
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("around after run....");
	}

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println(method.getName());
		System.out.println(args[0]);
		System.out.println(target);
		
	}
}
