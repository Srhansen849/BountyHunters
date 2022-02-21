package com.example.unit;

import static org.mockito.Mockito.doNothing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.example.controller.UserController;
import com.example.model.Bounty;
import com.example.model.Criminal;
import com.example.model.Host;
import com.example.model.Status;
import com.example.model.User;
import com.example.service.BountyService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(UserController.class)
public class BountyControllerTest {
	
	@MockBean
	BountyService bServ;
	
	@Autowired
	MockMvc mock;
	
	Bounty bounty;
	Host host;
	Criminal criminal;
	Status status;
	
	@BeforeEach
	public void setUp() throws Exception{
		criminal =  new Criminal("Amarant", "Procjnow", "K-656",
				"han sidious bespin dantooine mon c-3po yoda luke", 
				"Tusken", 241, 222, "Bith", "Antilles");
		status = new Status("Alive");
		host = new Host("Jabba", "Tiure", "TheHutt1", "D3si1ijic", 
						"JabbTheHutt@StarHunter.com", "Grand Hutt Council", 
						"Eminence of Tatooine", "JabbaTheHutt");
		bounty = new Bounty("Solo yoda calamari fisto jawa", 1000, 
						"Republic credit", host, criminal, status,
						"34 ABY", status);
		doNothing().when(this.bServ).editBounty(bounty);	
	}

	@Test
	public void insertInitalValues() throws Exception {
		
	}
		
	@Test
	public void HostLogin() throws Exception {
		
	}
	
	@Test
	public void updateProfile() throws Exception {
		
	}
	@Test
	public void getProfileInfo() throws Exception {
		
	}
	@Test
	public void createNewHost() throws Exception {
		
	}


	
	
	
}
