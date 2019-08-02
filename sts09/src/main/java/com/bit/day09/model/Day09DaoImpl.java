package com.bit.day09.model;

import org.springframework.stereotype.Component;

import com.bit.day09.model.entity.Day09Vo;

@Component(value="dao")	//여기서 밸류 로 객체 만든다 이걸 getBean으로 받아서 쓴다 
public class Day09DaoImpl implements Day09Dao {
	

	@Override
	public Day09Vo getBean() {
		return new Day09Vo();
	}

	@Override
	public void printBean(Day09Vo bean) {
		System.out.println(bean);
	}

	@Override
	public void func1() throws Exception {
		int su=1-1;
		if(su==0) {
		throw new Exception();
		}
	}

	@Override
	public void func2() {
		System.out.println("func2 run...");
	}

}
