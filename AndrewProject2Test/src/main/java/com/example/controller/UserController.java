package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Account;
import com.example.model.Asset;
import com.example.model.Host;
import com.example.model.User;
import com.example.service.AssetService;
import com.example.service.UserService;

@RestController
@RequestMapping(value="/hunter")
@CrossOrigin(origins="*")
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
	
	
	
	//This will send a list of all users to the web
	@GetMapping("/all")
	public ResponseEntity<List<User>> findAllBountyHunters(){
		return ResponseEntity.status(200).body(this.uServ.findAllBountyHunters());
	}
	

	
	//This is the login function, it will first verify that the user is present in the database,
	//then it will verify that the password the user has entered in is correct
	@PostMapping("/login")
	public ResponseEntity<User> bountyHunterLogin(@RequestBody User user){
		Optional<User> userOpt = Optional.ofNullable(uServ.getUserByUsername(user.getUusername()));
		if(!userOpt.isPresent()) {
			return ResponseEntity.badRequest().build();
		}
		User nuser = uServ.verifyPassword(user.getUusername(), user.getUpassword());

		return ResponseEntity.status(201).body(nuser);
	}
	
	//This is used for updating the current users profile
	@PostMapping("/profile")
	public ResponseEntity<User> updateProfile(@RequestBody User user){
		Optional<User> email = Optional.ofNullable(uServ.getUserByEmail(user.getUemail()));
		Optional<User> username = Optional.ofNullable(uServ.getUserByUsername(user.getUusername()));
		if(email.isPresent() | email.isEmpty()) {
			return ResponseEntity.badRequest().build();
		}
		User upuser = uServ.getUserByHuntername(user.getHuntername());
		uServ.insertUser(upuser);
		return ResponseEntity.status(201).body(upuser);
	}
	
	//This will get the current data on the users profile
	@GetMapping("/profileinfo{profuser}")
	public ResponseEntity<User> getProfileInfo(@PathVariable("profuser") User user) {
		User profuser = uServ.getUserByUsername(user.getUusername());
		return ResponseEntity.status(201).body(profuser);
	}
	
	//This is for creating a new user 
	@PostMapping("/new")
	public ResponseEntity<User> createNewUser(@RequestBody User user, @RequestBody Asset asset){
		Optional<User> username = Optional.ofNullable(uServ.getUserByUsername(user.getUusername()));
		Optional<User> email = Optional.ofNullable(uServ.getUserByEmail(user.getUemail()));
		Optional<User> codename = Optional.ofNullable(uServ.getUserByHuntername(user.getHuntername()));
		if(username.isPresent() | email.isPresent() | codename.isPresent() | email.isEmpty() | username.isEmpty()) {

			return ResponseEntity.badRequest().build();
		}
		
		Account newacc = new Account();
		Asset newasst = new Asset();
		
		newasst.setAscurrency(asset.getAscurrency());
		newasst.setBalance(0);
		newasst.setAccountfk(newacc);
		
		
		uServ.insertUser(user, newacc, newasst);
		return ResponseEntity.status(201).body(user);
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
		Asset assest1 = new Asset("Republic credit", 63.5, account1);
		Asset assest2 = new Asset("Emperial Credits", 63.5, account2);
		Asset assest3 = new Asset("Druggats", 63.5, account3);
		Asset assest4 = new Asset("Republic credit", 63.5, account4);
		

		//This is creating a list of a single asset
		List<Asset> asList1 = new ArrayList<Asset>();
		asList1.add(assest1);
		
		List<Asset> asList2 = new ArrayList<Asset>();
		asList2.add(assest2);
		
		List<Asset> asList3 = new ArrayList<Asset>();
		asList3.add(assest3);
		
		List<Asset> asList4 = new ArrayList<Asset>();
		asList4.add(assest4);
		
//		//This is storing the assets into their accounts
//		account1.setAssetlist(asList1);
		account2.setAssetlist(asList2);
		account3.setAssetlist(asList3);
		account4.setAssetlist(asList4);
//		
//		//This is creating the 4 users
//		public User(String huntername, String uusername, String upassword, String uemail) {
		User user1 = new User("Boba Fett", "AlphaFett1", "M4nd410ri4n",
				"BobaFett1@StarHunter.com", account1, 1);
//		
		User user2 = new User("Cad Bane", "DuroBane1", "T4t00in3",
				"CadBane1@StarHunter.com", account2, 2);
		
		User user3 = new User("Jango Fett", "Mandalorians1", "D4wnM4nd4l",
				"JangFett2@StarHunter.com", account3, 3);
		
		User user4 = new User("Fennec Shand", "Boba1Fan", "F3ttg0tr4",
				"FennShan1@StarHunter.com", account4, 4);
		
		User user5 = new User("Din Djarin", "DinDjarin1", "M4nd410ri4n",
				"DinDjarin1@StarHunter.com", account1, 5);
//		
		User user6 = new User("Embo", "Embo1", "T4t00in3",
				"Embo1@StarHunter.com", account2, 6);
		
		User user7 = new User("Asajj Ventress", "AsajjVentress1", "D4wnM4nd4l",
				"AsajjVentress2@StarHunter.com", account3, 7);
		
		User user8 = new User("Bossk", "Bossk1", "F3ttg0tr4",
				"Bossk1@StarHunter.com", account4, 8);
		
		User user9 = new User("IG-11", "IG-11", "M4nd410ri4n",
				"IG-11@StarHunter.com", account1, 9);
//		
		User user10 = new User("Aurra Sing", "AurraSing1", "T4t00in3",
				"AurraSing1@StarHunter.com", account2, 10);
		
//		
//		//These are storing the data onto the database

		uServ.insertUser(user1, account1, assest1);
		uServ.insertUser(user2, account2, assest2);
		uServ.insertUser(user3, account3, assest3);
		uServ.insertUser(user4, account4, assest4);
		uServ.insertUser(user5, account1, assest1);
		uServ.insertUser(user6, account2, assest2);
		uServ.insertUser(user7, account3, assest3);
		uServ.insertUser(user8, account4, assest4);
		uServ.insertUser(user9, account1, assest1);
		uServ.insertUser(user10, account2, assest2);

		
		return ResponseEntity.status(201).body("Successfully Inserted");
	}
	
}


