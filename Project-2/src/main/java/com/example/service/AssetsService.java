package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dao.AssetsDAO;
import com.example.model.Assets;

@Service
public class AssetsService {
	
	private AssetsDAO asDao;
	
	public AssetsService() {
		// TODO Auto-generated constructor stub
	}

	public AssetsService(AssetsDAO asDao) {
		super();
		this.asDao = asDao;
	}
	
	public void insertAssest(Assets asset) {
		asDao.save(asset);
	}
	
	public List<Assets> findAllAssests(){
		return asDao.findAll();
	}
	
	public Assets findAssestByCurrency(String currency) {
		return asDao.findAssestByCurrency(currency);
	}

}
