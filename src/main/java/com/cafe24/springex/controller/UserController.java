package com.cafe24.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join() {
		return "/WEB-INF/views/user/join.jsp";  
	}
	
	@RequestMapping(value= {"/join", "/j"}, method=RequestMethod.POST)
	public String join(@ModelAttribute UserVo userVo) {
		System.out.println(userVo);
		
		if(valid(userVo)==false) {
			return "/WEB-INF/views/user/join.jsp"; 
		}
		
		return "redirect:/hello";
	}
	
	private boolean valid(UserVo userVo) {
		return true;
	}

}











