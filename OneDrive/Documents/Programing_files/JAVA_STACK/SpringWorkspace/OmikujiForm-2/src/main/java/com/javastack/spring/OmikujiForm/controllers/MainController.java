package com.javastack.spring.OmikujiForm.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
		
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
		}
	@PostMapping(value="/submit")
	public String submitForm(
		@RequestParam(value="number") int number,
	    @RequestParam(value="city") String city,
	    @RequestParam(value="person") String person,
	    @RequestParam(value="hobby") String hobby,
	    @RequestParam(value="living") String living,
	    @RequestParam(value="nice") String nice,
	    
		HttpSession session
		){
		session.setAttribute("number", number);
		session.setAttribute("city",city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("living", living);
		session.setAttribute("nice", nice);
		System.out.println(number);
		return "redirect:/dashboard"; // <-- we'll change this when we learn redirecting
	}
	
//	@PostMapping("/submit")
//	public String submitForm() {
//		System.out.println("I am here");
//		
//		return "redirect:/";
//	}
	
	@GetMapping("/dashboard")
	public String display (HttpSession session, Model model) {
		
		model.addAttribute("number", session.getAttribute("number"));
		model.addAttribute("city", session.getAttribute("city"));
		model.addAttribute("person", session.getAttribute("person"));
		model.addAttribute("hobby", session.getAttribute("hobby"));
		model.addAttribute("living", session.getAttribute("living"));
		model.addAttribute("nice", session.getAttribute("nice"));
			
		return "welcome.jsp";
	}
			
}
			
			
			
	
			
	
	

	    
	    	
	


