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
	
	//This is for storing new users, it will create a new accounts and a 
	//single asset from the currency that is entered in on the form
	public void insertUser(User user, Account account, Asset asset) {
		uDao.save(user);
		asDao.save(asset);
		aDao.save(account);
	}
	
	//This is for storing updates on a user
	public void insertUser(User user) {
		uDao.save(user);
	}
	
	
	public List<Asset> getAllAsset(User user){
		Account account = user.getAccount();
		Integer account_id = account.getAccountid();
		return aDao.getAllAssets(account_id);
	}
	
	//This will get a list of all users in the database
	public List<User> findAllBountyHunters(){
		return uDao.findAll();
	}
	
	//This will get a user by id 
	public User getUserById(User user) {
		return uDao.getById(user.getUserid());
	}
	
	//This will get a user by first name
	public User getUserByFirstname(String firstname) {
		return uDao.getUserByFirstname(firstname);
	}
	
	//This will get a user by last name
	public User getUserByLastname(String lastname) {
		return uDao.getUserByLastname(lastname);
	}
	
	//This will get a user by codename
	public User getUserByCodename(String codename) {
		return uDao.getUserByCodename(codename);
	}
	
	//This will get a user by username
	public User getUserByUsername(String username) {
		return uDao.getUserByUsername(username);
	}
	
	//This will get a user by email
	public User getUserByEmail(String email) {
		return uDao.getUserByEmail(email);
	}
	
	//This will verify that the users password is correct
	public User verifyPassword(String username, String password) {
		User user = uDao.getUserByUsername(username);
		if(user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}
	
	//This will get the top 10 bounty hunters
	public List<User> findAllBountyHuntersRanked(){
		List<User> ulist = uDao.findAll();
        
        Collections.sort(ulist, new Comparator<User>() {
            public int compare(User o1, User o2) {
                return o1.getRank() < o2.getRank() ? -1 : o1.getRank() == o2.getRank() ? 0 : 1;
            }
        });
		ulist.stream().limit(10);
		
		return ulist;
	}
}
