package com.example.bibliotheek.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bibliotheek.domain.Boek;

@Service
@Transactional

public class BoekService {
	
	@Autowired
	BoekRepository boekRepository; 
	
	public Iterable<Boek> vindAlleBoeken(){
		return boekRepository.findAll();
	}
	
	public Boek maakNieuwBoek(Boek boek) {
		return boekRepository.save(boek);
	}
	
	public Optional<Boek> boekVindMetId(Long id){
		return boekRepository.findById(id);
	}
	
	public Iterable<Boek> vindAlleTitels(){
		return boekRepository.geefTitels();
	}

}
