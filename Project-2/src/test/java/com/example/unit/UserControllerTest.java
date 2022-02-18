package com.example.unit;

import static org.mockito.Mockito.doNothing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.example.controller.UserController;
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
	
	@BeforeEach
	public void setUp() throws Exception{
		user = new User(1, "Firstname", "Lastname", "Username", "Password",
				"email", "Codename", "SOMETHING", [1], 1);
		doNothing().when(this.uServ).insertUser(user);
		
	
		
		
	}
	
	
	
	
	

}
