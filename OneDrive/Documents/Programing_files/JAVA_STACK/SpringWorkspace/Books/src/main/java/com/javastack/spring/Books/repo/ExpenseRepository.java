package com.javastack.spring.Books.repo;


 



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javastack.spring.Books.model.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long> {
	List<Expense> findAll();
	List<Expense> findByDescriptionContaining(String search);
}



