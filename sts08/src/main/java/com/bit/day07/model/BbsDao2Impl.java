package com.bit.day07.model;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bit.day07.model.entity.BbsVo;

@Repository
public class BbsDao2Impl implements BbsDao {
	@Inject
	SqlSession sqlSession;

	@Override
	public List<BbsVo> selectAll() throws SQLException {
		return sqlSession.selectList("bbs.selectAll");
	}

	@Override
	public void InsertOne(BbsVo bean) throws SQLException {
		sqlSession.insert("bbs.insertOne",bean);
		
	}

	@Override
	public BbsVo selectOne(int num) throws SQLException {	//���⼭ selectOne �ϸ� �ѹ��� ����Ǵµ� ���Ӱ� ������� �迭 ����ؾ��Ѵ�, Map 
		return sqlSession.selectOne("bbs.selectOne", num);
	}

}
