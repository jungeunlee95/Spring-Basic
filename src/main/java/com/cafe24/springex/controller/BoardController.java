package com.cafe24.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * @RequestMapping
 * Method 단독 매핑
 */

@Controller
public class BoardController {
	
	@ResponseBody 
	@RequestMapping("/board/update")
	public String update(@RequestParam("n") String name) { 
		System.out.println("---" + name + "---!");
		return "BoardController:update()";
	}

	@ResponseBody
	@RequestMapping("/board/write")
	public String write(@RequestParam(value="n", required=true, defaultValue="이름없음") String name,
			@RequestParam(value="age", required=true, defaultValue="0") int age) {
		System.out.println("---" + name + " : " + age + "---"); 
		return "BoardController:write()";
	}

	@ResponseBody  
	@RequestMapping("/board/view/{no}")
	public String view(@PathVariable(value="no") Long no) {
		System.out.println("@@@ " + no + " @@@");
		return "BoardController:view()";
	}

	

}
