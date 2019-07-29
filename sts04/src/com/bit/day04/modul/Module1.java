package com.bit.day04.modul;

public class Module1 implements Module{
	private String msg="hello world";
	
	public String getMsg() {		//위에 private 니깐 getter로 msg 받아 올 수 있게 하기
		return msg;

	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
