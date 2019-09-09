package com.wuyafan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
  
	//进入页面
	@RequestMapping("toAdd.do")
	public String toAdd() {
		return "add";
	}
	
	//获取数据到控制台
	@RequestMapping("add.do")
	@ResponseBody
	public Object add(String str) {
		if(str.length()>0) {
			System.out.println(str);
		}
		return null;
		
	}
}
