package com.bit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MainController implements Controller{
	private String msg;
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
//		request.setAttribute("msg", "환영합니다");
		ModelAndView mav = new ModelAndView();	//모델과 뷰를 동시에 지닌 것, request 쓸 필요 없이, 그럼 리퀘스트는 언제 쓰냐? 세션을 통해 리퀘스트필요할때
		mav.addObject("msg", msg);
		mav.setViewName("main");
		return mav;
	}
	
}
