package com.example.controller;


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


import com.example.model.Host;
import com.example.service.HostService;

@RestController
@RequestMapping(value = "/host")
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
	public ResponseEntity<String> insertInitalValues() {

		Host host1 = new Host("Jabba", "Tiure", "TheHutt1", "D3si1ijic", "JabbTheHutt@StarHunter.com",
				"Grand Hutt Council", "Eminence of Tatooine", "JabbaTheHutt");
		Host host2 = new Host("Anakin", "Skywalker", "DarthVader1", "P4dm343v3r", "DarthVader@StarHunter.com",
				"Imperial High Command", "Emperor Palpatine", "DarthVader");

		hServ.insertHost(host1);
		hServ.insertHost(host2);

		return ResponseEntity.status(201).body("Successfully Inserted");
	}

	// This is the login function, it will first verify that the user is present in
	// the database then it will verify that the password the host has entered in is correct 
	@PostMapping("/login")
	public ResponseEntity<Host> businessOwnerLogin(@RequestBody Host host) {
		Optional<Host> username = Optional.ofNullable(hServ.getHostByUsername(host.getUsername()));
		if (!username.isPresent()) {
			return ResponseEntity.badRequest().build();
		}
		host = hServ.verifyPassword(host.getUsername(), host.getPassword());
		return ResponseEntity.status(201).body(host);
	}

	// This is used for updating the current users profile
	@PostMapping("/profile")
	public ResponseEntity<Host> updateProfile(@RequestBody Host host) {
		Optional<Host> email = Optional.ofNullable(hServ.getHostByEmail(host.getEmail()));
		Optional<Host> codename = Optional.ofNullable(hServ.getHostByCodename(host.getCodename()));
		Optional<Host> firstname = Optional.ofNullable(hServ.getHostByFirstname(host.getFirstname()));
		Optional<Host> lastname = Optional.ofNullable(hServ.getHostByLastname(host.getLastname()));
		if ( email.isPresent() | codename.isPresent() | firstname.isEmpty() |
				lastname.isEmpty() | email.isEmpty()) {
			return ResponseEntity.badRequest().build();
		}

		hServ.insertHost(host);
		return ResponseEntity.status(201).body(host);
	}

	// This will get the current data on the users profile
	@GetMapping("/profile")
	public ResponseEntity<Host> getProfileInfo(Host host) {
		return ResponseEntity.status(201).body(host);
	}

	// This is for creating a new user
	@PostMapping("/new")
	public ResponseEntity<Host> createNewUser(@RequestBody Host host) {
		Optional<Host> username = Optional.ofNullable(hServ.getHostByUsername(host.getEmail()));
		Optional<Host> email = Optional.ofNullable(hServ.getHostByEmail(host.getEmail()));
		Optional<Host> codename = Optional.ofNullable(hServ.getHostByCodename(host.getCodename()));
		Optional<Host> firstname = Optional.ofNullable(hServ.getHostByFirstname(host.getFirstname()));
		Optional<Host> lastname = Optional.ofNullable(hServ.getHostByLastname(host.getLastname()));
		if (username.isPresent() | email.isPresent() | codename.isPresent() | firstname.isEmpty() | 
				lastname.isEmpty() | email.isEmpty() | username.isEmpty()) {
			return ResponseEntity.badRequest().build();
		}


		hServ.insertHost(host);
		return ResponseEntity.status(201).body(host);
	}


}
