package com.bit.day04.modul;

public class Module3 {
	Module module;
	
	public Module3(Module module) {
			this.module=module;	//����� ���� �����ڸ� ���ؼ��� �� �� ����
	}
	
	public void setModule(Module module) {
		this.module = module;

	}
	
	public void func() {
//		Module module= new Module1();	//Ÿ���� �������̽��� � ��ü�� �ִ³Ŀ� ���� ����� �ٸ��� 
		System.out.println(module.getMsg());
	}
}
