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

}
