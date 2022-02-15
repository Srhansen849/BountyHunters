package com.example.service;

import java.util.List;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BountyDAO;
import com.example.dao.CriminalDAO;
import com.example.dao.StatusDAO;
import com.example.model.Bounty;
import com.example.model.Criminal;
import com.example.model.Host;
import com.example.model.Status;
import com.example.model.User;


@Service
public class BountyService {
	
	private BountyDAO bDao;
	private CriminalDAO cDao;

	private StatusDAO sDao;

	
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
	
	public List<Criminal> getCriminalListByFirst(String first_name){
		return cDao.getCriminalListByFirstName(first_name);
	}
	
	public Bounty getBountyById(Bounty bounty) {
		return bDao.getById(bounty.getBountyid());
	}
	
	public Criminal verifyFirstAndLastName(Criminal criminal) {
		
		String first = criminal.getFirstname();
		String last = criminal.getLastname();
		
		List<Criminal> firstNames = cDao.getCriminalListByFirstName(first);
		
		Criminal x = getCriminalByFirstName(first);
		Integer a = x.getCriminalid();
		
		Criminal y = getCriminalByLastName(last);
		Integer b = y.getCriminalid();
		
		for(String firstname: cDao.getFirstNameList(first)) {
			Criminal f = cDao.getCriminalByFirstName(firstname);
			int fi = f.getCriminalid();
			if(b==fi) {
				return f;
			}
		}
		
		if(a.equals(b)) {
			return criminal;
		}
		
		
		
		return null;
	}
	
	 
	
	
//	public List<Criminal> getCriminalListByLastName(String last_name){
//		return cDao.getCriminalListByLastName(last_name);
//	}
	
	
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
	

	public void editBounty(Bounty bounty) {
		
		bDao.save(bounty);
	}
	

	
	public List<Criminal> listAllCriminal(){
		return cDao.findAll();
	}


}
