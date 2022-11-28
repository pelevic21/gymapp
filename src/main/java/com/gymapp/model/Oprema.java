package com.gymapp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Table(name = "oprema")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)

public class Oprema implements Serializable{

	public Oprema() {
		
	}
	/**
	* 
	*/
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "proizvodjac")
	private String proizvodjac;
	
	@Column(name = "adresa")
	private String adresa;
	
	@Column(name = "mail")
	private String mail;
	
	@Column(name = "kontakt")
	private Integer kontakt;
	
	@Column(name = "cenovnik")
	private Double cenovnik;
	
	@Column(name = "garancija")
	private Integer garancija;
}
