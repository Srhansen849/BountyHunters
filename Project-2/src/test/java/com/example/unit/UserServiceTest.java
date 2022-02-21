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
	
	@InjectMocks
	UserService service;
	
	@MockBean
	UserDAO mockDAO;
	
	@BeforeEach
	public void setUp() throws Exception{
		user = new User("Boba", "Fett", "AlphaFett1", "M4nd410ri4n",
				"BobaFett1@StarHunter.com", "Alpha", 1, account);
		asset = new Asset("Republic credit", 63.5, account);
		account = new Account();
		List<Asset> List= new ArrayList<Asset>();
		doNothing().when(this.service).insertUser(user);	
	}
	
	@Test
	public void testgetUserByFirstname() {
		when(this.service.getUserByFirstname("Firstname")).thenReturn(user);
		assertEquals(user, service.getUserByFirstname(user.getFirstname()));
	}
	
	@Test
	public void testgetUserByLastname() {
		when(this.service.getUserByLastname("Lastname")).thenReturn(user);
		assertEquals(user, service.getUserByLastname(user.getLastname()));
	}
	
	@Test
	public void testgetUserByCodename() {
		when(this.service.getUserByCodename("Codename")).thenReturn(user);
		assertEquals(user, service.getUserByCodename(user.getCodename()));
	}
	
	@Test
	public void testgetUserByUsername() {
		when(this.service.getUserByUsername("Username")).thenReturn(user);
		assertEquals(user, service.getUserByUsername(user.getUsername()));
	}
	
	@Test
	public void testgetUserByEmail() {
		when(this.service.getUserByEmail("Email")).thenReturn(user);
		assertEquals(user, service.getUserByEmail(user.getEmail()));
	}
	
	@Test
	public void testgetUserbyId() {
		
	}
	
	@Test
	public void testverifyPassword() {
		
	}
	
//	@Test
//	public void testfindAllBountyHunters() throws Exception{
//		List<User> bList = new ArrayList<User>();
//		bList.add(user);
//		when(this.uServ.findAllBountyHunters()).thenReturn(bList);
//		this.mock.perform(get("/all").contentType(MediaType.APPLICATION_JSON))
//		.andExpect(status().isOk())
//		.andExpect(jsonPath("$[0].firstname", is(user.getFirstname())))
//		.andExpect(jsonPath("$[0].lastname", is(user.getLastname())))
//		.andExpect(jsonPath("$[0].username", is(user.getUsername())))
//		.andExpect(jsonPath("$[0].password", is(user.getPassword())))
//		.andExpect(jsonPath("$[0].email", is(user.getEmail())))
//		.andExpect(jsonPath("$[0].codename", is(user.getCodename())))
//		.andExpect(jsonPath("$[0].rank", is(user.getRank())))
//		.andExpect(jsonPath("$[0].account", is(user.getAccount())));
//	}
//		
//	@Test
//	public void testfindTopTen() throws Exception{
//		List<User> bList = new ArrayList<User>();
//		bList.add(user);
//		when(this.uServ.findAllBountyHuntersRanked()).thenReturn(bList);
//		when(this.uServ.findAllBountyHuntersRanked()).thenReturn(bList);
//		this.mock.perform(get("/rank").contentType(MediaType.APPLICATION_JSON))
//		.andExpect(status().isOk())
//		.andExpect(jsonPath("$[0].firstname", is(user.getFirstname())))
//		.andExpect(jsonPath("$[0].lastname", is(user.getLastname())))
//		.andExpect(jsonPath("$[0].username", is(user.getUsername())))
//		.andExpect(jsonPath("$[0].password", is(user.getPassword())))
//		.andExpect(jsonPath("$[0].email", is(user.getEmail())))
//		.andExpect(jsonPath("$[0].codename", is(user.getCodename())))
//		.andExpect(jsonPath("$[0].rank", is(user.getRank())))
//		.andExpect(jsonPath("$[0].account", is(user.getAccount())));
//	}

	
	
	
	
}
