package com.example.bibliotheek.domain;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BibliotheekLid {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	
	private String naam;
	private LocalDate geboortedatum;
//	private Set<Boek> geleendeBoeken;
	
	public long getId() {
		return id;
	}
	
//	public void setId(long id) {
//		this.id = id;
//	}
	
	public String getNaam() {
		return naam;
	}
	
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public LocalDate getGeboortedatum() {
		return geboortedatum;
	}
	
	public void setGeboortedatum(LocalDate geboortedatum) {
		this.geboortedatum = geboortedatum;
	}
	
/*	public Set<Boek> getGeleendeBoeken() {
		return geleendeBoeken;
	}
	
	public void setGeleendeBoeken(Set<Boek> geleendeBoeken) {
		this.geleendeBoeken = geleendeBoeken;
	}
	
*/	

}
