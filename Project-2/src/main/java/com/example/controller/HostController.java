package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Host;
import com.example.service.HostService;

@RestController
@RequestMapping(value="/host")
//@CrossOrigin(origins="*")//CORS - cross origin resource sharing, it is a mechinism that can restrict access for resource from external server
//requests(aka requests outside of the servers domain) if you set the origin to *, it will allow any domain to request the server
public class HostController {
	
	private HostService hServ;
	
	public HostController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public HostController(HostService hServ) {
		super();
		this.hServ = hServ;
	}
	
	@GetMapping("/init")
	public ResponseEntity<String> insertInitalValues(){
		
		Host host1 = new Host("Jabba", "Tiure", "TheHutt1", "D3si1ijic", 
				"JabbTheHutt@StarHunter.com", "Grand Hutt Council", "Eminence of Tatooine", 
				"JabbaTheHutt");
		Host host2 = new Host("Anakin", "Skywalker", "DarthVader1", "P4dm343v3r", 
				"DarthVader@StarHunter.com", "Imperial High Command", "Emperor Palpatine", 
				"DarthVader");
		
		hServ.insertHost(host1);
		hServ.insertHost(host2);
		
		return ResponseEntity.status(201).body("Successfully Inserted");
	}
	
	
	
	

}
