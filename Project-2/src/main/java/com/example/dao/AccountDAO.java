package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Account;
import com.example.model.Asset;

@Repository
public interface AccountDAO extends JpaRepository<Account, Integer>{
	
	//public Account getAccountById(int accountid);
	public List<Asset> findAllAsset(Account account);

}
