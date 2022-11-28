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
@Table(name = "spisak_clanova")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)

public class SpisakClanova implements Serializable{

	public SpisakClanova() {
		
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
	
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	@Column(name = "datum_rodjenja")
	private Date datumRodjenja;
	
	@Column(name = "mail")
	private String mail;
	
	@Column(name = "br_telefona")
	private Long brTelefona;
	
	@Column(name = "br_clanske_karte")
	private Integer brClanskeKarte;

	@Column(name = "placanje_clanarine")
	private Boolean placanjeClanarine;
}
