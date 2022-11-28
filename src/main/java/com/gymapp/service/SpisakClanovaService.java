package com.gymapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gymapp.model.SpisakClanova;
import com.gymapp.repository.SpisakClanovaRepository;

@Service
public class SpisakClanovaService {

	private SpisakClanovaRepository spisakClanovaRepository;
	
	@Autowired
	public SpisakClanovaService(SpisakClanovaRepository spisakClanovaRepository) {
		this.spisakClanovaRepository = spisakClanovaRepository;
	}
	
	public List<SpisakClanova> getAll(){
		return this.spisakClanovaRepository.findAll();
	}
	
	public void addNewClan (SpisakClanova clan) {
		spisakClanovaRepository.save(clan);
		
	}
}
