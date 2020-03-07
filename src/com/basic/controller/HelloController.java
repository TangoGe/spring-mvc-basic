package com.basic.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 注解方式配置Controller
 * 
 * @author Tango
 *
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloController {
	@RequestMapping(value = "/index")
	public String handlerRequest(HttpServletRequest request, HttpServletResponse response, Model model)
			throws Exception {
		model.addAttribute("msg", "第一个spring mvc 程序");
		return "welcome";
	}
}
