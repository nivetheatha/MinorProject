package com.example.springboot.RestController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.springboot.Model.User;
import com.example.springboot.Repo.UserRepo;
import com.example.springboot.Service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService uservice;

	
	@GetMapping("/")
	public ModelAndView home()
	{
		ModelAndView mav = new ModelAndView("Home.jsp");
		return mav;
		
	}
	
	@RequestMapping("/addUser")
	public String addUser(User user)
	{
		//ModelAndView mav = new ModelAndView("AddUser.jsp");
		uservice.saveOrUpdate(user);
		return "New user Added";
	
	}
	@RequestMapping("/changeUser")
	public String changeUser(@RequestParam int uid,String address)
	{
	    User user=uservice.getUserById(uid);
		user.setAddress(address);
		uservice.saveOrUpdate(user);
		return "Address Updated Sucessfully";
	}
	
	
	
	
	
}
