package com.javastack.spring.Books.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javastack.spring.Books.Services.ExpenseService;
import com.javastack.spring.Books.model.Expense;



@Controller
	public class ExpenseController {
	
	
	
	@Autowired
	ExpenseService expenseService;
	

	
	@GetMapping("/")
	public String home() {
		return "redirect:/expenses";
	}
	//==========Display=============
	@GetMapping("/expenses")
	public String index(@ModelAttribute("expense") Expense expense, Model model) {
		
		List<Expense> expenses = expenseService.allExpenses();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
	}
	
	@GetMapping("/edit/{id}")
	
	public String show(@PathVariable("id") Long id, Model model) {	
		
		Expense expense = expenseService.findExpense(id);	
		
		model.addAttribute("expense", expense);
		
		return "edit.jsp";
	}
	
	
	

	@PostMapping("/expenses")
	public String index(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			
			List<Expense> expenses = expenseService.allExpenses();
			model.addAttribute("expenses", expenses);
			return "index.jsp";
		}else {
			expenseService.createExpense(expense);
			return "redirect:/expenses";
		}
	}

@PutMapping("/edit/{id}")

	public String update(
		@PathVariable("id") Long id, 
		Model model, 
		
		@Valid @ModelAttribute("expense") Expense expense, 
		BindingResult result) {
	
	if(result.hasErrors()) {
		return "redirect:/edit/{id}";
	}
	else {
		expenseService.updateExpense(expense);
		return "redirect:/expenses";
	}
}
@DeleteMapping("/delete/{id}")
public String destroy(@PathVariable("id") Long id) {
	 expenseService.deleteExpense(id);
    return "redirect:/expenses";
}
@RequestMapping("show/{id}")
public String view(@PathVariable("id") Long id, Model model) {
	model.addAttribute("expense", this.expenseService.findExpense(id) );
	return "show.jsp";
}
}
	
