package com.bit.day04.modul;

public class Module1 implements Module{
	private String msg="hello world";
	
	public String getMsg() {		//���� private �ϱ� getter�� msg �޾� �� �� �ְ� �ϱ�
		return msg;

	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
