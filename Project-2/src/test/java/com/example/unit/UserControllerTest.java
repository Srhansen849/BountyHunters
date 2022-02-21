package com.example.unit;

import static org.hamcrest.CoreMatchers.is;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.example.controller.UserController;
import com.example.model.Account;
import com.example.model.Asset;
import com.example.model.User;
import com.example.service.UserService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {
	
	@MockBean
	UserService uServ;
	
	@Autowired
	MockMvc mock;
	
	User user;
	Account account;
	Asset asset;
	List<Asset> bList = new ArrayList<Asset>();
	
	
	@BeforeEach
	public void setUp() throws Exception{
		user = new User("Boba", "Fett", "AlphaFett1", "M4nd410ri4n",
				"BobaFett1@StarHunter.com", "Alpha", 1, account);
		asset = new Asset("Republic credit", 63.5, account);
		account = new Account();
		List<Asset> List= new ArrayList<Asset>();
		doNothing().when(this.uServ).insertUser(user);	
	}
	

	
//	insertInitalValues
	
	@Test
	public void testfindAllBountyHunters() throws Exception{
		List<User> bList = new ArrayList<User>();
		bList.add(user);
		when(this.uServ.findAllBountyHunters()).thenReturn(bList);
		this.mock.perform(get("/all").contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$[0].firstname", is(user.getFirstname())))
		.andExpect(jsonPath("$[0].lastname", is(user.getLastname())))
		.andExpect(jsonPath("$[0].username", is(user.getUsername())))
		.andExpect(jsonPath("$[0].password", is(user.getPassword())))
		.andExpect(jsonPath("$[0].email", is(user.getEmail())))
		.andExpect(jsonPath("$[0].codename", is(user.getCodename())))
		.andExpect(jsonPath("$[0].rank", is(user.getRank())))
		.andExpect(jsonPath("$[0].account", is(user.getAccount())));
	}
		
	@Test
	public void testfindTopTen() throws Exception{
		List<User> bList = new ArrayList<User>();
		bList.add(user);
		when(this.uServ.findAllBountyHuntersRanked()).thenReturn(bList);
		when(this.uServ.findAllBountyHuntersRanked()).thenReturn(bList);
		this.mock.perform(get("/rank").contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$[0].firstname", is(user.getFirstname())))
		.andExpect(jsonPath("$[0].lastname", is(user.getLastname())))
		.andExpect(jsonPath("$[0].username", is(user.getUsername())))
		.andExpect(jsonPath("$[0].password", is(user.getPassword())))
		.andExpect(jsonPath("$[0].email", is(user.getEmail())))
		.andExpect(jsonPath("$[0].codename", is(user.getCodename())))
		.andExpect(jsonPath("$[0].rank", is(user.getRank())))
		.andExpect(jsonPath("$[0].account", is(user.getAccount())));
	}
	
	@Test
	public void testbountyHunterLogin() throws Exception{
		
	}
	
	@Test
	public void testupdateProfile() throws Exception{
		
	}
	
//	@Test
//	public void testgetProfileInfo() throws Exception{
//		List<User> bList = new ArrayList<User>();
//		bList.add(user);
//		when(this.uServ.testgetProfileInfo()).thenReturn(bList);
//		when(this.uServ.testgetProfileInfo()).thenReturn(bList);
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
	
	@Test
	public void testcreateNewUser() throws Exception{
		
	}
	
		
	
	
	

//	createNewUser	
}
