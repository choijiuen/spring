package com.bit.tsigner.service;

import java.sql.SQLException;

import org.springframework.ui.Model;

import com.bit.tsigner.model.entity.BbsVo;

public interface BbsService {
	void getList(Model model) throws SQLException;
	void add(BbsVo bean) throws SQLException;
}
