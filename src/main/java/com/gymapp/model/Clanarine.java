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
@Table(name = "clanarine")

@Data

@JsonIgnoreProperties(ignoreUnknown = true)

public class Clanarine implements Serializable{

	public Clanarine() {
		
	}
	/**
	* 
	*/
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "br_termina")
	private Integer brTermina;
	
	@Column(name = "visina_clanarine")
	private Integer visinaClanarine;
	
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	@Column(name = "datum_uplate")
	private Date datumUplate;
	
	@Column(name = "br_clanske_karte")
	private Integer brClanskeKarte;

}
