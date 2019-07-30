package com.bit.day05.bbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.day05.model.entity.Day02Dao;

@Controller
@RequestMapping("/bbs")
public class BbsController {
	@Autowired			//알아서 setter 만들어줌 
	Day02Dao day02Dao;
	
			//spring 2.5 부터 나온 것, 가장 유사한것을 찾아서 알아서 연결 해줌
//	public void setDay02Dao(Day02Dao day02Dao) {	//이 때는 setter에서 해줬는데 나중에는 setter없애고 필드에만 @Autowired 해줌
//		this.day02Dao = day02Dao;
//	}
	
	@RequestMapping("/list")
	public void list(Model model) {
		model.addAttribute("alist", day02Dao.selectAll());
	}
}
