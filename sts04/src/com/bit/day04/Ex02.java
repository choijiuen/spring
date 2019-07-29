package com.bit.day04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.day04.modul.Module3;

public class Ex02 {

	public static void main(String[] args) {
		
		//IoC (���� ����) 
//		Module3 module = new Module3();
//		module.setModule(new Module1());	//��� ��������� ������ ���⼭ ��������. , ������ Module���� ���������µ� 
		ClassPathXmlApplicationContext context=null;
		context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Module3 mod= (Module3) context.getBean("mod");
		mod.func();
		
		// Dependency Injection (������ ����) :���� ��ü�� �ٸ� ��ü�� ��ȣ�ۿ�(����)�ϰ� �ִٸ� 
		//���� ��ü�� �ٸ� ��ü�� �������� ������.
		//������� ���ؼ� � �������� �� �� ���� �ҰŴ�??, �� ������ ���� �����̰� , �̰� �ϱ� ���ؼ� ������ ������ ������ ������ ����ϴ� �Ŵ� 
		
	}

}
