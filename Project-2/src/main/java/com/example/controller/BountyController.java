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
	
	@PostMapping(value="/register")
	public ResponseEntity<Bounty> RegisterBounty(@RequestBody Bounty bounty) {
		
		Criminal criminal = bounty.getCriminalid();
		
		Optional<Criminal> crimfirst = Optional.ofNullable(bServ.getCriminalByFirstname(criminal.getFirstname()));
		Optional<Criminal> crimlast = Optional.ofNullable(bServ.getCriminalByLastname(criminal.getLastname()));
		Optional<Criminal> crimcode = Optional.ofNullable(bServ.getCriminalByCodename(criminal.getCodename()));
		if(crimfirst.isEmpty() | crimlast.isEmpty() | crimcode.isPresent()) {
			return ResponseEntity.badRequest().build();
		}
		
		
		bServ.insertBounty(bounty, criminal);
		
		return ResponseEntity.status(201).body(bounty);

	}
	
	@PostMapping(value="/submit")
	public ResponseEntity<Bounty> SubmitBounty(@RequestBody Bounty bounty, @RequestBody Criminal criminal){
		

		Optional<Criminal> crimfirst = Optional.ofNullable(bServ.getCriminalByFirstname(criminal.getFirstname()));
		Optional<Criminal> crimlast = Optional.ofNullable(bServ.getCriminalByLastname(criminal.getLastname()));
		if(crimfirst.isEmpty() | crimlast.isEmpty()) {
			return ResponseEntity.badRequest().build();
		}

		
		Criminal crim = bServ.getCriminalByFirstname(criminal.getFirstname());
//		if(Objects.nonNull(criminal.getCodename())) {
//			crim = bServ.getCriminalByCodename(criminal.getCodename());
//		}
//		else {
//			crim = bServ.verifyFirstnameAndLastname(criminal);
//			
//		}
		
		Bounty subbounty = bServ.getBountyByCriminalId(crim);
		
		
		return ResponseEntity.status(201).body(subbounty);
	}

	

	@GetMapping(value = "/init")
	public ResponseEntity<String> insertInitalValues() {

		Criminal criminal1 = new Criminal("Amarant", "Procjnow", "K-656",
				"han sidious bespin dantooine mon c-3po yoda luke", "Tusken", 241, 222, "Bith", "Antilles");
		Criminal criminal2 = new Criminal("Alexandre", "Omega", "DM-923",
				"Sidious darth hutt r2-d2 mon yoda qui-gon padmé.", "Dagobah", 160, 292, "Balosar", "Chewbacca");
		Criminal criminal3 = new Criminal("Aesho", "Yavoog", "SXP-905", "Tusken raider organa jar jawa", "Maul", 171,
				438, "Codru-Ji", "Mustafar");
		Criminal criminal4 = new Criminal("Broo", "Mao", "JC66", "Calamari kenobi moff naboo", "Sidious", 216, 428,
				"Clawdite", "Alderaan");
		Criminal criminal5 = new Criminal("Aldir", "Alvarez", "GHA-569", "Utapau greedo mon mothma", "Utapau", 198, 171,
				"Falleen", "Lobot");
		Criminal criminal6 = new Criminal("Thon", "Endel", "SN-638", "Maul ewok yavin skywalker fett", "Secura", 178,
				330, "Iktotchi", "Lucas");
		Criminal criminal7 = new Criminal("Ral", "Fyaar", "W-307", "Palpatine lando solo wookiee luke darth", "Dagobah",
				170, 357, "Gamorrean", "Jade");
		Criminal criminal8 = new Criminal("Edbr", "Lungthyme", "JN395", "Naboo tusken raider maul tatooine", "", 155,
				431, "Duros", "Antilles");
		Criminal criminal9 = new Criminal("Sean", "Annunaki", "VWV647", "Obi-wan qui-gon mon coruscant wedge", "Naboo",
				203, 345, "Dug", "Kenobi");
		Criminal criminal10 = new Criminal("Trigo", "Erantes-do-Nascimento", "XDR-708",
				"Dagobah sidious skywalker darth", "Palpatine", 170, 205, "Gungan", "Boba");



		Host host1 = new Host("Jabba", "Tiure", "TheHutt1", "D3si1ijic", "JabbTheHutt@StarHunter.com",
				"Grand Hutt Council", "Eminence of Tatooine", "JabbaTheHutt");
		Host host2 = new Host("Anakin", "Skywalker", "DarthVader1", "P4dm343v3r", "DarthVader@StarHunter.com",
				"Imperial High Command", "Emperor Palpatine", "DarthVader");

		hServ.insertHost(host1);
		hServ.insertHost(host2);
		
		
		

		Bounty bounty1 = new Bounty(1000, "Republic credit", host1, criminal1, "Alive",
				"34 ABY", "Active");
		Bounty bounty2 = new Bounty(100000, "Republic credit", host1, criminal2, "Alive",
				"64 BBY", "Active");
		Bounty bounty3 = new Bounty(500, "Republic credit", host1, criminal3,
				"Dead Or Alive", "74 ABY", "Active");
		Bounty bounty4 = new Bounty(250, "Druggats", host1, criminal4, "Dead", "28 BBY",
				"Active");
		Bounty bounty5 = new Bounty(3750, "Emperial Credits", host1, criminal5,
				"Alive", "73 ABY", "Active");
		Bounty bounty6 = new Bounty(8760, "Imperial credit", host2, criminal6,
				"Dead Or Alive", "22 ABY", "Active");
		Bounty bounty7 = new Bounty(95000, "Republic credit", host2, criminal7,
				"Dead", "45 BBY", "Active");
		Bounty bounty8 = new Bounty(70000, "Emperial Credits", host2, criminal8,
				"Alive", "32 BBY", "Active");
		Bounty bounty9 = new Bounty(14000, "Imperial credit", host2, criminal9,
				"Dead Or Alive", "67 BBY", "Active");
		Bounty bounty10 = new Bounty(300, "Druggats", host2, criminal10,
				"Dead", "89 ABY", "Active");

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

		return ResponseEntity.status(201).body("Successfully Inserted");
	}

	@PostMapping("/new")
	public ResponseEntity<Bounty> createNewBounty(@RequestBody Bounty bounty, @RequestBody Criminal criminal) {
		Optional<Criminal> codename = Optional.ofNullable(bServ.getCriminalByCodename(criminal.getCodename()));
		Optional<Criminal> firstname = Optional.ofNullable(bServ.getCriminalByFirstname(criminal.getFirstname()));
		Optional<Criminal> lastname = Optional.ofNullable(bServ.getCriminalByLastname(criminal.getLastname()));
		if (codename.isPresent() | firstname.isEmpty() | lastname.isEmpty()) {
			return ResponseEntity.badRequest().build();
		}

		Bounty subbounty = bServ.getBountyByCriminalId(criminal);
		subbounty.setPreferid(bounty.getPreferid());
		subbounty.setCapture(bounty.getCapture());
		subbounty.setHostHolder(bounty.getHostHolder());
		subbounty.setActiveid("Active");
		
		bServ.insertBounty(subbounty, criminal);
		
		return ResponseEntity.status(201).body(subbounty);
	}
	
	@PostMapping(value="/finish")
	public ResponseEntity<Bounty> FinishBounty(@RequestBody Bounty bounty){
		
			
		Bounty finbounty = bServ.getBountyById(bounty.getBountyid());
		User user = uServ.getUserById(finbounty.getBhHolder());
		
		Account account = user.getAccount();
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
	
	@GetMapping("/complete")
	public ResponseEntity<List<Bounty>> findAllCompletedBounty(){
		return ResponseEntity.status(200).body(this.bServ.getAllCompletedBounty());
	}
	
	@GetMapping("/private")
	public ResponseEntity<List<Bounty>> findAllPrivateBounty(){
		return ResponseEntity.status(200).body(this.bServ.getAllPrivateBounty());
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Bounty>> findAllBounty(){
		return ResponseEntity.status(200).body(this.bServ.listAllBounty());
	}
	
	@GetMapping("/criminal")
	public ResponseEntity<List<Criminal>> findAllCriminals(){
		return ResponseEntity.status(200).body(this.bServ.getCriminalAll());
	}
	
	@GetMapping("/profile/{id}")
	public ResponseEntity<Bounty> updateProfile(@PathVariable("id") int bountyid){
		return ResponseEntity.status(201).body(bServ.getBountyById(bountyid));
	}


}
