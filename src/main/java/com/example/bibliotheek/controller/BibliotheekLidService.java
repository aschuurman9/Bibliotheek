package com.example.bibliotheek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bibliotheek.domain.BibliotheekLid;
import com.example.bibliotheek.domain.Boek;

@Service
@Transactional

public class BibliotheekLidService {

	@Autowired
	BibliotheekLidRepository bibliotheekLidRepository; 
	
	public Iterable<BibliotheekLid> vindAlleLeden(){
		return bibliotheekLidRepository.findAll();
	}
	
	public BibliotheekLid maakNieuwLid(BibliotheekLid lid) {
		return bibliotheekLidRepository.save(lid);
	}
}
