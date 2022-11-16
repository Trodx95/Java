package com.javastack.spring.daikichipathvariables.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Honolulu")
public class homeController {
    @RequestMapping("")
    public String index(){
      return "Congratulations! you will soon travel to Honolulu";
    }
@RequestMapping("/lotto/6")
    public String lotto(){
      return "You will take a grand journey in the near future, but be wary of tempting offers";
    }
@RequestMapping("/lotto/37")
    public String world(){
      return "You have enjoyed the frusits of your labor but now is a great time to spend time with family and friends";
    }
@GetMapping("/lotto/8")
    public String lotto(@PathVariable("number") int number) {    
    	if (number % 2 == 0) {
    		return "You will take a grand journey in the near future, but be weary of tempting offers.";
    		
    	} else {
    		return "You have enjoyed the fruits of you labor but now is a great time to spend time with family and friends.";
    	}
    
    
    }
    }
