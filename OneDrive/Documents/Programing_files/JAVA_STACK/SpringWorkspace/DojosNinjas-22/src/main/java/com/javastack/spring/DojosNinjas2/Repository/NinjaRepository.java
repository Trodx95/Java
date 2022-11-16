package com.javastack.spring.DojosNinjas2.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javastack.spring.DojosNinjas2.models.Ninja;

@Repository 
public interface NinjaRepository  extends CrudRepository<Ninja , Long> {
		List<Ninja> findAll();

}