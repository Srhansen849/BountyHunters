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
import com.example.service.BountyService;

@RunWith(MockitoJUnitRunner.class)
public class BountyServiceTest {
	
	Bounty bounty;
	Host host;
	Criminal criminal;
	
	@InjectMocks
	BountyService service;
	
	@MockBean
	BountyDAO mockDAO;
	
	@BeforeEach
	public void setUp() throws Exception{
		criminal =  new Criminal("Amarant Procjnow", 241, 222, "Bith");
		host = new Host("Jabba The Hutt", "TheHutt1", "D3si1ijic", "JabbTheHutt@StarHunter.com",
				"Grand Hutt Council", "Eminence of Tatooine");
		bounty = new Bounty(1000, "Credits", "34 ABY", host, criminal, "Alive", "Active");
		doNothing().when(this.service).editBounty(bounty);	
	}
	
	@Test
	public void testgetCriminalByCrimname() {
		when(this.service.getCriminalByCrimname("Amarant")).thenReturn(criminal);
		assertEquals(criminal, service.getCriminalByCrimname(criminal.getCrimname()));
	}
	
//	@Test
//	public void testgetBountyByCriminalfk() {
//		when(this.service.getBountyByCriminalfk("Codename")).thenReturn(criminal);
//		assertEquals(criminal, service.getBountyByCriminalfk(criminal.getCrimname()));
//	}
	
	@Test
	public void testgetBountyById() {
	
	}
	
	@Test
	public void testinsertBounty() {
	
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
	public void testeditBounty() {
	
	}
	
	@Test
	public void testlistAllBounty() {
	
	}
	
	@Test
	public void testgetAllActiveBounty() {
	
	}
	
	@Test
	public void testgetAllCompletedBounty() {
	
	}
	
	@Test
	public void testgetAllPrivateBounty() {
	
	}
	
	@Test
	public void testgetHostBounties() {
	
	}
	
	@Test
	public void testgetUserBounties() {
	
	}
	
	@Test
	public void testgetBountyByUserfk() {
	
	}
	
	@Test
	public void testgetBountyByHostfk() {
	
	}
	
	
	
	
	
}
