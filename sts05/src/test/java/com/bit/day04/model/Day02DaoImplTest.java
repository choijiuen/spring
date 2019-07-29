package com.bit.day04.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bit.day04.model.entity.Day02Vo;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)	//이름순으로 테스트 진행
public class Day02DaoImplTest {

	static Day02Dao day02Dao;
	   private Logger log=Logger.getLogger(this.getClass());
	   private Day02Vo target;
	   
	   @BeforeClass
	   public static void setUpBeforeClass() throws Exception {
	      ApplicationContext ctxt=null;
	      ctxt=new GenericXmlApplicationContext("classpath:/applicationContext.xml");
	      day02Dao=(Day02Dao) ctxt.getBean("day02Dao");
	   }

	   @Before
	   public void setUp() throws Exception {
		   
		   	target= new Day02Vo(1,"test","sub1","내용1",null);
	   }

	   @Test
	   public void test1SelectAll() {
	      assertNotNull("널 나옴",day02Dao.selectAll());
	      log.debug(day02Dao.selectAll().toString());
	   }

	   @Test
	   public void test2SelectOne() {
//	      Day02Vo target = new Day02Vo(1,"테스터","제목1","내용1",null);
	      assertEquals(target, day02Dao.selectOne(target.getNum()));
	   }

	   @Test
	   public void test3InsertOne() {
	      int before=day02Dao.selectAll().size();
	      day02Dao.insertOne(target);
	      int after=day02Dao.selectAll().size();
	      assertSame(after, before+1);
	   }
	   

	   @Test
	   public void test4UpdateOne() {
	      target.setName("test");
	      day02Dao.updateOne(target);
	      assertEquals(target, day02Dao.selectOne(target.getNum()));
	      target.setName("테스터");
	      day02Dao.updateOne(target);
	   }

	   @Test
	   public void test5DeleteOne() {
	      int before=day02Dao.selectAll().size();
	      day02Dao.deleteOne(day02Dao.selectAll().size());
	      int after=day02Dao.selectAll().size();
	      assertSame(after, before-1);
	   }


}
