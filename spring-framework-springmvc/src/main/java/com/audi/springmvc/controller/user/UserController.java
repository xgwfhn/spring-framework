package com.audi.springmvc.controller.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.audi.springmvc.model.User;
import com.audi.springmvc.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/findUsersByName")
	@ResponseBody
	public List<User> findUsersByName(HttpServletRequest request, Model model) {
		System.out.println("findUsersByName");
		try {
			return userService.findUsersByName("坎坎坷坷");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null; 
	}
}
