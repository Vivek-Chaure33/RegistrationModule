package com.BikkadIT.RegistrationModule.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.BikkadIT.RegistrationModule.Entites.User;
import com.BikkadIT.RegistrationModule.Service.UserServiceI;




@Controller
public class UserController {
	@Autowired
	UserServiceI serviceI;
	
	@GetMapping("/register")
	public String showForm() {
		
		return "Registration";
	}
	
	@RequestMapping(path="/processform", method= RequestMethod.POST)
	public String insertForm(@ModelAttribute User user,Model model)
	{
		User addCourse = serviceI.addCourse(user);
		model.addAttribute("email",addCourse.getEmail());
		model.addAttribute("uname",addCourse.getUsername());
		model.addAttribute("password",addCourse.getPassword());
		return "insert";
	}
	
	
	
	
	@RequestMapping("/search")
	public String searchUser(@RequestParam("username") String username,Model model) {
		User user = serviceI.getByUsername(username);
		model.addAttribute("user", user);
		return "search";
	}
	
	
}
