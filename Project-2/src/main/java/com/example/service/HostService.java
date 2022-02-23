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

	// Find by first name
	public Host getHostByHostname(String hostname) {
		return hDao.getHostByHostname(hostname);
	}


	// Find by username
	public Host getHostByUsername(String username) {
		return hDao.getHostByHusername(username);
	}

	// Find by email
	public Host getHostByEmail(String email) {
		return hDao.getHostByHemail(email);

	}

	// This verify password
	public Host verifyPassword(String husername, String hpassword) {
		Host host = hDao.getHostByHusername(husername);
		if(host.getHpassword().equals(hpassword)) {
			return host;
		}
		return null;
	}
}

