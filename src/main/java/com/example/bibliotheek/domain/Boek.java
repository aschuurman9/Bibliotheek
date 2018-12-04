package com.example.bibliotheek.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Boek {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	private String titel;
	private int aantalBladzijden;
	private long ISBN;
	
	public long getId() {
		return id;
	}
	
	public String getTitel() {
		return titel;
	}
	
	public void setTitel(String titel) {
		this.titel = titel;
	}
	
	public int getAantalBladzijden() {
		return aantalBladzijden;
	}
	
	public void setAantalBladzijden(int aantalBladzijden) {
		this.aantalBladzijden = aantalBladzijden;
	}
	
	public long getISBN() {
		return ISBN;
	}
	
	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}
	
	

}
