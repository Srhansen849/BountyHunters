package com.example.dao;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Account;
import com.example.model.Asset;



@Repository
public interface AssetDAO extends JpaRepository<Asset, Integer>{
	


	public Asset getAssetByAscurrency(String currency);
	public List<Asset> getAssetByAccountfk(Account account);

//	public List<Asset> findAllUsersAsset();

	//public Asset updateAsset(Asset asset, double amount);

//	public Asset findAssetByCurrency(String currency);
	//public List<Asset> findAllUsersAsset();

}
