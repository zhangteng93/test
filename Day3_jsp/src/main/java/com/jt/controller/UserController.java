package com.jt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jt.pojo.User;
import com.jt.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	/**
	 * spirngMVC用法
	 * 1.如果需要返回页面  
	 * 	  返回值类型:String
	 * 	  经过视图解析器拼接之后,找到具体页面路径
	 * 2.JSP页面中通过el表达式动态取值
	 * 	 el可以从域中取值. 
	 * 	 JSP中四大作用域: 
	 * 		page(当前页)/request(当前请求对象)
	 * 		Session域(当前会话)/application(真个tomcat服务器)
	 * 
	 * 3.页面EL表达式取值 items="${userList}"
	 */
	@RequestMapping("/findAll")
	public String findAll(Model model) {//域
		List <User>  userList=userService.findAll();
		model.addAttribute("userList",userList);
		//实现页面跳转
		return "userList";

	}
	/**
	 * 实现ajax页面跳转
	 * @return
	 */
	@RequestMapping("/ajax_findAll")
	public String ajax_findAll() {

		return "userList_ajax";
	}
	/**
	 * 接收用户ajax请求
	 * @return
	 */
	@RequestMapping("/ajax")
	@ResponseBody
	public List<User> ajax() {
		List<User> userList = userService.findAll();
		return userList;
	}

}
