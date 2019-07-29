package com.bit.day04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.day04.modul.Module3;

public class Ex02 {

	public static void main(String[] args) {
		
		//IoC (제어 역전) 
//		Module3 module = new Module3();
//		module.setModule(new Module1());	//어떤게 수행될지의 권한이 여기서 정해졌다. , 원래는 Module에서 정해졌었는데 
		ClassPathXmlApplicationContext context=null;
		context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Module3 mod= (Module3) context.getBean("mod");
		mod.func();
		
		// Dependency Injection (의존성 주입) :현재 객체가 다른 객체와 상호작용(참조)하고 있다면 
		//현재 객체는 다른 객체에 의존성을 가진다.
		//제어역전을 위해서 어떤 의존성을 할 지 선택 할거다??, 주 목적은 제어 역전이고 , 이걸 하기 위해서 디자인 패턴인 의존성 주입을 사용하는 거다 
		
	}

}
