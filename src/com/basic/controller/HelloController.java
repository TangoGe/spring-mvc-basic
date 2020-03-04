package com.basic.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 非注解方式需要实现Controller接口
 * 
 * @author Tango
 *
 */
public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// ModelAndView对象
		ModelAndView modelAndView = new ModelAndView();
		// 向模型对象中添加一个msg字符串对象
		modelAndView.addObject("msg", "第一个最基本的spring mvc程序");
		// 设置返回的视图路径
		modelAndView.setViewName("/WEB-INF/jsp/welcome.jsp");
		return modelAndView;
	}

}
