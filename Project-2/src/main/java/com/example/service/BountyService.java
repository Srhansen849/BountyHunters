package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BountyDAO;
import com.example.dao.CriminalDAO;
import com.example.model.Bounty;
import com.example.model.Criminal;
import com.example.model.Host;
import com.example.model.User;

@Service
public class BountyService {
	
	private BountyDAO bDao;
	private CriminalDAO cDao;

	
	public BountyService() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public BountyService(BountyDAO bDao) {
		super();
		this.bDao = bDao;
	}
	
	public void newBounty(Bounty bounty, Criminal criminal) {
		
		bDao.save(bounty);
		cDao.save(criminal);
	}
	
	public void editBounty(Bounty bounty) {
		
		bDao.save(bounty);
	}
	

	
	

}
