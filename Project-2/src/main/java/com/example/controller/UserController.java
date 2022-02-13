package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Account;
import com.example.model.Asset;
import com.example.model.User;
import com.example.service.AssetService;
import com.example.service.UserService;

@RestController
@RequestMapping(value="/bhunter")
//@CrossOrigin(origins="*")//CORS - cross origin resource sharing, it is a mechinism that can restrict access for resource from external server
//requests(aka requests outside of the servers domain) if you set the origin to *, it will allow any domain to request the server
public class UserController {
	
	private UserService uServ;
	private AssetService asServ;
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public UserController(UserService uServ, AssetService asServ) {
		super();
		this.uServ = uServ;
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
		Asset assest1 = new Asset("Beskar", 63.5);
		Asset assest2 = new Asset("Emperial Credits", 63.5);
		Asset assest3 = new Asset("Peggat", 63.5);
		Asset assest4 = new Asset("Beskar", 63.5);
		
		//This is creating a list of a single asset
		List<Asset> asList1 = new ArrayList<Asset>();
		asList1.add(assest1);
		
		List<Asset> asList2 = new ArrayList<Asset>();
		asList2.add(assest2);
		
		List<Asset> asList3 = new ArrayList<Asset>();
		asList3.add(assest3);
		
		List<Asset> asList4 = new ArrayList<Asset>();
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
		uServ.insertUser(user1, account1, assest1);
		uServ.insertUser(user2, account2, assest2);
		uServ.insertUser(user3, account3, assest3);
		uServ.insertUser(user4, account4, assest4);
		
		return ResponseEntity.status(201).body("Successfully Inserted");
	}
	
	@GetMapping()
	public ResponseEntity<List<User>> findAllUsers(){
		return ResponseEntity.status(200).body(this.uServ.findAllBountyHunters());
	}
	
	
}

