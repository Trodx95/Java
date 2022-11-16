package com.javastack.spring.DojosNinjas2.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.javastack.spring.DojosNinjas2.models.Dojo;
import com.javastack.spring.DojosNinjas2.models.Ninja;
import com.javastack.spring.DojosNinjas2.services.DojoService;
import com.javastack.spring.DojosNinjas2.services.NinjaService;

@Controller
public class NinjaController {
		@Autowired
		NinjaService ninjaService;
		
		@Autowired
		DojoService dojoService;
		
		@GetMapping("/ninjas/new")
		public String showNewNinjaForm(@ModelAttribute("ninja") Ninja ninja, Model model ) {
			List<Dojo> dojos = dojoService.allDojos();
			model.addAttribute("dojos" ,  dojos);
			return "newninja.jsp";
			
		}
		
		@PostMapping("/ninjas")
		public String saveNewNinja(@Valid @ModelAttribute ("ninja") Ninja ninja , BindingResult result ) {
			if (result.hasErrors()) return "newninja.jsp";
			else {
				ninjaService.createNinja(ninja);
				return "redirect:/dojos/" + ninja.getDojo().getId();
				
			}
		}
		
}
