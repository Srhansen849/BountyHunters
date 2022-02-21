package com.example.controller;

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
@CrossOrigin(origins = "*") // CORS - cross origin resource sharing, it is a mechinism that can restrict
							// access for resource from external server
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

		Host host1 = new Host("Jabba The Hutt", "TheHutt1", "D3si1ijic", "JabbTheHutt@StarHunter.com",
				"Grand Hutt Council", "Eminence of Tatooine");
//		Host host2 = new Host("Anakin", "Skywalker", "DarthVader1", "P4dm343v3r", "DarthVader@StarHunter.com",
//				"Imperial High Command", "Emperor Palpatine", "DarthVader");

		hServ.insertHost(host1);
//		hServ.insertHost(host2);

		return ResponseEntity.status(201).body("Successfully Inserted");
	}

	// This is the login function, it will first verify that the user is present in
	// the database then it will verify that the password the host has entered in is
	// correct
	@PostMapping("/login")
	public ResponseEntity<Host> HostLogin(@RequestBody Host host) {
		Optional<Host> username = Optional.ofNullable(hServ.getHostByEmail(host.getHusername()));
		if (!username.isPresent()) {
			return ResponseEntity.badRequest().build();
		}
		host = hServ.verifyPassword(host.getHusername(), host.getHpassword());
		return ResponseEntity.status(201).body(host);
	}

	// This is used for updating the current users profile
	@PostMapping("/profile")
	public ResponseEntity<Host> updateProfile(@RequestBody Host host) {
		Optional<Host> email = Optional.ofNullable(hServ.getHostByEmail(host.getHemail()));
		if (email.isPresent() | email.isEmpty()) {
			return ResponseEntity.badRequest().build();
		}

		hServ.insertHost(host);
		return ResponseEntity.status(201).body(host);
	}

	// This will get the current data on the users profile
	@GetMapping("/profileinfo")
	public ResponseEntity<Host> getProfileInfo(Host host) {
		return ResponseEntity.status(201).body(host);
	}

	// This is for creating a new user
	@PostMapping("/new")
	public ResponseEntity<Host> createNewHost(@RequestBody Host host) {
		Optional<Host> username = Optional.ofNullable(hServ.getHostByEmail(host.getHusername()));
		Optional<Host> email = Optional.ofNullable(hServ.getHostByEmail(host.getHemail()));
		Optional<Host> name = Optional.ofNullable(hServ.getHostByHostname(host.getHostname()));
		if (username.isPresent() | email.isPresent() | name.isPresent() | name.isEmpty() | username.isEmpty()
				| email.isEmpty()) {
			return ResponseEntity.badRequest().build();
		}

		hServ.insertHost(host);
		return ResponseEntity.status(201).body(host);
	}

}
