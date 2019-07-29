package com.bit.day04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bit.day04.modul.Module;

public class Ex05 {

	public static void main(String[] args) {
		String filename="classpath:/applicationContext.xml";	//클래스 패스로 하고싶으면 앞에 classpath 붙여야함, src, resources 같은데 들어있을 때
		
		ApplicationContext ctxt=null;
//		ctxt = new ClassPathXmlApplicationContext(filename);
		
		String path="C:\\java\\workspace5\\sts04\\src\\";
//		String path="C:\\java\\workspace5\\sts04\\target\\classes\\";
//		String path="./target/classes/";
//		ctxt=new FileSystemXmlApplicationContext(path+filename);		//얘는 파일시스템에서 파일경로를 통해 읽어 들인다.
		
		
		ctxt= new GenericXmlApplicationContext(filename);		//3.0부터는 이게 위에 두개의 기능을 한 번에 한다.
																//얘는 패키징 기준이다 주소가..
		Module module= (Module) ctxt.getBean("module");
		System.out.println(module.getMsg());
	}

}
