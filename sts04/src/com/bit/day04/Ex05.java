package com.bit.day04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bit.day04.modul.Module;

public class Ex05 {

	public static void main(String[] args) {
		String filename="classpath:/applicationContext.xml";	//Ŭ���� �н��� �ϰ������ �տ� classpath �ٿ�����, src, resources ������ ������� ��
		
		ApplicationContext ctxt=null;
//		ctxt = new ClassPathXmlApplicationContext(filename);
		
		String path="C:\\java\\workspace5\\sts04\\src\\";
//		String path="C:\\java\\workspace5\\sts04\\target\\classes\\";
//		String path="./target/classes/";
//		ctxt=new FileSystemXmlApplicationContext(path+filename);		//��� ���Ͻý��ۿ��� ���ϰ�θ� ���� �о� ���δ�.
		
		
		ctxt= new GenericXmlApplicationContext(filename);		//3.0���ʹ� �̰� ���� �ΰ��� ����� �� ���� �Ѵ�.
																//��� ��Ű¡ �����̴� �ּҰ�..
		Module module= (Module) ctxt.getBean("module");
		System.out.println(module.getMsg());
	}

}
