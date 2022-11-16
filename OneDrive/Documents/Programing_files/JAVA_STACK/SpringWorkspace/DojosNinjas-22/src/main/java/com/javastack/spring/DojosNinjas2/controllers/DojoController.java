package com.javastack.spring.DojosNinjas2.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.javastack.spring.DojosNinjas2.models.Dojo;
import com.javastack.spring.DojosNinjas2.services.DojoService;

@Controller
public class DojoController {
	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/")
	public String index() { 
		return "redirect:/dojos/new";
	}
	
	@GetMapping("/dojos/new")
	public String showNewDojosForm(@ModelAttribute("dojo") Dojo dojo) {
		return "newdojo.jsp";
	}
	
	
	@GetMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model ) {
		Dojo dojo = dojoService.findDojoByID(id);
		
		model.addAttribute("dojo", dojo);
		
		return "showdojo.jsp";
	}
	
	@PostMapping("/dojos")
	public String saveNewDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) return "newdojo.jsp";
		else {
			dojoService.createDojo(dojo);
			return "redirect:/ninjas/new";
		}
	}
	
	
}
