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
@Table(name = "trening_program")

@Data


@JsonIgnoreProperties(ignoreUnknown = true)

public class TreningProgram implements Serializable{

	public TreningProgram() {
		
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
	
	@Column(name = "tip")
	private String tip;
	
	@Column(name = "trajanje")
	private Integer trajanje;
	
	@Column(name = "cena")
	private Long cena;
	
	@Column(name = "trener")
	private String trener;
}
