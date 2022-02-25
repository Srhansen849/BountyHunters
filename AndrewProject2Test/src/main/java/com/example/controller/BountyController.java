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

import com.example.model.Bounty;
import com.example.model.Criminal;
import com.example.model.Host;
import com.example.model.User;
import com.example.service.AssetService;
import com.example.service.BountyService;
import com.example.service.HostService;
import com.example.service.UserService;

@RestController
@RequestMapping(value = "/bounty")
@CrossOrigin(origins = "*")
public class BountyController {

	private BountyService bServ;
	private HostService hServ;
	private UserService uServ;
	private AssetService asServ;

	public BountyController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public BountyController(BountyService bServ, HostService hServ, UserService uServ, AssetService asServ) {
		super();
		this.bServ = bServ;
		this.hServ = hServ;
		this.uServ = uServ;
		this.asServ = asServ;
	}

	// New Bounty
	@PostMapping("/new")
	public ResponseEntity<Bounty> createNewBounty(@RequestBody Bounty bounty) {
		Criminal criminal = bounty.getCriminalfk();
		Host host = bounty.getHostfk();
		Optional<Criminal> crimname = Optional.ofNullable(bServ.getCriminalByCrimname(criminal.getCrimname()));
		if (crimname.isEmpty()) {
			return ResponseEntity.badRequest().build();
		}
//		Bounty nBount = new Bounty(bounty.getAmount(), bounty.)

		bounty.setActiveid("Active");

		bServ.insertBounty(bounty, criminal);

		System.out.println(bounty);
		return ResponseEntity.status(201).body(bServ.getBountyByHostfk(host));
	}

	// Hunter Submits Bounty
	@PostMapping("/submit")
	public ResponseEntity<Bounty> SubmitBounty(@RequestBody Bounty bounty) {

		Criminal criminal = bounty.getCriminalfk();
		Optional<Criminal> crimname = Optional.ofNullable(bServ.getCriminalByCrimname(criminal.getCrimname()));
		if (crimname.isEmpty()) {
			return ResponseEntity.badRequest().build();
		}

		Bounty upbounty = bServ.getBountyByCriminalfk(criminal);

		Criminal crim = bServ.getCriminalByCrimname(criminal.getCrimname());

		bServ.insertBounty(upbounty, crim);

		return ResponseEntity.status(201).body(upbounty);
	}

