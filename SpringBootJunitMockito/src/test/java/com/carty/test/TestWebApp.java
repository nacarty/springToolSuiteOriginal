package com.carty.test;

import org.junit.Before;
import org.junit.Test;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class TestWebApp extends SpringBootJunitMockitoApplicationTests{

	@Autowired
	private WebApplicationContext webApplicationContext;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		
	}
	
	@Test
	public void testEmployee() throws Exception{
		mockMvc.perform(get("/employee")).andExpect(status().isOk())
		.andExpect(content().contentType("application/json")) //we removed charset=UTF-8 from the content type
		.andExpect(jsonPath("$.name").value("Olivier"))
		.andExpect(jsonPath("$.designation").value("Team Lead"))
		.andExpect(jsonPath("$.salary").value(3000))
		.andExpect(jsonPath("$.empId").value("100"));
	}
}
