package com.pigkang.controller;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pigkang.po.Practice;
import com.pigkang.service.PracticeService;

import net.sf.json.JSONArray;

@Controller
public class PracticeController {
	@Autowired
	private PracticeService practiceService;

	/**
	 * 根据id查询练习内容
	 */
	@RequestMapping("/findPracticeById")
	public String findPracticeById(Integer id, Model model) {
		Practice practice = practiceService.findPracticeById(id);
		model.addAttribute("practice", practice);
		return "practice";
	}

	/**
	 * 查询前十条练习
	 */
	@RequestMapping("/findPracticeTen")
	public String findPracticeTen(Model model) {
		// ModelAndView mav = new ModelAndView();
		// List<Practice> pr= practiceService.findPracticeTen();
		// 放入转发参数
		// mav.addObject("pra_array", pra_array);
		HashSet<Practice> pra_set = new HashSet<Practice>();
		for (int i = 0; i < 10; i++) {
			// 调用Math.random()方法
			int num = (int) (Math.random() * (120 - 1)) + 1;
			Practice practice = practiceService.findPracticeById(num);
			pra_set.add(practice);// 将不同的数存入HashSet中
		}
		JSONArray pra_jsonarray = JSONArray.fromObject(pra_set);// java对象列表转化为json对象数组
		String pra_jsonstr = pra_jsonarray.toString();// json对象数组转化为json字符串
		model.addAttribute("pra_jsonstr", pra_jsonstr);
		return "findpracticeten";
	}
	
	/**
	 * 根据关键词搜索题目
	 */
	@RequestMapping("/seekPractice")
	public String seekPractice(String text,Model model){
		List<Practice> seekpra_list = practiceService.seekPractice(text);
		JSONArray seekpra_jsarray = JSONArray.fromObject(seekpra_list);
		String seekpra_jsstr = seekpra_jsarray.toString();
		model.addAttribute("seekpra_jsstr",seekpra_jsstr);
		return "seekpractice";
	}

}
