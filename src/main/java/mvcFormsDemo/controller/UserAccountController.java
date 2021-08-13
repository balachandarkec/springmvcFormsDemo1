package mvcFormsDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import mvcFormsDemo.model.UserAccount;

@Controller
public class UserAccountController {
	
	
	@ModelAttribute("newAccount")
	public UserAccount setUserAccount() {
		return new UserAccount();
	}
	
	
	@GetMapping("/resgiter")
	public String showRegistrationFotm() {
		return "registration";
	}
	
	@PostMapping("/saveAccount")
	public String saveUserAccount(@ModelAttribute("newAccount") UserAccount user,Model model ) {
		
		System.out.println("data Receive"+user.toString());
		
		model.addAttribute("msg", "User  resgistered Success fully!");
		model.addAttribute("resp", user);
		return"success";
	}

}
