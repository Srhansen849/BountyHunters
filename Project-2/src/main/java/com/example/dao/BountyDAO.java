package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Bounty;

@Repository
public interface BountyDAO extends JpaRepository<Bounty, Integer>{
	
	

}
