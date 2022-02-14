package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Bounty;
import com.example.model.Host;

@Repository
public interface HostDAO extends JpaRepository<Host, Integer>{
	
	public Host newHost(String first_name, String last_name, String username, String password, String email, String association, String representative, String code_name);
	public Host editHost(int host_id, String first_name, String last_name, String username, String password, String email, String association, String representative, String code_name);
	public Host getHostByName(String first_name, String last_name);
	public Host getHostByRepresentative(String representative);
	public Host getHostByCodename(String code_name);
	public List<Bounty> getBountyList(int host_id);
	

}
