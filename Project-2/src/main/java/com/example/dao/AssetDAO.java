package com.example.dao;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Asset;

@Repository
public interface AssetDAO extends JpaRepository<Asset, Integer>{
	

<<<<<<< HEAD
	public Asset updateAsset(Asset asset, double amount);
	public Asset getAssetByCurrency(String currency);
	public List<Asset> findAllUsersAsset();
=======
	//public Asset updateAsset(Asset asset, double amount);


	public Asset findAssetByCurrency(String currency);
	//public List<Asset> findAllUsersAsset();
>>>>>>> 6f4b04aaea73daf95602b443e4ebbfc5d73858c8


}
