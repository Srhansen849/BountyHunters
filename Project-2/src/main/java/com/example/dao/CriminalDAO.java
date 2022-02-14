package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Criminal;

@Repository
public interface CriminalDAO extends JpaRepository<Criminal, Integer>{
	
	public Criminal newCriminal(Criminal criminal);
	public Criminal getCriminalByName(String first_name, String last_name);
	public Criminal getCriminalByCodename(String codename);


}
