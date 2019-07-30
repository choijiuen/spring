package com.bit.day05.bbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.day05.model.entity.Day02Dao;

@Controller
@RequestMapping("/bbs")
public class BbsController {
	@Autowired			//�˾Ƽ� setter ������� 
	Day02Dao day02Dao;
	
			//spring 2.5 ���� ���� ��, ���� �����Ѱ��� ã�Ƽ� �˾Ƽ� ���� ����
//	public void setDay02Dao(Day02Dao day02Dao) {	//�� ���� setter���� ����µ� ���߿��� setter���ְ� �ʵ忡�� @Autowired ����
//		this.day02Dao = day02Dao;
//	}
	
	@RequestMapping("/list")
	public void list(Model model) {
		model.addAttribute("alist", day02Dao.selectAll());
	}
}
