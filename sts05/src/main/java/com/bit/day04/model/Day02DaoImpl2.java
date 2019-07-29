package com.bit.day04.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.net.ssl.SSLEngineResult.Status;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.bit.day04.model.entity.Day02Vo;

public class Day02DaoImpl2 implements Day02Dao {

	JdbcTemplate jdbcTemplate;
	PlatformTransactionManager transactionManager;
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
	@Override
	   public List<Day02Vo> selectAll() {
	      String sql = "select * from day02 order by num desc";

	      PreparedStatementCreator psc = null;
	      RowMapper<Day02Vo> rowmapper = null;
	      psc = new PreparedStatementCreator() {
	         @Override
	         public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
	            PreparedStatement pstmt = conn.prepareStatement(sql);
	            return pstmt;
	         }
	      };
	      rowmapper = new RowMapper<Day02Vo>() {
	         @Override
	         public Day02Vo mapRow(ResultSet rs, int rowNum) throws SQLException {
	            // TODO Auto-generated method stub
	            return new Day02Vo(rs.getInt("num"), rs.getString("name"), rs.getString("sub"), rs.getString("content"),
	                  rs.getDate("nalja"));
	         }
	      };
	      return jdbcTemplate.query(psc, rowmapper);
	   }

	   @Override
	   public Day02Vo selectOne(int num) {
	      String sql = "select * from day02 where num=?";

	      PreparedStatementCreator psc = null;
	      RowMapper<Day02Vo> rowmapper = null;
	      psc = new PreparedStatementCreator() {
	         @Override
	         public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
	        	
	            PreparedStatement pstmt = conn.prepareStatement(sql);
	            pstmt.setInt(1, num);
	            return pstmt;
	         }
	      };
	      rowmapper = new RowMapper<Day02Vo>() {
	         @Override
	         public Day02Vo mapRow(ResultSet rs, int rowNum) throws SQLException {
	            // TODO Auto-generated method stub
	            return new Day02Vo(rs.getInt("num"), rs.getString("name"), rs.getString("sub"), rs.getString("content"),
	                  rs.getDate("nalja"));
	         }
	      };
	      return jdbcTemplate.query(psc, rowmapper).get(0);
	   }

	@Override
	public void insertOne(Day02Vo bean) {
		String sql ="insert into day02 (name, sub, content,nalja) values (?,?,?,now())";		//jdk 1.8에서는 final 생략 가능 하다.
		String sql2 ="insert into day02 (name, sub, content,nalja) values (?,?,?,now())";		
		
		TransactionDefinition def=new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		
	try {
		PreparedStatementCreator psc = null;
		psc=new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				System.out.println(conn);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, bean.getName());
				pstmt.setString(2, bean.getSub());
				pstmt.setString(3, bean.getContent());
				return pstmt;
			}
		};
		jdbcTemplate.update(psc);
		psc=new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				System.out.println(conn);
				PreparedStatement pstmt = conn.prepareStatement(sql2);
				pstmt.setString(1, bean.getName());
				pstmt.setString(2, bean.getSub());
				pstmt.setString(3, bean.getContent());
				return pstmt;
			}
		};
		jdbcTemplate.update(psc);
		transactionManager.commit(status);//문제가 생기기 전 커밋하고,
		
	}catch(Exception e){
		transactionManager.rollback(status);//문제가 생겼을 때 롤 백함.
	}
		//여기서 입력 하면 두 개 한 번에 입력 하지만 커넥션은 다르다. 
		

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
