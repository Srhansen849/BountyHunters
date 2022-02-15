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
	

	public void insertHost(Host host) {
		hDao.save(host);
	}
	
	//Find by first name
	public Host findBusinessOwnerByFirstname(String firstname) {
		return hDao.findBusinessOwnerByFirstname(firstname);
	}
	
	//Find by last name
	public Host findBusinessOwnerByLastname(String lastname) {
		return hDao.findBusinessOwnerByLastname(lastname);
	}
	
	//Find by code name
	public Host findBusinessOwnerByCodename(String codename) {
		return hDao.findBusinessOwnerByCodename(codename);
	}
	
	//Find by username
	public Host findBusinessOwnerByUsername(String username) {
		return hDao.findBusinessOwnerByFirstname(username);
	}
	
	//Find by email
	public Host findBusinessOwnerByEmail(String email) {
		return hDao.findBusinessOwnerByFirstname(email);
	}

	//This verify password
	public Host verifyPassword(String username, String password) {
		Host host = hDao.findBusinessOwnerByUsername(username);
		if(host.getPassword().equals(password)) {
			return host;
		}
		return null;
	}
	
	


}
