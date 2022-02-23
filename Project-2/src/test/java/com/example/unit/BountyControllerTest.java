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

import com.example.controller.BountyController;
import com.example.controller.UserController;
import com.example.model.Bounty;
import com.example.model.Criminal;
import com.example.model.Host;
import com.example.service.BountyService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(BountyController.class)
public class BountyControllerTest {
	
	@MockBean
	BountyService bServ;
	
	@Autowired
	MockMvc mock;
	
	Bounty bounty;
	Host host;
	Criminal criminal;
	
	@BeforeEach
	public void setUp() throws Exception{
		criminal =  new Criminal("Amarant Procjnow", 241, 222, "Bith");
		host = new Host("Jabba The Hutt", "TheHutt1", "D3si1ijic", "JabbTheHutt@StarHunter.com",
				"Grand Hutt Council", "Eminence of Tatooine");
		bounty = new Bounty(1000, "Credits", "34 ABY", host, criminal, "Alive", "Active");
		doNothing().when(this.bServ).editBounty(bounty);	
	}

	@Test
	public void testinsertInitalValues() throws Exception {
		
	}
		
	@Test
	public void testHostLogin() throws Exception {
		
	}
	
	@Test
	public void testupdateProfile() throws Exception {
		
	}
	@Test
	public void testgetProfileInfo() throws Exception {
		
	}
	@Test
	public void testcreateNewHost() throws Exception {
		
	}


	
	
	
}
