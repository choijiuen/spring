package com.bit.day04.modul;

public class Module3 {
	Module module;
	
	public Module3(Module module) {
			this.module=module;	//모듈의 주입 생성자를 통해서도 할 수 있음
	}
	
	public void setModule(Module module) {
		this.module = module;

	}
	
	public void func() {
//		Module module= new Module1();	//타입이 인터페이스면 어떤 객체를 넣는냐에 따라서 결과가 다르다 
		System.out.println(module.getMsg());
	}
}
