package com.pigkang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pigkang.dao.PracticeDao;
import com.pigkang.po.Practice;
import com.pigkang.service.PracticeService;
@Service
@Transactional
public class PracticeServiceImpl implements PracticeService {
	//注解注入PracticeDao
	@Autowired
	private PracticeDao practiceDao;
	//根据id查询题目
	@Override
	public Practice findPracticeById(Integer id) {
		// TODO Auto-generated method stub
		return this.practiceDao.findPracticeById(id);
	}
	//查询数据库前十条数据
	@Override
	public List<Practice> findPracticeTen() {
		// TODO Auto-generated method stub
		return this.practiceDao.findPracticeTen();
	}
	//根据关键词搜索题目
	@Override
	public List<Practice> seekPractice(String text) {
		// TODO Auto-generated method stub
		return this.practiceDao.seekPractice(text);
	}

}
