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

import com.example.dao.HostDAO;
import com.example.model.Host;
import com.example.service.HostService;

@RunWith(MockitoJUnitRunner.class)
public class HostServiceTest {
	
	Host host;
	
	@InjectMocks
	HostService service;
	
	@MockBean
	HostDAO mockDAO;
	
	@BeforeEach
	public void setUp() throws Exception{
		host = new Host("Jabba The Hutt", "TheHutt1", "D3si1ijic", "JabbTheHutt@StarHunter.com",
				"Grand Hutt Council", "Eminence of Tatooine");
		doNothing().when(this.service).insertHost(host);
	}
	
	@Test
	public void testinsertHost() {
		
	}

	@Test
	public void testgetHostByHostname() {
		when(this.service.getHostByHostname("Firstname")).thenReturn(host);
		assertEquals(host, service.getHostByHostname(host.getHostname()));
	}
	
	@Test
	public void testgetHostByUsername() {
		when(this.service.getHostByUsername("Codename")).thenReturn(host);
		assertEquals(host, service.getHostByUsername(host.getHusername()));
	}
	
	@Test
	public void testgetUserByEmail() {
		when(this.service.getHostByEmail("Email")).thenReturn(host);
		assertEquals(host, service.getHostByEmail(host.getHemail()));
	}
	
	@Test
	public void testverifyPassword() {
		
	}
		
}
