package com.example.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.dao.UserDAO;
import com.example.model.User;


@Service
public class UserService {
	
	private UserDAO uDao;
	
	public UserService() {
		// TODO Auto-generated constructor stub
	}

	public UserService(UserDAO uDao) {
		super();
		this.uDao = uDao;
	}
	
	public void insertUser(User user) {
		uDao.save(user);
	}
	
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
