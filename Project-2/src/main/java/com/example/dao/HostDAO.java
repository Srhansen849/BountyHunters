package com.example.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Bounty;

import com.example.model.Host;

@Repository
public interface HostDAO extends JpaRepository<Host, Integer>{
	


	public Host getHostByRepresentative(String representative);
	public Host getHostByCodename(String code_name);
	public List<Bounty> getBountyList(int host_id);
	

	public Host findBusinessOwnerByUsername(String username);
	public Host findBusinessOwnerByEmail(String email);
	public Host findBusinessOwnerByCodename(String codename);
	public Host findBusinessOwnerByFirstname(String firstname);
	public Host findBusinessOwnerByLastname(String lastname);


}

