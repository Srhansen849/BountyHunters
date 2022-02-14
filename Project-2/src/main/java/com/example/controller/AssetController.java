package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.AccountService;
import com.example.service.AssetService;

@RestController
@RequestMapping(value="/asset")
public class AssetController {
	
	private AssetService asServ;
	private AccountService acServ;
	
	public AssetController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public AssetController(AssetService asServ, AccountService acServ) {
		super();
		this.asServ = asServ;
		this.acServ = acServ;
	}

	
	
	

}
