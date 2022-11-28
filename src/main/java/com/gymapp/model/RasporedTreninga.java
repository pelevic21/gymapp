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
@Table(name = "raspored_treninga")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)

public class RasporedTreninga implements Serializable{

	public RasporedTreninga() {
		
	}
	/**
	* 
	*/
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "tip_treninga")
	private String tipTreninga;
	
	@Column(name = "broj_termina")
	private Integer brojTermina;
	
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	@Column(name = "dan")
	private Date dan;
	
	@Column(name = "trener")
	private String trener;
}
