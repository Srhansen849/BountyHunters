package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Host;

@Repository
public interface HostDAO extends JpaRepository<Host, Integer>{
	
	public Host findBusinessOwnerByUsername(String username);
	public Host findBusinessOwnerByEmail(String email);
	public Host findBusinessOwnerByCodename(String codename);
	public Host findBusinessOwnerByFirstname(String firstname);
	public Host findBusinessOwnerByLastname(String lastname);

}

