package com.example.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Host;



@Repository
public interface HostDAO extends JpaRepository<Host, Integer>{
	


	public Host getHostByRepresentative(String representative);
//	public List<Bounty> getBountyList(int host_id);
	

	public Host getHostByHusername(String husername);
	public Host getHostByHemail(String hemail);
	public Host getHostByHostname(String hostname);


}

