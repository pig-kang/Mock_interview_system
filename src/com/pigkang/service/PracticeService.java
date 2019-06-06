package com.pigkang.service;

import java.util.List;

import com.pigkang.po.Practice;

public interface PracticeService {
	
	public Practice findPracticeById(Integer id);
	
	public List<Practice> findPracticeTen();
	
	public List<Practice> seekPractice(String text);
}
