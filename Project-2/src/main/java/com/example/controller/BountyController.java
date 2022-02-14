package com.example.controller;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.FormParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Bounty;
import com.example.model.Criminal;
import com.example.model.Host;
import com.example.model.User;
import com.example.service.BountyService;
import com.example.service.CriminalService;

@RestController
@RequestMapping(value="/bhunter")
public class BountyController {
	
	private BountyService bServ;
	private CriminalService cServ;
	
	
	public BountyController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public BountyController(BountyService bServ, CriminalService cServ) {
		super();
		this.bServ = bServ;
		this.cServ = cServ;
	}
	
	@PostMapping(value="/register")
	public ResponseEntity<Bounty> RegisterBounty(@RequestBody Bounty bounty, @RequestBody Criminal criminal) {
		
		
		
		
		
		bServ.newBounty(bounty, criminal);
		
		return ResponseEntity.status(201).body(bounty);
		
		
		
	}
	
	

}
