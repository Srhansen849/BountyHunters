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
import com.example.service.AssetService;
import com.example.service.UserService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {
	
	@MockBean
	UserService uServ;
	
	@MockBean
	AssetService aServ;
	
	@Autowired
	MockMvc mock;
	
	User user;
	Account account;
	Asset asset;
	List<Asset> bList = new ArrayList<Asset>();
	
	
	@BeforeEach
	public void setUp() throws Exception{
		user = new User("Boba Fett", "AlphaFett1", "M4nd410ri4n", "BobaFett1@StarHunter.com", account);
		asset = new Asset("Republic credit", 63.5, account);
		account = new Account();
		List<Asset> List= new ArrayList<Asset>();
		doNothing().when(this.uServ).insertUser(user);	
	}
	
	@Test
	public void testfindAllBountyHunters() throws Exception{
		List<User> bList = new ArrayList<User>();
		bList.add(user);
		when(this.uServ.findAllBountyHunters()).thenReturn(bList);
		this.mock.perform(get("/hunter/all").contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$[0].huntername", is(user.getHuntername())))
		.andExpect(jsonPath("$[0].uusername", is(user.getUusername())))
		.andExpect(jsonPath("$[0].upassword", is(user.getUpassword())))
		.andExpect(jsonPath("$[0].uemail", is(user.getUemail())));
	}
		
	@Test
	public void testbountyHunterLogin() throws Exception{
		
	}
	
	@Test
	public void testupdateProfile() throws Exception{
		
	}
	
	@Test
	public void testgetProfileInfo() throws Exception{
		
	}
	
	@Test
	public void testcreateNewUser() throws Exception{
		
	}
	
		
	
	
	
}
