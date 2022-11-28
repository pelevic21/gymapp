package com.gymapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gymapp.common.CustomRepository;
import com.gymapp.model.SpisakClanova;
@Repository
public interface SpisakClanovaRepository extends CustomRepository<SpisakClanova, Long>{

	List<SpisakClanova> findAll();
}
