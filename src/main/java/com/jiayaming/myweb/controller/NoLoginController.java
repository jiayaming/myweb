package com.jiayaming.myweb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiayaming.myweb.model.Test01;
import com.jiayaming.myweb.service.Test01Service;

@Controller
@RequestMapping("noLoginController")
public class NoLoginController {
	
	@Autowired
	Test01Service test01Service;
	
	@RequestMapping(value="shishi",method=RequestMethod.GET)
	@ResponseBody
	public Test01 shishi(String aa) throws Exception {
		Integer id = Integer.valueOf(aa);
		Test01 test01=test01Service.selectById(id);
		return test01;
	}
  
}
