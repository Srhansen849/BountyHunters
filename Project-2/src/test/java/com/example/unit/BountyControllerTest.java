package com.example.unit;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.example.controller.UserController;
import com.example.model.Bounty;
import com.example.service.BountyService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(UserController.class)
public class BountyControllerTest {
	
	@MockBean
	BountyService bServ;
	
	@Autowired
	MockMvc mock;
	
	Bounty bounty;
	
	

}
