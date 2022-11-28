package com.gymapp.repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gymapp.common.CustomRepository;
import com.gymapp.model.Teretana;


@Repository
public interface TeretanaRepository extends CustomRepository<Teretana, Long>	 {

	//Teretana findOneByName(String naziv);

	Optional<Teretana> findById(Long id);
	
	Teretana save(Teretana teretana);

	List<Teretana> findAll();
	
	//@Query(value= "select * from teretana order by mesto desc", nativeQuery = true)
	//List<Teretana> findByPlace(String mesto);
}

