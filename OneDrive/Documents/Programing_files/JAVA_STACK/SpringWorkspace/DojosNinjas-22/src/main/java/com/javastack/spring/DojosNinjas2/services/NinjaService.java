package com.javastack.spring.DojosNinjas2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javastack.spring.DojosNinjas2.Repository.NinjaRepository;
import com.javastack.spring.DojosNinjas2.models.Ninja;

@Service
public class NinjaService {
	

		private final NinjaRepository ninjaRepository;
		
		public NinjaService(NinjaRepository ninjaRepository) {
			this.ninjaRepository = ninjaRepository;
			
		}
		
		public List<Ninja> allNinjas() {
			return ninjaRepository.findAll();
			
		}
		
		public Ninja createNinja(Ninja ninja) {
			return ninjaRepository.save(ninja);
			
		}
		
		public Ninja findNinjaByID(Long id) {
			Optional <Ninja> optionalNinja = ninjaRepository.findById(id);
			if (optionalNinja.isPresent()) return optionalNinja.get();
			else return null;
		}
	}


