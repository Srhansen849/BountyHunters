package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Asset;

@Repository
public interface AssetDAO extends JpaRepository<Asset, Integer>{
	
	public Asset newAsset(String currency, double amount);
	public Asset updateAsset(int asset_id, double amount);
	public Asset getAssetByCurrency(String currency);

}
