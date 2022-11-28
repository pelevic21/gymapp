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

// Entity predstavlja dakle entitet Driver koji ce biti sacuvan u DB
// Ova klasa je model koji predstavlja tabelu driver
@Entity
@Table(name = "lokacije")
//lombok bilbiotkea koja pravi automatski getere , setere i procitaj na netu sta jos.
@Data

// lombok anotacija za konstruktor bez parametara
//ignorise dodatne json propertije u requestu

@JsonIgnoreProperties(ignoreUnknown = true)

public class Teretana implements Serializable{

	public Teretana() {}
	/**
	* 
	*/
	
	private static final long serialVersionUID = 1L;
	
	public static long getSerialversionid() {
		return serialVersionUID;
	}
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "naziv")
	private String naziv;
	
	@Column(name = "adresa")
	private String adresa;
	
	@Column(name = "mesto")
	private String mesto;
	
	@Column(name = "mail")
	private String mail;
	
	@Column(name = "telefon")
	private Integer telefon;
}
