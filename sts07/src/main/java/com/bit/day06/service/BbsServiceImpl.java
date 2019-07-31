package com.bit.day06.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.bit.day06.model.BbsDao;
import com.bit.day06.model.entity.BbsVo;

@Service	//Component �� ������ ���� ������ �̰Ÿ� ����, // ������Ʈ������ dao�� ���� �����Ǿ��ϴµ� �̰� ���� �����ȵɼ��� �ֱ� ����
public class BbsServiceImpl implements BbsService{	//��Ʈ�ѷ����� ����ϴ� �ڵ���� ����� �Ӵ�. ��Ʈ�ѷ������� �̰� ȣ�� �ϱ⸸ �ϸ��

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
		bbsDao.updateOne(bean);	//���� �� ���� bean���� ����
		
	}

	@Override
	public void delete(int num) {
		bbsDao.deleteOne(num);
		
	}

}
