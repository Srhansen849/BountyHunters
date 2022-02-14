package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AssetDAO;
import com.example.model.Asset;

@Service
public class AssetService {
	
	private AssetDAO asDao;
	
	public AssetService() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public AssetService(AssetDAO asDao) {
		super();
		this.asDao = asDao;
	}
	
	public Asset newAsset(String currency, double amount) {
		
		return asDao.newAsset(currency, amount);
	}
	
	public Asset updateAsset(int asset_id, double amount) {
		
		return asDao.updateAsset(asset_id, amount);
	}
	
	
	public Asset getAssetByCurrency(String currency) {
		
		return asDao.getAssetByCurrency(currency);
	}

}
