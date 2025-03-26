package net.lighthouseplan.spring.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@GetMapping("/hello")
	public String getHelloPage() {
		return "hello.html";
	}
	
	@GetMapping("/login")
	public String getLoginPage() {
		return "login.html";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password) {
		if (username.equals("admin") && password.equals("123456")) {
			return "redirect:/hello";
		} else {
			return "redirect:/login";
		}
	}
}
