package com.bit.day05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")	//namespace ���� �Ѵ�. /test/ex04 �ؾߵ� ,����� �����
							//������ �޼��忡 ���������� �ּ� �ְ������ ����ٰ� �����
public class Ex04Controller {
	
	@RequestMapping(value= "/ex04", method=RequestMethod.GET)	//����� �ʼ��� ����ߵȴ�
	public String ex04() {
		return "ex04";
	}
	
	@RequestMapping(value= "/ex05" , method=RequestMethod.POST)		//�޼��� ����Ʈ�� get , value �� ��������
	public String ex05() {
		return "ex05";
	}
	
}
