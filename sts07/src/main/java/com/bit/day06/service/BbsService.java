package com.bit.day06.service;

import org.springframework.ui.Model;

import com.bit.day06.model.entity.BbsVo;

public interface BbsService {	//화면 보여주는 기능
	void selectAll(Model model);
	void selectOne(Model model, int num);
	void add(BbsVo bean);
	void update(BbsVo bean);
	void delete(int num);
	
}
