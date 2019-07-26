package com.bit.day03.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.bit.day03.model.Day02Dao;
import com.bit.day03.model.entity.Day02Vo;

public class UpdateController extends AbstractCommandController {	//Post 방식만 쓰기 위해서 이거 상속 받기 

	private Day02Dao dao;
	
	public void setDao(Day02Dao dao) {
		this.dao = dao;
	}

	@Override
		protected void onBindAndValidate(HttpServletRequest request, Object command, BindException errors)
				throws Exception {	
//			System.out.println("onBindAndValidate");	//수정하면 이게 실행된다. 
		
		Day02Vo bean =(Day02Vo) command;
			if(bean.getSub().trim().isEmpty()) {	//제목 없을 때 오류 내기..
				ObjectError error = new ObjectError("sub","제목없음");
				errors.addError(error);
			}
		
		}
	
	  @Override
	   protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
	         BindException errors) throws Exception {
	      ModelAndView mav = new ModelAndView();
	      Day02Vo bean= (Day02Vo) command;
	      mav.setViewName("redirect:detail.bit?idx="+bean.getNum());
	      if(errors.hasErrors()) {
	         System.out.println(errors.getErrorCount());
	         List<ObjectError> errs = errors.getAllErrors();
	         for(ObjectError err:errs) {
	            System.out.println(err.getDefaultMessage());
	            System.out.println(err.getObjectName());
	         }
	         System.out.println(errors.getFieldValue("sub"));
	         mav.addObject("bean", dao.selectOne(bean.getNum()));
	         mav.addObject("msg", false);
	         mav.setViewName("detail");
	         return mav;
	      }
	      
	      dao.updateOne(bean);
	      return mav;
	   }

}
