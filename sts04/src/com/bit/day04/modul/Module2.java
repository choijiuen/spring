package com.bit.day04.modul;

public class Module2 implements Module{
	private String msg="환영합니다.";
	
	public Module2() {				//setter 이용할 수 도 있고 생성자 이용할 수 도있다.
		
	}
	
	public Module2(String msg) {		
		this.msg=msg;
	}
	
	
	
	public String getMsg() {
		return msg;
	}

	
	
}
