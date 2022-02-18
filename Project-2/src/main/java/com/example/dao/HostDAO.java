package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Host;

@Repository
public interface HostDAO extends JpaRepository<Host, Integer>{
	


	public Host getHostByRepresentative(String representative);
	public Host getHostByCodename(String code_name);

//	public List<Bounty> getBountyList(int host_id);

	//public List<Bounty> getBountyList(int host_id);

	

	public Host getHostByUsername(String username);
	public Host getHostByEmail(String email);
	public Host getHostByFirstname(String firstname);
	public Host getHostByLastname(String lastname);


}