	// Host Finishes Bounty
	@PostMapping("/finish/{amount}")
	public ResponseEntity<Bounty> FinishBounty(@RequestBody Bounty bounty, @PathVariable("amount") double amount) {

		Criminal criminal = bounty.getCriminalfk();
		Bounty finbounty = bServ.getBountyByCriminalfk(criminal);
		User user = uServ.getUserByHuntername(finbounty.getUserfk().getHuntername());

		Account account = user.getUaccount();
		asServ.updateAsset(account, amount, finbounty.getCurrency());

//		Asset asset = asServ.getAssetUsingCurrency(aslist, currency);
//		asServ.updateAsset(asset, finbounty.getAmount());

		bServ.editBounty(finbounty);

		return ResponseEntity.status(201).body(finbounty);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Bounty>> findAllBounty() {
		return ResponseEntity.status(200).body(this.bServ.listAllBounty());
	}

	@GetMapping("/active")
	public ResponseEntity<List<Bounty>> findAllActiveBounty() {
		return ResponseEntity.status(200).body(this.bServ.getAllActiveBounty());
	}

	@GetMapping("/complete")
	public ResponseEntity<List<Bounty>> findAllCompleteBounty() {
		return ResponseEntity.status(200).body(this.bServ.getAllCompleteBounty());
	}

	@GetMapping("/caught")
	public ResponseEntity<List<Bounty>> findAllCaughtBounty() {
		return ResponseEntity.status(200).body(this.bServ.getAllCaughtBounty());
	}

//	@GetMapping("/hostbounties")
//	public ResponseEntity<List<Bounty>> getAllHostBounties(Host host){
//		return ResponseEntity.status(200).body(this.bServ.getBountyByHostfk(host));
//	}

	@GetMapping("/userbounties")
	public ResponseEntity<List<Bounty>> getAllUserBounties(User user) {
		return ResponseEntity.status(200).body(this.bServ.getBountyByUserfk(user));
	}

	@GetMapping(value = "/init")
	public ResponseEntity<String> insertInitalValues() {

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

//		//This is storing the assets into their accounts
//		account1.setAssetlist(asList1);
		account2.setAssetlist(asList2);
		account3.setAssetlist(asList3);
		account4.setAssetlist(asList4);

		Criminal criminal1 = new Criminal("Amarant Procjnow", 241, 222, "Bith");

		Criminal criminal2 = new Criminal("Alexandre Omega", 160, 292, "Balosar");

		Criminal criminal3 = new Criminal("Aesho Yavoog", 171, 438, "Codru-Ji");

		Criminal criminal4 = new Criminal("Broo Mao", 216, 428, "Wookie");

		Criminal criminal5 = new Criminal("Aldir Alvarez", 198, 171, "Falleen");

		Criminal criminal6 = new Criminal("Thon Endel", 178, 330, "Iktotchi");

		Criminal criminal7 = new Criminal("Ral Fyaar", 170, 357, "Gamorrean");

		Criminal criminal8 = new Criminal("Edbr Lungthyme", 155, 431, "Duros");

		Criminal criminal9 = new Criminal("Sean Annunaki", 203, 345, "Dug");

		Criminal criminal10 = new Criminal("Trigo Erantes-do-Nascimento", 170, 205, "Gungan");

//
//
//
		Host host1 = new Host("Jabba The Hutt", "TheHutt1", "D3si1ijic", "JabbTheHutt@StarHunter.com",
				"Grand Hutt Council", "Eminence of Tatooine");
		Host host2 = new Host("Darth Vader", "DarthVader1", "P4dm343v3r", "DarthVader@StarHunter.com",
				"Imperial High Command", "Emperor Palpatine");
//
		hServ.insertHost(host1);
		hServ.insertHost(host2);

		User user1 = new User("Boba Fett", "AlphaFett1", "M4nd410ri4n", "BobaFett1@StarHunter.com", account1, 1);
//		
		User user2 = new User("Cad Bane", "DuroBane1", "T4t00in3", "CadBane1@StarHunter.com", account2, 2);

		User user3 = new User("Jango Fett", "Mandalorians1", "D4wnM4nd4l", "JangFett2@StarHunter.com", account3, 3);

		User user4 = new User("Fennec Shand", "Boba1Fan", "F3ttg0tr4", "FennShan1@StarHunter.com", account4, 4);

		User user5 = new User("Din Djarin", "DinDjarin1", "M4nd410ri4n", "DinDjarin1@StarHunter.com", account1, 5);
//		
		User user6 = new User("Embo", "Embo1", "T4t00in3", "Embo1@StarHunter.com", account2, 6);

		User user7 = new User("Asajj Ventress", "AsajjVentress1", "D4wnM4nd4l", "AsajjVentress2@StarHunter.com",
				account3, 7);

		User user8 = new User("Bossk", "Bossk1", "F3ttg0tr4", "Bossk1@StarHunter.com", account4, 8);

		User user9 = new User("IG-11", "IG-11", "M4nd410ri4n", "IG-11@StarHunter.com", account1, 9);
//		
		User user10 = new User("Aurra Sing", "AurraSing1", "T4t00in3", "AurraSing1@StarHunter.com", account2, 10);
//		
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
//		
//

//		hServ.insertHost(host2);
//		
//		
//		public Bounty(double amount, String currency, String time, User userfk, Host hostfk, Criminal criminalfk,
//		String turninid, String preferid, String activeid) {
//
		Bounty bounty1 = new Bounty(1000, "Republic Credits", "34 ABY", host1, criminal1, "Alive", "Active");

		Bounty bounty2 = new Bounty(100000, "Republic Credits", "64 BBY", host1, criminal2, "Alive", "Active");

		Bounty bounty3 = new Bounty(500, "Republic Credits", "74 ABY", host1, criminal3, "Dead Or Alive", "Active");

		Bounty bounty4 = new Bounty(250, "Druggats", "28 BBY", host1, criminal4, "Dead", "Active");

		Bounty bounty5 = new Bounty(3750, "Imperial Credits", "73 ABY", host1, criminal5, "Alive", "Active");

		Bounty bounty6 = new Bounty(8760, "Imperial Credits", "22 ABY", host2, criminal6, "Dead Or Alive", "Active");
		
		Bounty bounty7 = new Bounty(95000, "Republic Credits", "45 BBY", host2, criminal7, "Dead", "Active");
		
		Bounty bounty8 = new Bounty(70000, "Imperial Credits", "32 BBY", host2, criminal8, "Alive", "Active");
		
		Bounty bounty9 = new Bounty(14000, "Imperial Credits", "67 BBY", host2, criminal9, "Dead Or Alive", "Active");
		
		Bounty bounty10 = new Bounty(300, "Druggats", "89 ABY", host2, criminal10, "Dead", "Active");

		
		Bounty bounty11 = new Bounty(1000, "Republic Credits", "34 ABY", user1, host1, criminal1, "Alive", "Alive",
				"Complete");
		
		Bounty bounty12 = new Bounty(100000, "Republic Credits", "64 BBY", user1, host1, criminal2, "Alive", "Alive",
				"Complete");
		
		Bounty bounty13 = new Bounty(500, "Republic Credits", "74 ABY", user1, host1, criminal3, "Alive",
				"Dead Or Alive", "Complete");
		
		Bounty bounty14 = new Bounty(250, "Druggats", "28 BBY", user1, host1, criminal4, "Dead", "Dead", "Complete");
		
		Bounty bounty15 = new Bounty(3750, "Imperial Credits", "73 ABY", user1, host1, criminal5, "Alive", "Alive",
				"Complete");
		
		Bounty bounty16 = new Bounty(8760, "Imperial Credits", "22 ABY", user1, host2, criminal6, "Alive",
				"Dead Or Alive", "Complete");
		
		Bounty bounty17 = new Bounty(95000, "Republic Credits", "45 BBY", user1, host2, criminal7, "Dead", "Dead",
				"Complete");
		
		Bounty bounty18 = new Bounty(70000, "Imperial Credits", "32 BBY", user1, host2, criminal8, "Alive", "Alive",
				"Complete");
		
		Bounty bounty19 = new Bounty(14000, "Imperial Credits", "67 BBY", user1, host2, criminal9, "Alive",
				"Dead Or Alive", "Complete");
		
		Bounty bounty20 = new Bounty(300, "Druggats", "89 ABY", user1, host2, criminal10, "Dead", "Dead", "Complete");
//
		bServ.insertBounty(bounty1, criminal1);
		bServ.insertBounty(bounty2, criminal2);
		bServ.insertBounty(bounty3, criminal3);
		bServ.insertBounty(bounty4, criminal4);
		bServ.insertBounty(bounty5, criminal5);
		bServ.insertBounty(bounty6, criminal6);
		bServ.insertBounty(bounty7, criminal7);
		bServ.insertBounty(bounty8, criminal8);
		bServ.insertBounty(bounty9, criminal9);
		bServ.insertBounty(bounty10, criminal10);
		bServ.insertBounty(bounty11, criminal1);
		bServ.insertBounty(bounty12, criminal2);
		bServ.insertBounty(bounty13, criminal3);
		bServ.insertBounty(bounty14, criminal4);
		bServ.insertBounty(bounty15, criminal5);
		bServ.insertBounty(bounty16, criminal6);
		bServ.insertBounty(bounty17, criminal7);
		bServ.insertBounty(bounty18, criminal8);
		bServ.insertBounty(bounty19, criminal9);
		bServ.insertBounty(bounty20, criminal10);

		return ResponseEntity.status(201).body("Successfully Inserted");
	}

}
