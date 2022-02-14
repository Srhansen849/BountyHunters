package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.AccountService;
import com.example.service.BountyService;
import com.example.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	private UserService uServ;
	private AccountService acServ;
	private BountyService bServ;
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public UserController(UserService uServ, AccountService acServ, BountyService bServ) {
		super();
		this.uServ = uServ;
		this.acServ = acServ;
		this.bServ = bServ;
	}
	
	
	
	
	

}
