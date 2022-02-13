package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BountyDAO;
import com.example.dao.CriminalDAO;
import com.example.dao.StatusDAO;
import com.example.model.Bounty;
import com.example.model.Criminal;
import com.example.model.Status;

@Service
public class BountyService {
	
	private BountyDAO bDao;
	private CriminalDAO cDao;
	private StatusDAO sDao;
	
	public BountyService() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public BountyService(BountyDAO bDao, CriminalDAO cDao, StatusDAO sDao) {
		super();
		this.bDao = bDao;
		this.cDao = cDao;
		this.sDao = sDao;
	}
	
	public void insertBounty(Bounty bounty, Criminal criminal, Status status) {
		bDao.save(bounty);
		cDao.save(criminal);
		sDao.save(status);
	}
	
	public void insertBounty(Bounty bounty, Criminal criminal) {
		bDao.save(bounty);
		cDao.save(criminal);
	}
	

}
