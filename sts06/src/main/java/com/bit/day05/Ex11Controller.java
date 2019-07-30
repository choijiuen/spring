package com.bit.day05;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex11Controller {
	Logger log = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("/ex11/{msg}/{su}")
	public String ex11(@PathVariable("msg") String msg, @PathVariable("su") int num) {	//이름 같으면 @PathVariable 이름은 생략 가능한데 @PathVariable이거는 생략 불가능
																						//생략 하면 default RequestParam 이다 
		log.debug(msg);
		log.debug(num+"");
		
		return "ex11";
	}
}
