package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Account;
import com.example.model.Asset;
import com.example.model.User;
import com.example.service.AssetService;
import com.example.service.UserService;

@RestController
@RequestMapping(value = "/bhunter")
@CrossOrigin(origins = "*") // CORS - cross origin resource sharing, it is a mechinism that can restrict
							// access for resource from external server
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

	@GetMapping(value = "/init")
	public ResponseEntity<String> insertInitalValues() {
		/**
		 * These are the initial values for the first 4 Bounty Hunters. The end goal is
		 * to have 4 users that have 1 account each and 1 asset per account
		 * 
		 */

		// This is creating the accounts to hold the assets
		Account account1 = new Account();
		Account account2 = new Account();
		Account account3 = new Account();
		Account account4 = new Account();

		// This is creating the assets and setting them to their account
		Asset assest1 = new Asset("Republic credit", 63.5, account1);
		Asset assest2 = new Asset("Emperial Credits", 63.5, account2);
		Asset assest3 = new Asset("Druggats", 63.5, account3);
		Asset assest4 = new Asset("Republic credit", 63.5, account4);

		// This is creating a list of a single asset
		List<Asset> asList1 = new ArrayList<Asset>();
		asList1.add(assest1);

		List<Asset> asList2 = new ArrayList<Asset>();
		asList2.add(assest2);

		List<Asset> asList3 = new ArrayList<Asset>();
		asList3.add(assest3);

		List<Asset> asList4 = new ArrayList<Asset>();
		asList4.add(assest4);

		// This is storing the assets into their accounts
		account1.setAsset(asList1);
		account2.setAsset(asList2);
		account3.setAsset(asList3);
		account4.setAsset(asList4);

		// This is creating the 4 users
		User user1 = new User("Boba", "Fett", "AlphaFett1", "M4nd410ri4n", "BobaFett1@StarHunter.com", "Alpha", 1,
				account1);

		User user2 = new User("Cad", "Bane", "DuroBane1", "T4t00in3", "CadBane1@StarHunter.com", "Duro", 3, account2);

		User user3 = new User("Jango", "Fett", "Mandalorians1", "D4wnM4nd4l", "JangFett2@StarHunter.com", "A0050", 4,
				account3);

		User user4 = new User("Fennec", "Shand", "Boba1Fan", "F3ttg0tr4", "FennShan1@StarHunter.com", "Overwatch", 2,
				account4);

		// These are storing the data onto the database
		uServ.insertUser(user1, account1, assest1);
		uServ.insertUser(user2, account2, assest2);
		uServ.insertUser(user3, account3, assest3);
		uServ.insertUser(user4, account4, assest4);

		return ResponseEntity.status(201).body("Successfully Inserted");
	}

	// This will send a list of all users to the web
	@GetMapping("/all")
	public ResponseEntity<List<User>> findAllBountyHunters() {
		return ResponseEntity.status(200).body(this.uServ.findAllBountyHunters());
	}

	// This will send a list of top 10 users to the web
	@GetMapping("/rank")
	public ResponseEntity<List<User>> findTopTen() {
		return ResponseEntity.status(200).body(this.uServ.findAllBountyHuntersRanked());
	}

	// This is the login function, it will first verify that the user is present in
	// the database,
	// then it will verify that the password the user has entered in is correct
	@PostMapping("/login")
	public ResponseEntity<User> bountyHunterLogin(@RequestBody User user) {
		Optional<User> userOpt = Optional.ofNullable(uServ.getUserByUsername(user.getUsername()));
		if (!userOpt.isPresent()) {
			return ResponseEntity.badRequest().build();
		}
<<<<<<< HEAD

		User nuser =  uServ.verifyPassword(user.getUsername(), user.getPassword());

=======
<<<<<<< HEAD
		User nuser =  uServ.verifyPassword(user.getUsername(), user.getPassword());
=======
		User nuser = uServ.verifyPassword(user.getUsername(), user.getPassword());
>>>>>>> stuff
>>>>>>> stuff
		return ResponseEntity.status(201).body(nuser);
	}

	// This is used for updating the current users profile
	@PostMapping("/profile")
	public ResponseEntity<User> updateProfile(@RequestBody User user) {
		Optional<User> email = Optional.ofNullable(uServ.getUserByEmail(user.getEmail()));
		Optional<User> codename = Optional.ofNullable(uServ.getUserByCodename(user.getCodename()));
		Optional<User> firstname = Optional.ofNullable(uServ.getUserByFirstname(user.getFirstname()));
		Optional<User> lastname = Optional.ofNullable(uServ.getUserByLastname(user.getLastname()));
		if (email.isPresent() | codename.isPresent() | firstname.isEmpty() | lastname.isEmpty() | email.isEmpty()) {
			return ResponseEntity.badRequest().build();
		}
		User upuser = uServ.getUserByUsername(user.getUsername());
		uServ.insertUser(upuser);
		return ResponseEntity.status(201).body(upuser);
	}

	// This will get the current data on the users profile
	@GetMapping("/profileinfo")
	public ResponseEntity<User> getProfileInfo(User user) {
		return ResponseEntity.status(201).body(uServ.getUserById(user));
	}

	// This is for creating a new user
	@PostMapping("/new")
	public ResponseEntity<User> createNewUser(@RequestBody User user, @RequestBody Asset asset) {
		Optional<User> username = Optional.ofNullable(uServ.getUserByUsername(user.getEmail()));
		Optional<User> email = Optional.ofNullable(uServ.getUserByEmail(user.getEmail()));
		Optional<User> codename = Optional.ofNullable(uServ.getUserByCodename(user.getCodename()));
		Optional<User> firstname = Optional.ofNullable(uServ.getUserByFirstname(user.getFirstname()));
		Optional<User> lastname = Optional.ofNullable(uServ.getUserByLastname(user.getLastname()));
<<<<<<< HEAD

		if (username.isPresent() | email.isPresent() | codename.isPresent() | firstname.isEmpty() | lastname.isEmpty()
				| email.isEmpty() | username.isEmpty()) {

=======
		if(username.isPresent() | email.isPresent() | codename.isPresent() | firstname.isEmpty()
				| lastname.isEmpty() | email.isEmpty() | username.isEmpty()) {
>>>>>>> stuff

			return ResponseEntity.badRequest().build();
		}

		Account newacc = new Account();
		Asset newasst = new Asset();

		newasst.setCurrency(asset.getCurrency());
		newasst.setBalance(0);
		newasst.setAssetHolder(newacc);
<<<<<<< HEAD

=======
		
>>>>>>> stuff
		List<User> uList = uServ.findAllBountyHunters();
		user.setRank(uList.size() + 1);

		uServ.insertUser(user, newacc, newasst);
		return ResponseEntity.status(201).body(user);
	}

}
