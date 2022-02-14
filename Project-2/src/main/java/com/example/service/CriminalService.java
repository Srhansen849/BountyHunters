package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CriminalDAO;
import com.example.model.Criminal;

@Service
public class CriminalService {
	
	private CriminalDAO cDao;
	
	public CriminalService() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public CriminalService(CriminalDAO cDao) {
		super();
		this.cDao = cDao;
	}
	
	
	public void newCriminal(Criminal criminal) {
		
		
		cDao.save(criminal);
	}
	
	
	
}
