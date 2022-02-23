package com.example.unit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.example.controller.BountyController;
import com.example.dao.BountyDAO;
import com.example.dao.CriminalDAO;
import com.example.model.Bounty;
import com.example.model.Criminal;
import com.example.model.Host;
import com.example.model.User;
import com.example.service.BountyService;
import com.fasterxml.jackson.databind.ObjectMapper;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(BountyController.class)
//@ExtendWith(SpringExtension.class)
public class BountyServiceTest {
	
	Bounty bounty;
	Host host;
	Criminal criminal;
	User user;
	List<Bounty> bList = new ArrayList<Bounty>();
	
//	@MockBean
	@InjectMocks
	BountyService service;
	
	@MockBean
	CriminalDAO cDAO;
	
	@MockBean
	BountyDAO bDAO;
	
	@Autowired
	MockMvc mock;
	
	@BeforeEach
	public void setUp() throws Exception{
		criminal =  new Criminal("Amarant Procjnow", 241, 222, "Bith");
		host = new Host("Jabba The Hutt", "TheHutt1", "D3si1ijic", "JabbTheHutt@StarHunter.com",
				"Grand Hutt Council", "Eminence of Tatooine");
		bounty = new Bounty(1000, "Credits", "34 ABY", host, criminal, "Alive", "Active");
//		doNothing().when(this.service).editBounty(bounty);	
	}
	
	@Test
	public void testgetCriminalByCrimname() {
		when(this.cDAO.getCriminalByCrimname("Amarant Procjnow")).thenReturn(criminal);
		assertEquals(criminal, service.getCriminalByCrimname(criminal.getCrimname()));
	}
	
	@Test
	public void testgetBountyByCriminalfk() {
		when(this.cDAO.getCriminalByCrimname(criminal.getCrimname())).thenReturn(criminal);
		when(this.bDAO.getBountyByCriminalfk(criminal)).thenReturn(bounty);
	}
	
	
//	@Test
//	public void testinsertBounty() {
//		when(this.service.insertBounty(bounty.    ()       )).thenReturn(null).thenReturn(bounty);
//		this.mock.perform(post("/bounty").contentType(MediaType.APPLICATION_JSON).content(
//				new ObjectMapper().writeValueAsString(bounty)))		
//		.andExpect(status().isCreated()); 
//	}
		
	@Test
	public void testeditBounty() {
	
	}
	
//	@Test
//	public void testlistAllBounty() throws Exception {
//		List<Bounty> bList = new ArrayList<Bounty>();
//		bList.add(bounty);
//		when(this.bDAO.findAll()).thenReturn(bList);
//		this.mock.perform(get(this.service.listAllBounty()).contentType(List<Bounty>()).getClass());
		
//		.andExpect(status().isOk());
//		.andExpect(jsonPath("$[0].bountyid", is(bounty.getBountyid())))
//		.andExpect(jsonPath("$[0].userfk", is(user.userfk())))
//		.andExpect(jsonPath("$[0].criminalfk", is(criminal.())))
//		.andExpect(jsonPath("$[0].turninid", is(bounty.())));
//		}
	
	
	@Test
	public void testgetAllActiveBounty() throws Exception {
		List<Bounty> bList = new ArrayList<Bounty>();
		bList.add(bounty);
		when(this.service.getAllActiveBounty()).thenReturn(bList);
		this.mock.perform(get("/all").contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
//		.andExpect(jsonPath("$[0].foodName", is(food.getFoodName())))
//		.andExpect(jsonPath("$[0].calories", is(food.getCalories())));
	
	}
	
	@Test
	public void testgetAllCompletedBounty() throws Exception {
		List<Bounty> bList = new ArrayList<Bounty>();
		bList.add(bounty);
		when(this.service.getAllActiveBounty()).thenReturn(bList);
		this.mock.perform(get("/complete").contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
//		.andExpect(jsonPath("$[0].foodName", is(food.getFoodName())))
		
//		.andExpect(jsonPath("$[0].calories", is(food.getCalories())));	
	}
	
	

	


	
	
	
	
}
