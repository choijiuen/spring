package com.bit.day05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")	//namespace 역할 한다. /test/ex04 해야됨 ,여기는 없어도됨
							//여러개 메서드에 공통적으로 주소 주고싶으면 여기다가 쓰면됨
public class Ex04Controller {
	
	@RequestMapping(value= "/ex04", method=RequestMethod.GET)	//여기는 필수로 해줘야된다
	public String ex04() {
		return "ex04";
	}
	
	@RequestMapping(value= "/ex05" , method=RequestMethod.POST)		//메서드 디폴트는 get , value 는 생략가능
	public String ex05() {
		return "ex05";
	}
	
}
