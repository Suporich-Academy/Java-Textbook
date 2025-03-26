package net.lighthouseplan.spring.security.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@GetMapping("/login") 
	public String getLoginPage() {
		return "login.html";
	}

	@GetMapping("/register") 
	public String getRegisterPage() {
		return "register.html";
	}
	
	@GetMapping("/")
	public String index() {
		return "redirect:/hello";
	}
	
	@GetMapping("/hello")
	public ModelAndView getHelloPage(ModelAndView mav) {
		UserDetails user = (UserDetails) SecurityContextHolder
				.getContext().getAuthentication().getPrincipal();

		mav.addObject("name", user.getUsername());
		mav.setViewName("hello.html");
		return mav;
	}
}
