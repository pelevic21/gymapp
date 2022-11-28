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
@Table(name = "suplementi")

@Data


@JsonIgnoreProperties(ignoreUnknown = true)

public class Suplementi implements Serializable{

	public Suplementi() {
		
	}
	/**
	* 
	*/
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "naziv")
	private String naziv;
	
	@Column(name = "cena")
	private Integer cena;
	
	@Column(name = "dobavljac")
	private String dobavljac;
	
	@Column(name = "adresa")
	private String adresa;
	
	@Column(name = "kontakt")
	private Long kontakt;
}