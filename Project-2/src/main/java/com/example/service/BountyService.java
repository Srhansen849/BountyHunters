package com.example.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


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
	public BountyService(BountyDAO bDao, CriminalDAO cDao, StatusDAO sDao) {
		super();
		this.bDao = bDao;
		this.cDao = cDao;
		this.sDao = sDao;
	}
	
	
	public Criminal getCriminalByFirstname(String first_name) {
		return cDao.getCriminalByFirstname(first_name);
	}
	
	public Criminal getCriminalByLastname(String last_name) {
		return cDao.getCriminalByLastname(last_name);
	}
	
	public Criminal getCriminalByCodename(String code_name) {
		return cDao.getCriminalByCodename(code_name);
	}
	
	public Bounty getBountyByCriminalId(Criminal criminal) {
		Criminal crim = cDao.getById(criminal.getCriminalid());
		return bDao.getBountyByCriminalid(crim);
		
	}
	
//	public List<Criminal> getCriminalListByName(String first_name, String last_name){
//		return cDao.getCriminalByName(first_name, last_name);
//	}
	
	public List<Criminal> getCriminalListByFirstname(String first_name){
		return cDao.getCriminalListByFirstname(first_name);
	}
	
	public Bounty getBountyById(Bounty bounty) {
		return bDao.getById(bounty.getBountyid());
	}
	
//	public Criminal verifyFirstnameAndLastname(Criminal criminal) {
//		
//		String first = criminal.getFirstname();
//		String last = criminal.getLastname();
//		
//		List<Criminal> firstNames = cDao.getCriminalListByFirstname(first);
//		
//		Criminal x = getCriminalByFirstname(first);
//		Integer a = x.getCriminalid();
//		
//		Criminal y = getCriminalByLastname(last);
//		Integer b = y.getCriminalid();
//		
////		for(String firstname: cDao.getFirstnameList(first)) {
////			Criminal f = cDao.getCriminalByFirstname(firstname);
////			int fi = f.getCriminalid();
////			if(b==fi) {
////				return f;
////			}
////		}
//		
//		if(a.equals(b)) {
//			return criminal;
//		}
//		
//		
//		
//		return null;
//	}
	
	public List<Criminal> getCriminalListByLastName(String last_name){
		return cDao.getCriminalListByLastname(last_name);
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
	
	public List<Bounty> listAllBounty(){
		return bDao.findAll();
	}
	
	public List<Bounty> getAllActiveBounty(){
		List <Bounty> bList = bDao.findAll();
		List <Bounty> actList = new ArrayList<Bounty>();
		for(Bounty temp: bList) {
			Status activity = temp.getActiveid();
			if(activity.getStatusid()==1) {
				actList.add(temp);
			}
		}
		return actList;
	}
	
	
	public List<Bounty> getBountyByBhHolder(User bhHolder){
		return bDao.getBountyByBhHolder(bhHolder);
	}
	
	public List<Bounty> getBountyByHostHolder(Host hostHolder){
		return bDao.getBountyByHostHolder(hostHolder);
	}
	
	public List<Bounty> orderBountyByAmount(){
		List <Bounty> bList = bDao.findAll();
		Collections.sort(bList, new Comparator<Bounty>() {
            public int compare(Bounty o1, Bounty o2) {
                return o1.getAmount() > o2.getAmount() ? -1 : o1.getAmount() == o2.getAmount() ? 0 : 1;
            }
        });
		
		return bList;
	}


}
