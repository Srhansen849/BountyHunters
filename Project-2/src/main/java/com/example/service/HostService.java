package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.HostDAO;
import com.example.model.Bounty;
import com.example.model.Host;

@Service
public class HostService {
	
	private HostDAO hDao;
	
	public HostService() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public HostService(HostDAO hDao) {
		super();
		this.hDao = hDao;
	}
	
	public Host newHost(String first_name, String last_name, String username, String password, String email, String association, String representative, String code_name) {
		
		return hDao.newHost(first_name, last_name, username, password, email, association, representative, code_name);
		
	}
	
	public Host editHost(int host_id, String first_name, String last_name, String username, String password, String email, String association, String representative, String code_name) {
		
		return hDao.editHost(host_id, first_name, last_name, username, password, email, association, representative, code_name);
		
	}
	
	public Host getHostByName(String first_name, String last_name) {
		return hDao.getHostByName(first_name, last_name);
	}
	
	public Host getHostByRepresentative(String representative) {
		
		return hDao.getHostByRepresentative(representative);
	}
	
	public Host getHostByCodename(String code_name) {
		
		return hDao.getHostByCodename(code_name);
	}
	
	public List<Bounty> getBountyList(int host_id){
		
		return hDao.getBountyList(host_id);
	}
	


}
