package com.example.unit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;

import com.example.dao.UserDAO;
import com.example.model.Account;
import com.example.model.Asset;
import com.example.model.User;
import com.example.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
	
	Account account;
	User user;
	Asset asset;
	List<Asset> bList = new ArrayList<Asset>();
	
	@InjectMocks
	UserService service;
	
	@MockBean
	UserDAO mockDAO;
	
	@BeforeEach
	public void setUp() throws Exception{
		user = new User("Boba Fett", "AlphaFett1", "M4nd410ri4n", "BobaFett1@StarHunter.com", account);
		asset = new Asset("Republic credit", 63.5, account);
		asset = new Asset("Republic credit", 63.5, account);
		account = new Account();
		List<Asset> List= new ArrayList<Asset>();
		doNothing().when(this.service).insertUser(user);	
	}
	
//	@Test
//	public void testfindAllBountyHunters() throws Exception{
//		List<User> bList = new ArrayList<User>();
//		bList.add(user);
//		when(this.service.findAllBountyHunters()).thenReturn(bList);
//		this.mockDAO.perform(get("/all").contentType(MediaType.APPLICATION_JSON))
//		.andExpect(status().isOk())
//		.andExpect(jsonPath("$[0].Boba Fett", is(user.getHuntername())))
//		.andExpect(jsonPath("$[0].AlphaFett1", is(user.getUusername())))
//		.andExpect(jsonPath("$[0].M4nd410ri4n", is(user.getUpassword())))
//		.andExpect(jsonPath("$[0].BobaFett1@StarHunter.com", is(user.getUemail())))
//		.andExpect(jsonPath("$[0].account", is(user.getUaccount())));
//	}
	
	@Test
	public void testgetUserByHuntername() {
		when(this.service.getUserByHuntername("huntername")).thenReturn(user);
		assertEquals(user, service.getUserByHuntername(user.getHuntername()));
	}
	
	@Test
	public void testgetUserByUsername() {
		when(this.service.getUserByUsername("uusername")).thenReturn(user);
		assertEquals(user, service.getUserByUsername(user.getUusername()));
	}
	
	@Test
	public void testgetUserByEmail() {
		when(this.service.getUserByEmail("upassword")).thenReturn(user);
		assertEquals(user, service.getUserByEmail(user.getUemail()));
	}
	
	@Test
	public void testverifyPassword() {
		
	}


	
	
	
	
}
