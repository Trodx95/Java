package com.javastack.spring.DojosNinjas2.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javastack.spring.DojosNinjas2.models.Dojo;

@Repository 
public interface DojoRepository  extends CrudRepository<Dojo , Long> {
		List<Dojo> findAll();

}
