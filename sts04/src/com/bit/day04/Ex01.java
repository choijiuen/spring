package com.bit.day04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.day04.modul.Module;
import com.bit.day04.modul.Module1;
import com.bit.day04.modul.Module2;

public class Ex01 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		Module2 mod =(Module2) context.getBean("module");	//���� getBean�ȿ� ���� applicationContext���� �޾ƿ��� �Ŵ�
															//<bean id="module" class="com.bit.day04.modul.Module2"> ���⼭ id���� �޾ƿ��� ����
		System.out.println(mod.getMsg());

	}

}
