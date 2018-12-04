package com.example.bibliotheek.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.bibliotheek.domain.BibliotheekLid;

@Component
public interface BibliotheekLidRepository extends CrudRepository<BibliotheekLid, Long>{

}
