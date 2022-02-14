package com.example.service;

import java.util.List;
import java.util.Optional;

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
	
	
	public Criminal getCriminalByFirstName(String first_name) {
		return cDao.getCriminalByFirstName(first_name);
	}
	
	public Criminal getCriminalByLastName(String last_name) {
		return cDao.getCriminalByFirstName(last_name);
	}
	
	public Criminal getCriminalByCodeName(String code_name) {
		return cDao.getCriminalByFirstName(code_name);
	}
	
	public Bounty getBountyByCriminalId(Criminal criminal) {
		Criminal criminal_id = cDao.getById(criminal.getCriminalid());
		return bDao.getBountyByCriminalId(criminal_id.getCriminalid());
		
	}
	
	public List<Criminal> getCriminalListByName(String first_name, String last_name){
		return cDao.getCriminalByName(first_name, last_name);
	}
	
	 
	
	
//	public List<Criminal> getCriminalListByLastName(String last_name){
//		return cDao.getCriminalListByLastName(last_name);
//	}
	
	public void newBounty(Bounty bounty, Criminal criminal) {
		
		bDao.save(bounty);
		cDao.save(criminal);
	}
	
	public void editBounty(Bounty bounty) {
		
		bDao.save(bounty);
	}
	

	
	

}
