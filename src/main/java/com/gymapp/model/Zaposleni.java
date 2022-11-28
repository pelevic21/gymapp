package com.gymapp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;


@Entity
@Table(name = "zaposleni")

@Data


@JsonIgnoreProperties(ignoreUnknown = true)

public class Zaposleni implements Serializable{

	public Zaposleni() {
		
	}
	/**
	* 
	*/
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ime")
	private String ime;
	
	@Column(name = "prezime")
	private String prezime;
	
	@Column(name = "pozicija")
	private String pozicija;
	
	@Column(name = "staz")
	private Long staz;
	
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	@Column(name = "datum_rodjenja")
	private Date datumRodjenja;
	
	@Column(name = "primanja")
	private Double primanja;
}
