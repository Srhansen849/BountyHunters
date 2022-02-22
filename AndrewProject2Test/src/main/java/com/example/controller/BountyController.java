package com.example.controller;

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
@CrossOrigin(origins="*")
public class BountyController {

	private BountyService bServ;
	private HostService hServ;
	private UserService uServ;
	private AssetService asServ;


	public BountyController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public BountyController(BountyService bServ, HostService hServ,
			UserService uServ, AssetService asServ) {
		super();
		this.bServ = bServ;
		this.hServ = hServ;
		this.uServ = uServ;
		this.asServ = asServ;
	}
	
	
	//New Bounty
	@PostMapping("/new")
	public ResponseEntity<Bounty> createNewBounty(@RequestBody Bounty bounty) {
		Criminal criminal = bounty.getCriminalfk();
		Optional<Criminal> crimname = Optional.ofNullable(bServ.getCriminalByCrimname(criminal.getCrimname()));
		if (crimname.isEmpty()) {
			return ResponseEntity.badRequest().build();
		}

		bounty.setActiveid("Active");
		
		bServ.insertBounty(bounty, criminal);
		
		return ResponseEntity.status(201).body(bounty);
	}
	
	//Hunter Submits Bounty
	@PostMapping(value="/update")
	public ResponseEntity<Bounty> UpdateBounty(@RequestBody Bounty bounty){
		
		Criminal criminal = bounty.getCriminalfk();
		Optional<Criminal> crimname = Optional.ofNullable(bServ.getCriminalByCrimname(criminal.getCrimname()));
		if(crimname.isEmpty()) {
			return ResponseEntity.badRequest().build();
		}
		
		Bounty upbounty = bServ.getBountyByCriminalfk(criminal);

		
		Criminal crim = bServ.getCriminalByCrimname(criminal.getCrimname());
		
		bServ.insertBounty(upbounty, crim);
		
		
		return ResponseEntity.status(201).body(upbounty);
	}
	
	//Host Finishes Bounty
	@PostMapping(value="/finish")
	public ResponseEntity<Bounty> FinishBounty(@RequestBody Bounty bounty){
		
		Criminal criminal = bounty.getCriminalfk();
		Bounty finbounty = bServ.getBountyByCriminalfk(criminal);
		User user = uServ.getUserByHuntername(finbounty.getUserfk().getHuntername());
		
		Account account = user.getUaccount();
		asServ.updateAsset(account, finbounty.getAmount(), finbounty.getCurrency());

		

//		Asset asset = asServ.getAssetUsingCurrency(aslist, currency);
//		asServ.updateAsset(asset, finbounty.getAmount());
		
		bServ.editBounty(finbounty);
		
		return ResponseEntity.status(201).body(finbounty);
	}
	
	@GetMapping("/active")
	public ResponseEntity<List<Bounty>> findAllActiveBounty(){
		return ResponseEntity.status(200).body(this.bServ.getAllActiveBounty());
	}
	
	@GetMapping("/hostbounties")
	public ResponseEntity<List<Bounty>> getAllHostBounties(Host host){
		return ResponseEntity.status(200).body(this.bServ.getBountyByHostfk(host));
	}
	
