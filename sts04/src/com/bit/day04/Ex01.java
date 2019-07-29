package com.bit.day04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.day04.modul.Module;
import com.bit.day04.modul.Module1;
import com.bit.day04.modul.Module2;

public class Ex01 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		Module2 mod =(Module2) context.getBean("module");	//여기 getBean안에 값을 applicationContext에서 받아오는 거다
															//<bean id="module" class="com.bit.day04.modul.Module2"> 여기서 id값을 받아오는 거임
		System.out.println(mod.getMsg());

	}

}
