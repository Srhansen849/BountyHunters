package com.example.service;

import java.util.List;

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
	
	
	public List<Asset> findAllAssests(){
		return asDao.findAll();
	}
	
	public Asset findAssestByCurrency(String currency) {
		return asDao.findAssetByCurrency(currency);
	}

}
