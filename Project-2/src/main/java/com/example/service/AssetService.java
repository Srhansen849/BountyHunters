package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AccountDAO;
import com.example.dao.AssetDAO;
import com.example.model.Account;

import com.example.model.Asset;
import com.example.model.Criminal;

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

		for (Asset asset : aslist) {
			if (asset.getAscurrency().equals(currency)) {
				return asset;
			}
		}
		return null;
	}

	public void updateAsset(Account account, double amount, String currency) {
		List<Asset> asList = asDao.getAssetByAssetid(account);
		Optional<String> ascurr = Optional.ofNullable(currency);
		for (Asset exchange : asList) {
			if (!ascurr.isPresent()) {
				exchange.setAscurrency(currency);
				exchange.setBalance(amount);
				asDao.save(exchange);
			} else if (exchange.getAscurrency().equals(currency)) {
				exchange.setBalance(exchange.getBalance() + amount);
				asDao.save(exchange);
			}
		}

	}

	public List<Asset> getAssetByAssetHolder(Account account) {
		return asDao.getAssetByAssetid(account);
	}

}
