package com.premium.stc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.premium.stc.model.Login;
import com.premium.stc.model.User;
import com.premium.stc.service.*;
@CrossOrigin(origins = "http://localhost:4201")
@RestController
public class UserController{
	@Autowired
	private UserService userService;

	@PostMapping("/registeruser")
	public void registerUser(@RequestBody User user) throws Exception
	{
		user.setUserType("USER");
		userService.registerUser(user);
	}
	

	public User updateUser(User user) throws Exception {
	
		return userService.updateUser(user);
	}
	@GetMapping("/userlist")
	public List<User> getUserList() {
		return userService.getUserList();
	}
	
}
