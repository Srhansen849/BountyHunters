package com.example.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AccountDAO;
import com.example.dao.AssetDAO;
import com.example.dao.UserDAO;
import com.example.model.Account;
import com.example.model.Asset;
import com.example.model.User;


@Service
public class UserService {
	
	private UserDAO uDao;
	private AccountDAO aDao;
	private AssetDAO asDao;
	
	public UserService() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public UserService(UserDAO uDao, AccountDAO aDao, AssetDAO asDao) {
		super();
		this.uDao = uDao;
		this.aDao = aDao;
		this.asDao = asDao;
	}
	
	//
	public void insertUser(User user, Account account, Asset asset) {
		uDao.save(user);
		asDao.save(asset);
		aDao.save(account);
	}
	
	
	/*
	 * User section
	 */
	public List<User> findAllBountyHunters(){
		return uDao.findAll();
	}
	
	public User findBountyHunterById(int userid) {
		return uDao.getById(userid);
	}
	
	public User findBountyHunterByFirstname(String firstname) {
		return uDao.findUserByFirstname(firstname);
	}
	
	public User findBountyHunterByLastname(String lastname) {
		return uDao.findBountyHunterByLastname(lastname);
	}
	
	public User findBountyHunterByCodeName(String codename) {
		return uDao.findBountyHunterByCodename(codename);
	}
	
	public List<User> findAllBountyHuntersRanked(){
		List<User> ulist = uDao.findAll();
        
        Collections.sort(ulist, new Comparator<User>() {
            public int compare(User o1, User o2) {
                return o1.getRank() < o2.getRank() ? -1 : o1.getRank() == o2.getRank() ? 0 : 1;
            }
        });
		
		
		return ulist;
	}

}
