package net.lighthouseplan.spring.jpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.lighthouseplan.spring.jpa.services.AccountService;

@Controller
public class LoginController {
	@Autowired
	private AccountService accountService;

	@GetMapping("/login")
	public ModelAndView getLoginPage(ModelAndView mav) {
		mav.addObject("error", false);
		mav.setViewName("login.html");
		return mav;
	}
	
	@PostMapping("/login")
	public ModelAndView login(@RequestParam String username,
			@RequestParam String password, ModelAndView mav) {
		if (accountService.validateAccount(username, password)) {
			mav.addObject("name", username);
			mav.setViewName("hello.html");
		} else {
			mav.addObject("error", true);
			mav.setViewName("login.html");
		}
		return mav;
	}
}
