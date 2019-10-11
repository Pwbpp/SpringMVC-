package org.peng.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

	@RequestMapping(value = "/hello")
	public ModelAndView hello() {
		System.out.println("hello 方法被调用");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","Hello biasd word!");
		mv.setViewName("/WEB-INF/jsp/welcome.jsp");
		return mv;
		
	}
	

}
