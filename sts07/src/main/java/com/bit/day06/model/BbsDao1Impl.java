package com.bit.day06.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bit.day06.model.entity.BbsVo;

//@Repository
public class BbsDao1Impl implements BbsDao {

   @Inject
   JdbcTemplate jdbctemplate;
   private RowMapper<BbsVo> rowMap=new RowMapper<BbsVo>() {
      @Override
      public BbsVo mapRow(ResultSet rs, int rowNum) throws SQLException {
         BbsVo bean = new BbsVo();
         bean.setNum(rs.getInt("num"));
         bean.setName(rs.getString("name"));
         bean.setSub(rs.getString("sub"));
         bean.setContent(rs.getString("sub"));
         bean.setNalja(rs.getTimestamp("nalja"));
         bean.setCnt(rs.getInt("cnt"));
         return bean;
      }
   };
   
   @Override
   public List<BbsVo> selectAll() {
      String sql="select * from bbs";
      return jdbctemplate.query(sql, rowMap);
   }

   @Override
   public BbsVo selectOne(int num) {
      
      String sql="select * from bbs where num=?";
      
      return jdbctemplate.queryForObject(sql, rowMap, num);
   }

@Override
public void insertOne(BbsVo bean) {
	String sql="insert into bbs (name,sub,content,nalja) values (?,?,?,now())";
	jdbctemplate.update(sql,bean.getName(),bean.getSub(), bean.getContent());
	
}

@Override
public int updateCnt(int num) {
	String sql="update bbs set cnt=cnt+1 where num=?";
	return jdbctemplate.update(sql,num);
}

@Override
public int updateOne(BbsVo bean) {
	String sql ="update bbs set sub=?,content=? where num=? ";
	return jdbctemplate.update(sql,bean.getSub(), bean.getContent(), bean.getNum());
}

@Override
public int deleteOne(int num) {
	String sql ="delete from bbs where num=?";
	return jdbctemplate.update(sql,num);
	
}

   ///////////////////////////
}