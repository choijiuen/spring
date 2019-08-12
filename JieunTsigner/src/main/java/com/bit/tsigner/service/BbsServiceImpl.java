package com.bit.tsigner.service;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.bit.tsigner.model.BbsDao;
import com.bit.tsigner.model.entity.BbsVo;

@Service
public class BbsServiceImpl implements BbsService {
	
	@Inject
	SqlSession sqlSession;
	
	@Override
	public void getList(Model model) throws SQLException {
		model.addAttribute("bbslist", sqlSession.getMapper(BbsDao.class).selectAll()); 

	}

	@Override
	public void add(BbsVo bean) throws SQLException {

		bean.setNum(bean.getNum());
		bean.setNalja(new Timestamp(System.currentTimeMillis()));
		sqlSession.getMapper(BbsDao.class).insertOne(bean);
		
	}

}
