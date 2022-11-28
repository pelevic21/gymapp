package com.gymapp.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gymapp.common.EntityNotFoundException;
import com.gymapp.model.Teretana;
import com.gymapp.repository.TeretanaRepository;

@Service
public class TeretanaService {
	
	private TeretanaRepository teretanaRepository;
	
	// Dependency injection ostvarujemo kroz konstruktor. Injectujemo repository u servis 
	@Autowired
	public TeretanaService(TeretanaRepository teretanaRepository) {
		this.teretanaRepository = teretanaRepository;
	}
	
	public List<Teretana> getAll(){
		return this.teretanaRepository.findAll();
	}
}
