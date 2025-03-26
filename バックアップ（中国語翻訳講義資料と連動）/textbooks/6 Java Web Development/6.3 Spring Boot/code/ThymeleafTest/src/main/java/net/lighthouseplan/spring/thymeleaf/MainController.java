package net.lighthouseplan.spring.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@GetMapping("/login")
	public ModelAndView getLoginPage(ModelAndView mav) {
		mav.addObject("error", false);
		mav.setViewName("login.html");
		return mav;
	}
	
//	/**
//	 * 使用 Model 对象设置 Thymeleaf 参数。
//	 */
//	@PostMapping("/login")
//	public String login(@RequestParam String username,
//			@RequestParam String password, Model model) {
//		model.addAttribute("name", username);
//		return "hello.html";
//	}
	
	/**
	 * 使用 ModelAndView 对象设置 Thymeleaf 参数。
	 */
	@PostMapping("/login")
	public ModelAndView login(@RequestParam String username,
			@RequestParam String password, ModelAndView mav) {
		if (username.equals("admin") && password.equals("123456")) {
			mav.addObject("name", username);
			mav.setViewName("hello.html");
		} else {
			mav.addObject("error", true);
			mav.setViewName("login.html");
		}
		return mav;
	}
}
