package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Bounty;
import com.example.model.Criminal;
import com.example.model.Host;
import com.example.model.Status;
import com.example.service.BountyService;
import com.example.service.HostService;

@RestController
@RequestMapping(value="/bounty")
public class BountyController {
	
	private BountyService bServ;
	private HostService hServ;
	
	
	public BountyController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public BountyController(BountyService bServ, HostService hServ) {
		super();
		this.bServ = bServ;
		this.hServ = hServ;
	}
	
	@GetMapping(value="/init")
	public ResponseEntity<String> insertInitalValues(){
		
		Criminal criminal1 = new Criminal("Amarant", "Procjnow", "K-656", 
				"han sidious bespin dantooine mon c-3po yoda luke", "Tusken",
				241, 222, "Bith", "Antilles");
		Criminal criminal2 = new Criminal("Alexandre", "Omega", "DM-923",
				"Sidious darth hutt r2-d2 mon yoda qui-gon padmé.", "Dagobah",
				160, 292, "Balosar", "Chewbacca");
		Criminal criminal3 = new Criminal("Aesho", "Yavoog", "SXP-905",
				"Tusken raider organa jar jawa", "Maul",
				171, 438, "Codru-Ji", "Mustafar");
		Criminal criminal4 = new Criminal("Broo", "Mao", "JC66",
				"Calamari kenobi moff naboo", "Sidious",
				216, 428, "Clawdite", "Alderaan");
		Criminal criminal5 = new Criminal("Aldir", "Alvarez", "GHA-569",
				"Utapau greedo mon mothma", "Utapau",
				198, 171, "Falleen", "Lobot");
		Criminal criminal6 = new Criminal("Thon", "Endel", "SN-638",
				"Maul ewok yavin skywalker fett", "Secura",
				178, 330, "Iktotchi", "Lucas");
		Criminal criminal7 = new Criminal("Ral", "Fyaar", "W-307",
				"Palpatine lando solo wookiee luke darth", "Dagobah",
				170, 357, "Gamorrean", "Jade");
		Criminal criminal8 = new Criminal("Edbr", "Lungthyme", "JN395",
				"Naboo tusken raider maul tatooine", "",
				155, 431, "Duros", "Antilles");
		Criminal criminal9 = new Criminal("Sean", "Annunaki", "VWV647",
				"Obi-wan qui-gon mon coruscant wedge", "Naboo",
				203, 345, "Dug", "Kenobi");
		Criminal criminal10 = new Criminal("Trigo", "Erantes-do-Nascimento",
				"XDR-708", "Dagobah sidious skywalker darth", "Palpatine",
				170, 205, "Gungan", "Boba");
		
		Status status1 = new Status("Alive");
		Status status2 = new Status("Dead");
		Status status3 = new Status("Dead or Alive");
		Status status4 = new Status("Active");
		Status status5 = new Status("Complete");
		
		Host host1 = new Host("Jabba", "Tiure", "TheHutt1", "D3si1ijic", 
				"JabbTheHutt@StarHunter.com", "Grand Hutt Council", "Eminence of Tatooine", 
				"JabbaTheHutt");
		Host host2 = new Host("Anakin", "Skywalker", "DarthVader1", "P4dm343v3r", 
				"DarthVader@StarHunter.com", "Imperial High Command", "Emperor Palpatine", 
				"DarthVader");
		
		hServ.insertHost(host1);
		hServ.insertHost(host2);
		
		Bounty bounty1 = new Bounty("Solo yoda calamari fisto jawa", 1000,
				"Republic credit", host1, criminal1, status1, "34 ABY", status4);
		Bounty bounty2 = new Bounty("Darth wedge luke jade", 100000,
				"Republic credit",  host1, criminal2, status2, "64 BBY", status4);
		Bounty bounty3 = new Bounty("Chewbacca antilles dantooine darth jinn",
				500, "Republic credit", host1, criminal3, status3, "", status4);
		Bounty bounty4 = new Bounty("Yoda mace binks yavin", 250, "Druggats",
				host1, criminal4, status1, "28 BBY", status4);
		Bounty bounty5 = new Bounty("Sith moff gamorrean kashyyyk.", 3750,
				"Imperial credit", host1, criminal5, status2, "73 ABY", status4);
		Bounty bounty6 = new Bounty("Calamari bespin binks obi-wan mustafar",
				8760, "Imperial credit", host2, criminal6, status3, "22 ABY", status4);
		Bounty bounty7 = new Bounty("Ahsoka skywalker grievous darth",
				95000, "Republic credit", host2, criminal7, status1, "45 BBY", status4);
		Bounty bounty8 = new Bounty("Jawa ackbar bespin han luke jango", 70000,
				"Imperial credit", host2, criminal8, status2, "32 BBY", status4);
		Bounty bounty9 = new Bounty("Organa jango mandalorians calrissian",
				14000, "Imperial credit", host2, criminal9, status3, "67 BBY", status4);
		Bounty bounty10 = new Bounty("Dantooine mandalorians hoth tatooine",
				300, "Druggats", host2, criminal10, status1, "89 ABY", status4);
		
		bServ.insertBounty(bounty1, criminal1, status1);
		bServ.insertBounty(bounty2, criminal2, status2);
		bServ.insertBounty(bounty3, criminal3, status3);
		bServ.insertBounty(bounty4, criminal4, status4);
		bServ.insertBounty(bounty5, criminal5, status5);
		bServ.insertBounty(bounty6, criminal6);
		bServ.insertBounty(bounty7, criminal7);
		bServ.insertBounty(bounty8, criminal8);
		bServ.insertBounty(bounty9, criminal9);
		bServ.insertBounty(bounty10, criminal10);
		
		return ResponseEntity.status(201).body("Successfully Inserted");
	}

}