package com.javastack.spring.daikichipathvariables.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
	@RequestMapping("/")
	public String daikichi() {
		return "Welcome";
	}
	
	@RequestMapping("/honolulu")
	public String honolulu() {
		return "Congratulatiuons! You wil soon traverl to Honolulu!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	public String hello(
			@RequestParam(value="name", required=false) String name, 
			@RequestParam(value="last_name", required=false) String last_name,
			@RequestParam(value="times", required=false) Integer times) {
		if(times != null && times > 0) {
			String output = "";
			for(int i = 0; i < times; i++) {
				if(name != null && last_name != null) {
					output += "Hello " + name + " " + last_name + " ";
				}else if(name != null) {
					output += "Hello " + name + " ";
				}else if(last_name != null) {
					output += "Hello " + last_name + " ";
				}else {
					output += "Hello Human ";
				}
			}
			return output;
		}
		
		if(name != null && last_name != null) {
			return "Hello " + name + " " + last_name;
		}else if(name != null) {
			return "Hello " + name;
		}else if(last_name != null) {
			return "Hello " + last_name;
		}
		return "Hello Human";
	}

	
	
}

