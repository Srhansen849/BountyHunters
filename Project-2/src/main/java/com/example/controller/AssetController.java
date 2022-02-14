package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Asset;
import com.example.service.AssetService;

@RestController
@RequestMapping(value="/asset")
public class AssetController {
	
	private AssetService asServ;

	
	public AssetController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public AssetController(AssetService asServ) {
		super();
		this.asServ = asServ;

	}

	public void EditAsset(Asset asset, double amount) {
		asServ.updateAsset(asset, amount);
	}
	
	

}
