package com.gupt.controller;

import org.springframework.stereotype.Controller;

/**
 * 用户功能入口
 * @author ABCD
 *
 */
@Controller
public class UserController {
	
	public String getUser() {
		return "user";
	}

}
