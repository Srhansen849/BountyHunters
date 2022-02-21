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
		host = new Host("Jabba", "Tiure", "TheHutt1", "D3si1ijic", "JabbTheHutt@StarHunter.com",
				"Grand Hutt Council", "Eminence of Tatooine", "JabbaTheHutt");
		doNothing().when(this.service).insertHost(host);
	}

	@Test
	public void testgetHostByFirstname() {
		when(this.service.getHostByFirstname("Firstname")).thenReturn(host);
		assertEquals(host, service.getHostByFirstname(host.getFirstname()));
	}
	
	@Test
	public void testgetHostByLastname() {
		when(this.service.getHostByLastname("Lastname")).thenReturn(host);
		assertEquals(host, service.getHostByLastname(host.getLastname()));
	}
	
	@Test
	public void testgetHostByCodename() {
		when(this.service.getHostByCodename("Codename")).thenReturn(host);
		assertEquals(host, service.getHostByCodename(host.getCodename()));
	}
	
	@Test
	public void testgetHostByUsername() {
		when(this.service.getHostByUsername("Codename")).thenReturn(host);
		assertEquals(host, service.getHostByUsername(host.getCodename()));
	}
	
	@Test
	public void testgetUserByEmail() {
		when(this.service.getHostByEmail("Email")).thenReturn(host);
		assertEquals(host, service.getHostByEmail(host.getEmail()));
	}
	
	@Test
	public void testinsertHost() {
		
	}
	
	@Test
	public void testverifyPassword() {
		
	}
		
}
