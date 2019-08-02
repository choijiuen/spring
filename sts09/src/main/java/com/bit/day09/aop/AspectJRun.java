package com.bit.day09.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectJRun {
	
//	@Before("execution(* com.bit.day09.model.Day09Dao.*Bean(..))")
	public void before(JoinPoint joinPoint) {		//ȭ��ǥ ���;��� AOP �۵��Ǵ� �Ŵ� 

		System.out.println("before run....");
	}
	
//	@AfterReturning(value="execution(* com.bit.day09.model.Day09Dao.func*(..))", returning = "obj")
	public void after(Object obj) {		//ȭ��ǥ ���;��� AOP �۵��Ǵ� �Ŵ� 

		System.out.println("after run....");
	}
	
	@Around("execution(* com.bit.day09.model.Day09Dao.func*(..))")
	public void around(ProceedingJoinPoint joinPoint) {		//ȭ��ǥ ���;��� AOP �۵��Ǵ� �Ŵ� 
		System.out.println("around before run....");
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("around after run....");
	}
}
