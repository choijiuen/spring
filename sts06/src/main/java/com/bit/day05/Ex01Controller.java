package com.bit.day05;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.Controller;

@org.springframework.stereotype.Controller
public class Ex01Controller implements Controller{

	Logger log =LoggerFactory.getLogger(getClass());
	
	@Override
	@RequestMapping("/ex01")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("ex01");
		mav.addObject("msg", "메시지 1");
		return mav;
	}
	
	@RequestMapping("/ex08")
	public String ex08(Model model) {
		model.addAttribute("msg", "메시지 2");
		return "ex01";
	}
	
	@RequestMapping(value= "/ex06.bit")	//이게 주소다 메서드명이 주소아니고, void일 때는 views안에있는 파일이랑 이거랑 비교해서 보여줌
	public void ex06page(HttpServletRequest req) {			//확장명 있으면 .bit 제외하고 찾음 , 근데 url에는 ex06.bit 다 써줘야함
		req.setAttribute("msg", "메시지 전달");
		log.debug("ex06 controller...");
	}
	
	@RequestMapping("/ex07")
	public View ex07() {
		return new View() {
			
			@Override	
			public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
					throws Exception {
				log.debug("ex07 render...");
				PrintWriter out=response.getWriter();
				out.print("test page");	//이거는 직접 view를 하는 거다 ex07 하면 이게 출력됨
			}
			
			@Override
			public String getContentType() {	//헤더부분에 time요청이 있을 때
				log.debug("ex07 ContenttType...");
				return null;
			}
		};
	}

}
