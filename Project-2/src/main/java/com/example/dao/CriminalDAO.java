package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Criminal;

@Repository
public interface CriminalDAO extends JpaRepository<Criminal, Integer>{
	
	public Criminal findCriminalByFirstname(String firstname);
	public Criminal findCriminalByLastname(String lastname);
	public Criminal findCriminalByCodename(String codename);
	
	

}
