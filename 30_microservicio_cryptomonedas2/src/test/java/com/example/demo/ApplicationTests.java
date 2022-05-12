package com.example.demo;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import service.CriptomonedaService;
 

@TestPropertySource("classpath:application.properties")

@SpringBootTest
class ApplicationTests {
	@Autowired
	CriptomonedaService criptomonedaService;

	@Test
	void testCriptomoneda() {
		assertEquals(1, criptomonedaService.recuperarCriptomoneda("Bitcoin").size());
		assertTrue(criptomonedaService.recuperarCriptomoneda("alguna").size()==0);
	}

	@Test
	void testTodasCriptomonedas() {
		assertEquals(9, criptomonedaService.recuperarCriptomonedas().size());
	}
	
	
	
}

