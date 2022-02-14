package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Account;
import com.example.model.Asset;
import com.example.model.Bounty;
import com.example.model.Criminal;
import com.example.model.User;
import com.example.service.AssetService;
import com.example.service.BountyService;
import com.example.service.UserService;



@RestController
@RequestMapping(value="/bhunter")
public class BountyController {
	
	private BountyService bServ;
	private AssetService asServ;
	private UserService uServ;


	
	
	public BountyController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public BountyController(BountyService bServ, AssetService asServ, UserService uServ) {
		super();
		this.bServ = bServ;
		this.asServ = asServ;
		this.uServ = uServ;
	}
	
	@PostMapping(value="/register")
	public ResponseEntity<Bounty> RegisterBounty(@RequestBody Bounty bounty, @RequestBody Criminal criminal) {
		
		Optional<Criminal> crimfirst = Optional.ofNullable(bServ.getCriminalByFirstName(criminal.getFirstname()));
		Optional<Criminal> crimlast = Optional.ofNullable(bServ.getCriminalByLastName(criminal.getLastname()));
		Optional<Criminal> crimcode = Optional.ofNullable(bServ.getCriminalByCodeName(criminal.getCodename()));
		if(!crimfirst.isPresent()|(crimfirst.isEmpty())|!crimlast.isPresent()|(crimlast.isEmpty())|!crimcode.isPresent()) {
			return ResponseEntity.badRequest().build();
		}
		
		
		bServ.newBounty(bounty, criminal);
		
		return ResponseEntity.status(201).body(bounty);

	}
	
	@PostMapping(value="/submitbounty")
	public ResponseEntity<Bounty> SubmitBounty(@RequestBody Bounty bounty, @RequestBody Criminal criminal){
		
		
		Bounty subbounty = bServ.getBountyByCriminalId(criminal);
		subbounty.setTurninid(bounty.getTurninid());
		subbounty.setCapture(bounty.getCapture());
		subbounty.setBhHolder(bounty.getBhHolder());
		
		
		
		bServ.editBounty(subbounty);
		
		return ResponseEntity.status(201).body(subbounty);
	}
	
	@PostMapping()
	public ResponseEntity<Bounty> FinishBounty(@RequestBody Bounty bounty){
		
		
		User user = uServ.getUserById(bounty.getBhHolder());
		
		String currency = bounty.getCurrency();
		
		Account account = user.getAccount();
		
		List<Asset> aslist = asServ.getAllAssets(account);
		
		Asset asset = asServ.getAssetUsingCurrency(aslist, currency);
		
		asServ.updateAsset(asset, bounty.getAmount());
		
				
		bServ.editBounty(bounty);
		
		return ResponseEntity.status(201).body(bounty);
	}
	

}
