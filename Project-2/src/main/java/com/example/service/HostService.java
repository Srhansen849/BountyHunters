package com.example.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.HostDAO;


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
	public Host getHostByFirstname(String firstname) {
		return hDao.getHostByFirstname(firstname);
	}
	
	//Find by last name
	public Host getHostByLastname(String lastname) {
		return hDao.getHostByLastname(lastname);
	}
	
	//Find by code name
	public Host getHostByCodename(String codename) {
		return hDao.getHostByCodename(codename);
	}
	
	//Find by username
	public Host getHostByUsername(String username) {
		return hDao.getHostByFirstname(username);
	}
	
	//Find by email
	public Host getHostByEmail(String email) {
		return hDao.getHostByFirstname(email);
	}

	//This verify password
	public Host verifyPassword(String username, String password) {
		Host host = hDao.getHostByUsername(username);
		if(host.getPassword().equals(password)) {
			return host;
		}
		return null;
	}
	
	


}
