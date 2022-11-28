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
@Table(name = "clanske_karte")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)

public class ClanskeKarte implements Serializable{

	public ClanskeKarte() {
		
	}
	/**
	* 
	*/
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "br_clanske_karte")
	private Integer brClanskeKarte;
	
	@Column(name = "tip_clanske_karte")
	private String tipClanskeKarte;
	
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	@Column(name = "datum_isteka")
	private Date datumIsteka;
	
	@Column(name = "promocije")
	private String promocije;
}
