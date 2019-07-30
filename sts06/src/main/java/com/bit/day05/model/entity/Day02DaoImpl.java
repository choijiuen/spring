package com.bit.day05.model.entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component(value="day02Dao")//객체 생성위해서 이거 쓰는거다 근데 이거는 순서 모름
@Repository(value="day02Dao")	//Component 상속 받는다, 객체생성 Controller보다 빨리 만듬
public class Day02DaoImpl implements Day02Dao{
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
//	public void setJdbctemplate(JdbcTemplate jdbctemplate) { //@Autowired 때메 이거 없어도된다 
//		this.jdbctemplate = jdbctemplate;
//	}
	
	@Override
	public List<Day02Vo> selectAll() {
		String sql="select * from day02";
		return jdbctemplate.query(sql,new RowMapper<Day02Vo>() {

			@Override
			public Day02Vo mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Day02Vo(
						rs.getInt("num"),rs.getString("name")
						,rs.getString("sub"),rs.getString("content")
						,rs.getDate("nalja")
						);
			}});
	}

	@Override
	public Day02Vo selectOne(int num) {
		String sql ="select * from day02 where num=?";
		return null;
	}

	@Override
	public void insertOne(Day02Vo bean) {
		String sql="insert into day02 (name , sub, content,nalja) values (?,?,?,now())";
		
	}

	@Override
	public int updateOne(Day02Vo bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOne(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

}
