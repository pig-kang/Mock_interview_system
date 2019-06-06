package com.pigkang.dao;

import java.util.List;

import com.pigkang.po.Practice;

/**
 * 
 * Practice接口文件
 *
 */
public interface PracticeDao {
	/**
	 * 根据id查询题目内容
	 */
	public Practice findPracticeById(Integer id);
	
	public List<Practice> findPracticeTen();
	
	public List<Practice> seekPractice(String text);
}
