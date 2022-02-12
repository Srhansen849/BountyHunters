package com.example.service;

import org.springframework.stereotype.Service;

import com.example.dao.AccountDAO;
import com.example.model.Account;

@Service
public class AccountService {
	
	private AccountDAO aDao;
	
	public AccountService() {
		// TODO Auto-generated constructor stub
	}

	public AccountService(AccountDAO aDao) {
		super();
		this.aDao = aDao;
	}
	
	public Account findAccountById(int accountid) {
		return aDao.getById(accountid);
	}
	
	public void insertAccount(Account account) {
		aDao.save(account);
	}

}
