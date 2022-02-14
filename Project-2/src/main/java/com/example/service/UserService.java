package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AccountDAO;
import com.example.dao.UserDAO;
import com.example.model.Account;
import com.example.model.Asset;
import com.example.model.User;

@Service
public class UserService {
	
	private UserDAO uDao;
	private AccountDAO aDao;
	
	public UserService() {
		// TODO Auto-generated constructor stub
	}


	@Autowired
	public UserService(UserDAO uDao) {
		super();
		this.uDao = uDao;
	}
	
	public User newUser(String username, String password, String first_name, String last_name, String email, String code_name) {
		
		Account account = new Account();
		return uDao.newUser(username, password, first_name, last_name, email, code_name, account);
	}
	
	public List<Asset> getAllAssets(User user){
		return aDao.getAllAssets(user.getAccount());
	}
	

}
