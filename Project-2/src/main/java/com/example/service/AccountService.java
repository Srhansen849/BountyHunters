package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AccountDAO;
import com.example.model.Account;
import com.example.model.Asset;

@Service
public class AccountService {
	
	AccountDAO acDao;
	
	public AccountService() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public AccountService(AccountDAO acDao) {
		super();
		this.acDao = acDao;
	}
	
	public Account newAccount(Account account) {
		
		return acDao.save(account);
	}
	
	public List<Asset> getAllAssets(Account account){
		
		return acDao.getAllAssets(account);
	}
	
	

}
