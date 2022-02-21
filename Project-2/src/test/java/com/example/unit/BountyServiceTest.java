package com.example.unit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.dao.BountyDAO;
import com.example.model.Bounty;
import com.example.model.Criminal;
import com.example.model.Host;
import com.example.model.Status;
import com.example.service.BountyService;

@RunWith(MockitoJUnitRunner.class)
public class BountyServiceTest {
	
	Bounty bounty;
	Host host;
	Criminal criminal;
	Status status;
	
	@InjectMocks
	BountyService service;
	
	@MockBean
	BountyDAO mockDAO;
	
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
		doNothing().when(this.service).editBounty(bounty);	
	}
	
	@Test
	public void testgetCriminalByFirstname() {
		when(this.service.getCriminalByFirstname("Amarant")).thenReturn(criminal);
		assertEquals(criminal, service.getCriminalByFirstname(criminal.getFirstname()));
	}
	
	@Test
	public void testgetCriminalByLastname() {
		when(this.service.getCriminalByLastname("Procjnow")).thenReturn(criminal);
		assertEquals(criminal, service.getCriminalByLastname(criminal.getLastname()));
	}
	
	@Test
	public void testgetCriminalByCodename() {
		when(this.service.getCriminalByCodename("Codename")).thenReturn(criminal);
		assertEquals(criminal, service.getCriminalByCodename(criminal.getCodename()));
	}
	
	@Test
	public void testgetBountyByCriminalId() {
	
	}
	
	@Test
	public void testgetCriminalListByFirstname() {
	
	}
	
	@Test
	public void testgetCriminalListByLastName() {
	
	}
	
	@Test
	public void testgetBountyById() {
	
	}
	
	@Test
	public void testinsertBounty() {
	
	}
	
	@Test
	public void testlistAllCriminal() {
	
	}
	
	@Test
	public void testlistAllBounty() {
	
	}
	
	@Test
	public void testgetBountyByBhHolder() {
	
	}
	
	@Test
	public void testgetBountyByHostHolder() {
	
	}
	
	@Test
	public void testorderBountyByAmount() {
	
	}
	

}
