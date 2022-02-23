package com.example.unit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.controller.HostController;
import com.example.dao.HostDAO;
import com.example.model.Host;
import com.example.service.HostService;

@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
//@WebMvcTest(HostController.class)
public class HostServiceTest {
	
	Host host;
	
	@InjectMocks
//	@MockBean
	HostService service;
	
	@MockBean
	HostDAO mockDAO;
	
	@BeforeEach
	public void setUp() throws Exception{
		host = new Host("Jabba The Hutt", "TheHutt1", "D3si1ijic", "JabbTheHutt@StarHunter.com",
				"Grand Hutt Council", "Eminence of Tatooine");
	}
	
	@Test
	public void testinsertHost() {
		
	}

	@Test
	public void testgetHostByHostname() {
		when(this.mockDAO.getHostByHostname("Jabba The Hutt")).thenReturn(host);
		assertEquals(host, service.getHostByHostname(host.getHostname()));
	}
	
	@Test
	public void testgetHostByUsername() {
		when(this.mockDAO.getHostByHusername("TheHutt1")).thenReturn(host);
		assertEquals(host, service.getHostByUsername(host.getHusername()));
	}
	
	@Test
	public void testgetUserByEmail() {
		when(this.mockDAO.getHostByHemail("JabbTheHutt@StarHunter.com")).thenReturn(host);
		assertEquals(host, service.getHostByEmail(host.getHemail()));
	}
	
	@Test
	public void testverifyPassword() {
		when(this.service.verifyPassword("TheHutt1", "D3si1ijic")).thenReturn(host);
		assertEquals(host, service.verifyPassword(host.getHusername(), host.getHpassword()));
	}
		
}
