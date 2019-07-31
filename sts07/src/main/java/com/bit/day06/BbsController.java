package com.bit.day06;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.day06.model.entity.BbsVo;
import com.bit.day06.service.BbsService;

@Controller
public class BbsController {
	Logger log =LoggerFactory.getLogger(getClass());
	@Inject
	BbsService bbsService;
	
	@RequestMapping(value="/bbs", method=RequestMethod.GET)
	public String list(Model model) {
		//log.debug(bbsDao.selectAll());
		 bbsService.selectAll(model);

		return "bbs/list";
	}
	
	
	
	@RequestMapping(value="/bbs/add", method=RequestMethod.GET)
	public void add() {}
	
	@RequestMapping(value="/bbs", method=RequestMethod.POST)	//입력이니깐 Post 방식 
	public String insert(@ModelAttribute BbsVo bean) {
	    bbsService.add(bean);
		return "redirect:/bbs/";
	}
	
	@RequestMapping(value="/bbs/{idx}", method=RequestMethod.GET)
	public String detail(@PathVariable("idx") int num,Model model){	//디테일
		bbsService.selectOne(model, num);
		return "bbs/detail";
		}
	
	@RequestMapping(value="/bbs/{idx}", method=RequestMethod.PUT)		//수정
	public String update(@PathVariable("idx") int num
						,@ModelAttribute BbsVo bean){
		bbsService.update(bean);
		log.debug(bean.toString());	//수정되는지 출력해보기 
		return "redirect:/bbs/"+num;
		}
	
	@RequestMapping(value="/bbs/{idx}", method=RequestMethod.DELETE)		//삭제
	public String delete(@PathVariable("idx") int num){
		log.debug("삭제 : "+num);
		bbsService.delete(num);
		return "redirect:/bbs";
		}
}

