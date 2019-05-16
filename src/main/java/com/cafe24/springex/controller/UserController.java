package com.cafe24.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@ResponseBody
	@RequestMapping(value="/join", method=RequestMethod.GET)
	// @GetMapping("join") 완전 동일
	public String join() {
		return "UserController:join(GET)";  
	}
	
	@ResponseBody
	@RequestMapping(value= {"/join", "/j"}, method=RequestMethod.POST)
//	@PostMapping(value= {"/join", "/j"})
	public String join(String name, String email, String password, String gender) {
		return "UserController:join(POST)"; 
	}

}











