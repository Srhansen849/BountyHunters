package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserDAO;
import com.example.model.Account;
import com.example.model.Assets;
import com.example.model.User;
import com.example.service.AccountService;
import com.example.service.AssetsService;
import com.example.service.UserService;

@RestController
@RequestMapping(value="/bhunter")
public class UserController {
	
	private UserService uServ;
	private AccountService aServ;
	private AssetsService asServ;
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public UserController(UserService uServ, AccountService aServ, AssetsService asServ) {
		super();
		this.uServ = uServ;
		this.aServ = aServ;
		this.asServ = asServ;
	}
	
	@GetMapping(value="/init")
	public ResponseEntity<String> insertInitalValues(){
		/**
		 * These are the initial values for the first 4 Bounty Hunters.
		 * The end goal is to have 4 users that have 1 account each and 1 asset per account
		 *  
		 */
		
		//This is creating the accounts to hold the assets
		Account account1 = new Account();
		Account account2 = new Account();
		Account account3 = new Account();
		Account account4 = new Account();
		
		//This is creating the assets and setting them to their account
		Assets assest1 = new Assets("Beskar", 63.5);
		Assets assest2 = new Assets("Emperial Credits", 63.5);
		Assets assest3 = new Assets("Peggat", 63.5);
		Assets assest4 = new Assets("Beskar", 63.5);
		
		//This is creating a list of a single asset
		List<Assets> asList1 = new ArrayList<Assets>();
		asList1.add(assest1);
		
		List<Assets> asList2 = new ArrayList<Assets>();
		asList2.add(assest2);
		
		List<Assets> asList3 = new ArrayList<Assets>();
		asList3.add(assest3);
		
		List<Assets> asList4 = new ArrayList<Assets>();
		asList4.add(assest4);
		
		//This is storing the assets into their accounts
		account1.setAssests(asList1);
		account2.setAssests(asList2);
		account3.setAssests(asList3);
		account4.setAssests(asList4);
		
		//This is creating the 4 users
		User user1 = new User("Boba", "Fett", "AlphaFett1", "M4nd410ri4n",
				"BobaFett1@StarHunter.com", "Alpha", 1, account1);
		
		User user2 = new User("Cad", "Bane", "DuroBane1", "T4t00in3",
				"CadBane1@StarHunter.com", "Duro", 3, account2);
		
		User user3 = new User("Jango", "Fett", "Mandalorians1", "D4wnM4nd4l",
				"JangFett2@StarHunter.com", "A0050", 4, account3);
		
		User user4 = new User("Fennec", "Shand", "Boba1Fan", "F3ttg0tr4",
				"FennShan1@StarHunter.com", "Overwatch", 2, account4);
		
		//These are storing the data onto the database
		asServ.insertAssest(assest1);
		asServ.insertAssest(assest2);
		asServ.insertAssest(assest3);
		asServ.insertAssest(assest4);
		
		aServ.insertAccount(account1);
		aServ.insertAccount(account2);
		aServ.insertAccount(account3);
		aServ.insertAccount(account4);
		
		uServ.insertUser(user1);
		uServ.insertUser(user2);
		uServ.insertUser(user3);
		uServ.insertUser(user4);
		
		return ResponseEntity.status(201).body("Successfully Inserted");
	}
	
	@GetMapping()
	public ResponseEntity<List<User>> findAllUsers(){
		return ResponseEntity.status(200).body(this.uServ.findAllBountyHunters());
	}
	
	
}

