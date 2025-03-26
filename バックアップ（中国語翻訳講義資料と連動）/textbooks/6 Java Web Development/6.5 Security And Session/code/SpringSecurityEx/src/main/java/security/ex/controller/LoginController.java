package security.ex.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping("/login")
	public String getLoginPage() {
		return "login.html";
	}
	
	@GetMapping("/")
	public String getIndex() {
		return "redirect:/hello";
	}
	
	@GetMapping("/hello")
	public String getHelloPage(Model model) {
		UserDetails user = (UserDetails) SecurityContextHolder
				.getContext().getAuthentication().getPrincipal();

		model.addAttribute("name",user.getUsername());
		return "hello.html";
	}

}
