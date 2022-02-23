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
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.example.controller.UserController;
import com.example.dao.UserDAO;
import com.example.model.Account;
import com.example.model.Asset;
import com.example.model.User;
import com.example.service.AssetService;
import com.example.service.UserService;

@ExtendWith(SpringExtension.class) //this allows the test to run with the IoC Container (application context)
@WebMvcTest(UserController.class) //this allows us to mock MVC request to the foodcontroller 
public class UserServiceTest {
	
	Account account;
	User user;
	Asset asset;
	List<Asset> bList = new ArrayList<Asset>();
	
	@MockBean
	UserService service;
	
	@MockBean
	AssetService aservice;
	
	@Autowired
	MockMvc mock;
	
	@BeforeEach
	public void setUp() throws Exception{
		user = new User("Boba Fett", "AlphaFett1", "M4nd410ri4n", "BobaFett1@StarHunter.com", account);
		asset = new Asset("Republic credit", 63.5, account);
		account = new Account();
		bList = new ArrayList<Asset>();
//		doNothing().when(this.service).insertUser(user);	
	}
		
	@Test
	public void testgetUserByHuntername() {
		when(this.service.getUserByHuntername("Boba Fett")).thenReturn(user);
		assertEquals(user, service.getUserByHuntername(user.getHuntername()));
	}
	
	@Test
	public void testgetUserByUsername() {
		when(this.service.getUserByUsername("AlphaFett1")).thenReturn(user);
		assertEquals(user, service.getUserByUsername(user.getUusername()));
	}
	
	@Test
	public void testgetUserByEmail() {
		when(this.service.getUserByEmail("BobaFett1@StarHunter.com")).thenReturn(user);
		assertEquals(user, service.getUserByEmail(user.getUemail()));
	}
	
	@Test
	public void testverifyPassword() {
		when(this.service.verifyPassword("AlphaFett1", "M4nd410ri4n")).thenReturn(user);
		assertEquals(user, service.verifyPassword(user.getUusername(), user.getUpassword()));
	}

	@Test
	public void testfindAllBountyHunters() throws Exception{
		List<User> bList = new ArrayList<User>();
		bList.add(user);
		when(this.service.findAllBountyHunters()).thenReturn(bList);
		this.mock.perform(get("/hunter/all").contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$[0].huntername", is(user.getHuntername())))
		.andExpect(jsonPath("$[0].uusername", is(user.getUusername())))
		.andExpect(jsonPath("$[0].upassword", is(user.getUpassword())))
		.andExpect(jsonPath("$[0].uemail", is(user.getUemail())));
	}
	
	
	
	
}
