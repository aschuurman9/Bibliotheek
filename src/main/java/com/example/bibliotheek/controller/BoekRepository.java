package com.example.bibliotheek.controller;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.bibliotheek.domain.Boek;

@Component
public interface BoekRepository extends CrudRepository<Boek, Long>{

	
	@Query("SELECT titel, aantalBladzijden FROM Boek ORDER BY aantalBladzijden")
	public Iterable<Boek> geefTitels(); 
		
	
	
	
}
