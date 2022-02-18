package com.example.unit;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.example.controller.UserController;
import com.example.model.Host;
import com.example.service.HostService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(UserController.class)
public class HostControllerTest {
	
	@MockBean
	HostService bServ;
	
	@Autowired
	MockMvc mock;
	
	Host host;
	
	

}