	@GetMapping("/userbounties")
	public ResponseEntity<List<Bounty>> getAllUserBounties(User user){
		return ResponseEntity.status(200).body(this.bServ.getBountyByUserfk(user));
	}

	
	
	
	
	
	@GetMapping(value = "/init")
	public ResponseEntity<String> insertInitalValues() {

		Criminal criminal1 = new Criminal("Amarant Procjnow", 241, 222, "Bith");
//		Criminal criminal2 = new Criminal("Alexandre", "Omega", "DM-923",
//				"Sidious darth hutt r2-d2 mon yoda qui-gon padmé.", "Dagobah", 160, 292, "Balosar", "Chewbacca");
//		Criminal criminal3 = new Criminal("Aesho", "Yavoog", "SXP-905", "Tusken raider organa jar jawa", "Maul", 171,
//				438, "Codru-Ji", "Mustafar");
//		Criminal criminal4 = new Criminal("Broo", "Mao", "JC66", "Calamari kenobi moff naboo", "Sidious", 216, 428,
//				"Clawdite", "Alderaan");
//		Criminal criminal5 = new Criminal("Aldir", "Alvarez", "GHA-569", "Utapau greedo mon mothma", "Utapau", 198, 171,
//				"Falleen", "Lobot");
//		Criminal criminal6 = new Criminal("Thon", "Endel", "SN-638", "Maul ewok yavin skywalker fett", "Secura", 178,
//				330, "Iktotchi", "Lucas");
//		Criminal criminal7 = new Criminal("Ral", "Fyaar", "W-307", "Palpatine lando solo wookiee luke darth", "Dagobah",
//				170, 357, "Gamorrean", "Jade");
//		Criminal criminal8 = new Criminal("Edbr", "Lungthyme", "JN395", "Naboo tusken raider maul tatooine", "", 155,
//				431, "Duros", "Antilles");
//		Criminal criminal9 = new Criminal("Sean", "Annunaki", "VWV647", "Obi-wan qui-gon mon coruscant wedge", "Naboo",
//				203, 345, "Dug", "Kenobi");
//		Criminal criminal10 = new Criminal("Trigo", "Erantes-do-Nascimento", "XDR-708",
//				"Dagobah sidious skywalker darth", "Palpatine", 170, 205, "Gungan", "Boba");
//
//
//
		Host host1 = new Host("Jabba The Hutt", "TheHutt1", "D3si1ijic", "JabbTheHutt@StarHunter.com",
				"Grand Hutt Council", "Eminence of Tatooine");
//		Host host2 = new Host("Anakin", "Skywalker", "DarthVader1", "P4dm343v3r", "DarthVader@StarHunter.com",
//				"Imperial High Command", "Emperor Palpatine", "DarthVader");
//
		
//		hServ.insertHost(host2);
//		
//		
//		
//
		Bounty bounty1 = new Bounty(1000, "Credits", "34 ABY", host1, criminal1, "Alive", "Active");
//		Bounty bounty2 = new Bounty(100000, "Republic credit", host1, criminal2, "Alive",
//				"64 BBY", "Active");
//		Bounty bounty3 = new Bounty(500, "Republic credit", host1, criminal3,
//				"Dead Or Alive", "74 ABY", "Active");
//		Bounty bounty4 = new Bounty(250, "Druggats", host1, criminal4, "Dead", "28 BBY",
//				"Active");
//		Bounty bounty5 = new Bounty(3750, "Emperial Credits", host1, criminal5,
//				"Alive", "73 ABY", "Active");
//		Bounty bounty6 = new Bounty(8760, "Imperial credit", host2, criminal6,
//				"Dead Or Alive", "22 ABY", "Active");
//		Bounty bounty7 = new Bounty(95000, "Republic credit", host2, criminal7,
//				"Dead", "45 BBY", "Active");
//		Bounty bounty8 = new Bounty(70000, "Emperial Credits", host2, criminal8,
//				"Alive", "32 BBY", "Active");
//		Bounty bounty9 = new Bounty(14000, "Imperial credit", host2, criminal9,
//				"Dead Or Alive", "67 BBY", "Active");
//		Bounty bounty10 = new Bounty(300, "Druggats", host2, criminal10,
//				"Dead", "89 ABY", "Active");
//
		bServ.insertBounty(bounty1, criminal1);
		hServ.insertHost(host1);
//		bServ.insertBounty(bounty2, criminal2);
//		bServ.insertBounty(bounty3, criminal3);
//		bServ.insertBounty(bounty4, criminal4);
//		bServ.insertBounty(bounty5, criminal5);
//		bServ.insertBounty(bounty6, criminal6);
//		bServ.insertBounty(bounty7, criminal7);
//		bServ.insertBounty(bounty8, criminal8);
//		bServ.insertBounty(bounty9, criminal9);
//		bServ.insertBounty(bounty10, criminal10);

		return ResponseEntity.status(201).body("Successfully Inserted");
	}

}
