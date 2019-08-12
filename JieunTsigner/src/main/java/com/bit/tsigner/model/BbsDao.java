package com.bit.tsigner.model;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.bit.tsigner.model.entity.BbsVo;

public interface BbsDao {
	List<BbsVo> selectAll() throws SQLException;
	List<BbsVo> selectAll(Map<String, Integer> map) throws SQLException;
	
	void insertOne(BbsVo bean) throws SQLException;
		
	}


