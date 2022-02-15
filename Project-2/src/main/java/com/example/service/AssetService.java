package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.dao.AccountDAO;
import com.example.dao.AssetDAO;
import com.example.model.Account;

import com.example.model.Asset;

@Service
public class AssetService {
	
	private AssetDAO asDao;
	private AccountDAO acDao;

	
	public AssetService() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public AssetService(AssetDAO asDao, AccountDAO acDao) {
		super();
		this.asDao = asDao;
		this.acDao = acDao;
	}
	
//	public List<Asset> getAllAssets(int account_id){
//		return acDao.getAllAssets(account_id);
//	}
	
	public Asset getAssetUsingCurrency(List<Asset> aslist, String currency) {
				
		for(Asset asset: aslist) {
			if(asset.getCurrency().equals(currency)) {
				return asset;
			}
		}
		return null;
	}
		
//	public void updateAsset(Asset asset, double amount) {
//		
//		double balance = asset.getBalance();
//		balance += amount;
//		
//		asset.setBalance(balance);
//		
//		asDao.save(asset);
//		
//
//	}
	
	public Integer getAccountId(Account account) {
		return account.getAccountid();
		
	}
	
	


}
