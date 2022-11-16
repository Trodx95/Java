package com.javastack.spring.DojosNinjas2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javastack.spring.DojosNinjas2.Repository.DojoRepository;
import com.javastack.spring.DojosNinjas2.models.Dojo;

@Service
public class DojoService {
	private final DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
		
	}
	
	public List<Dojo> allDojos() {
		return dojoRepository.findAll();
		
	}
	
	public Dojo createDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
		
	}
	
	public Dojo findDojoByID(Long id) {
		Optional <Dojo> optionalDojo = dojoRepository.findById(id);
		if (optionalDojo.isPresent()) return optionalDojo.get();
		else return null;
	}
}
