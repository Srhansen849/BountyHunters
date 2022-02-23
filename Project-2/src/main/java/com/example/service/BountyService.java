package com.example.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
	public BountyService(BountyDAO bDao, CriminalDAO cDao) {
		super();
		this.bDao = bDao;
		this.cDao = cDao;

	}

//	public Criminal getCriminalByFirstname(String first_name) {
//		return cDao.getCriminalByFirstname(first_name);
//	}
//	
//	public Criminal getCriminalByLastname(String last_name) {
//		return cDao.getCriminalByLastname(last_name);
//	}

//	public Criminal getCriminalByCodename(String code_name) {
//		return cDao.getCriminalByCodename(code_name);
//	}
//
//	
//	public Bounty getBountyByCriminalId(Criminal criminal) {
//		Criminal crim = cDao.getById(criminal.getCriminalid());
//		return bDao.getBountyByCriminalid(crim);
//		
//	}

	public Criminal getCriminalByCrimname(String crim_name) {
		return cDao.getCriminalByCrimname(crim_name);
	}

	public Bounty getBountyByCriminalfk(Criminal criminal) {
		Criminal crim = cDao.getCriminalByCrimname(criminal.getCrimname());
		return bDao.getBountyByCriminalfk(crim);

	}

//	public List<Criminal> getCriminalListByName(String first_name, String last_name){
//		return cDao.getCriminalByName(first_name, last_name);
//	}

//	public List<Criminal> getCriminalListByFirstname(String first_name){
//		return cDao.getCriminalListByFirstname(first_name);
//	}

	public Bounty getBountyById(int bountyid) {
		return bDao.getById(bountyid);
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

//	public List<Criminal> getCriminalListByLastName(String last_name){
//		return cDao.getCriminalListByLastname(last_name);
//	}
//	
//	public List<Criminal> getCriminalAll(){
//		return cDao.findAll();
//	}

	public void insertBounty(Bounty bounty, Criminal criminal) {
		bDao.save(bounty);
		cDao.save(criminal);
	}

//	public void insertBounty(Bounty bounty, Criminal criminal) {
//		bDao.save(bounty);
//		cDao.save(criminal);
//	}

	public void editBounty(Bounty bounty) {

		bDao.save(bounty);
	}

//	public List<Criminal> listAllCriminal(){
//		return cDao.findAll();
//	}

	public List<Bounty> listAllBounty() {
		return bDao.findAll();
	}

	public List<Bounty> getAllActiveBounty() {
		List<Bounty> bList = bDao.findAll();
		List<Bounty> actList = new ArrayList<Bounty>();
		for (Bounty temp : bList) {
			String activity = temp.getActiveid();
			if (activity.equals("Active")/* & bounty.userfk.equals(null)*/) {
				actList.add(temp);
			}
		}
		return actList;
	}

	public List<Bounty> getAllCompletedBounty() {
		List<Bounty> bList = bDao.findAll();
		List<Bounty> actList = new ArrayList<Bounty>();
		for (Bounty temp : bList) {
			String activity = temp.getActiveid();
			if (activity.equals("Completed")) {
				actList.add(temp);
			}
		}
		return actList;
	}
	
	public List<Bounty> getAllCaughtBounty() {
		List<Bounty> bList = bDao.findAll();
		List<Bounty> actList = new ArrayList<Bounty>();
		for (Bounty temp : bList) {
			String activity = temp.getActiveid();
			if (activity.equals("Caught")) {
				actList.add(temp);
			}
		}
		return actList;
	}

	public List<Bounty> getAllPrivateBounty() {
		List<Bounty> bList = bDao.findAll();
		List<Bounty> actList = new ArrayList<Bounty>();
		for (Bounty temp : bList) {
			String activity = temp.getActiveid();
			if (activity.equals("Active")) {
				actList.add(temp);
			}
		}
		return actList;
	}

	public List<Bounty> getHostBounties(Host host) {
		List<Bounty> bList = bDao.findAll();
		List<Bounty> hostList = new ArrayList<Bounty>();
		for (Bounty temp : bList) {
			if (host.equals(temp.getHostfk())) {
				hostList.add(temp);
			}
		}
		return hostList;
	}

	public List<Bounty> getUserBounties(User user) {
		List<Bounty> bList = bDao.findAll();
		List<Bounty> userList = new ArrayList<Bounty>();
		for (Bounty temp : bList) {
			if (user.equals(temp.getUserfk())) {
				userList.add(temp);
			}
		}
		return userList;
	}

	public List<Bounty> getBountyByUserfk(User userfk) {
		return bDao.getBountyByUserfk(userfk);
	}

	public List<Bounty> getBountyByHostfk(Host hostfk) {
		return bDao.getBountyByHostfk(hostfk);
	}

//	public List<Bounty> orderBountyByAmount(){
//		List <Bounty> bList = bDao.findAll();
//		Collections.sort(bList, new Comparator<Bounty>() {
//            public int compare(Bounty o1, Bounty o2) {
//                return o1.getAmount() > o2.getAmount() ? -1 : o1.getAmount() == o2.getAmount() ? 0 : 1;
//            }
//        });
//		
//		return bList;
//	}

}
