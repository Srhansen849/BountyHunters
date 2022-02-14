package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.HostService;

@RestController
@RequestMapping(value="/host")
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
	
	

}
