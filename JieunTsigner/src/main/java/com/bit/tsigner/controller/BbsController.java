package com.bit.tsigner.controller;

import java.sql.SQLException;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.tsigner.model.entity.BbsVo;
import com.bit.tsigner.service.BbsService;

@Controller
public class BbsController {
	
	@Inject
	BbsService bbsService; 
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value = "/community/bbs")
	public String bbs(Model model) throws SQLException{
		logger.debug("자유게시판");
		
		bbsService.getList(model);
		return "community/bbs";
	}
	
	@RequestMapping(value="/community/add", method=RequestMethod.POST)
	public String add(@ModelAttribute BbsVo bean) throws SQLException {
		bbsService.add(bean);
		return "redirect:/community/bbs";
	}
}
