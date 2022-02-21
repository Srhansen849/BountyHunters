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
import com.example.model.Host;
import com.example.model.User;
import com.example.service.HostService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(UserController.class)
public class HostControllerTest {
	
	@MockBean
	HostService hServ;
	
	@Autowired
	MockMvc mock;
	
	Host host;
	
	@BeforeEach
	public void setUp() throws Exception{
		host = new Host("Jabba", "Tiure", "TheHutt1", "D3si1ijic", "JabbTheHutt@StarHunter.com",
				"Grand Hutt Council", "Eminence of Tatooine", "JabbaTheHutt");
		doNothing().when(this.hServ).insertHost(host);
	}
		
	@Test
	public void insertInitalValues() throws Exception {
		
	}
		
	@Test
	public void HostLogin() throws Exception {
		
	}
	
	@Test
	public void updateProfile() throws Exception {

	}
	
//	@Test
//	public void getProfileInfo() throws Exception {
//		List<Host> hList = new ArrayList<Host>();
//		bList.add(host);
//		when(this.hServ.getProfileInfo()).thenReturn(hList);
//		when(this.hServ.getProfileInfo()).thenReturn(hList);
//		this.mock.perform(get("/profileinfo").contentType(MediaType.APPLICATION_JSON))
//		.andExpect(status().isOk())
//		.andExpect(jsonPath("$[0].firstname", is(host.getFirstname())))
//		.andExpect(jsonPath("$[0].lastname", is(host.getLastname())))
//		.andExpect(jsonPath("$[0].username", is(host.getUsername())))
//		.andExpect(jsonPath("$[0].password", is(host.getPassword())))
//		.andExpect(jsonPath("$[0].email", is(host.getEmail())))
//		.andExpect(jsonPath("$[0].association", is(host.getAssociation())))
//		.andExpect(jsonPath("$[0].representative", is(host.getRepresentative())))	
//		.andExpect(jsonPath("$[0].codename", is(host.getCodename())));
//	}
	
	@Test
	public void createNewHost() throws Exception {
		
	}

	

}
