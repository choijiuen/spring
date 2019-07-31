package com.bit.day06.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.bit.day06.model.BbsDao;
import com.bit.day06.model.entity.BbsVo;

@Service	//Component 는 순서가 없기 때문에 이거를 쓴다, // 컴포넌트에서는 dao가 먼저 생성되야하는데 이게 먼저 생성안될수도 있기 때문
public class BbsServiceImpl implements BbsService{	//컨트롤러에서 사용하던 코드들이 여기로 왓다. 컨트롤러에서는 이거 호출 하기만 하면됨

	@Inject
	BbsDao bbsDao;
	
	@Override
	public void selectAll(Model model) {
		model.addAttribute("alist", bbsDao.selectAll());
		
	}

	@Override
	public void selectOne(Model model, int num) {
		bbsDao.updateCnt(num);
		model.addAttribute("bean", bbsDao.selectOne(num));
		
	}

	@Override
	public void add(BbsVo bean) {
		bbsDao.insertOne(bean);
		
	}

	@Override
	public void update(BbsVo bean) {
		bbsDao.updateOne(bean);	//수정 할 값을 bean으로 전달
		
	}

	@Override
	public void delete(int num) {
		bbsDao.deleteOne(num);
		
	}

}
