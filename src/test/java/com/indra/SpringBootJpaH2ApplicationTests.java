package com.indra;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.indra.adapter.request.PricesReq;
import com.indra.adapter.response.PricesResponse;
import com.indra.adapter.rest.PricesController;
import com.indra.domain.model.PricesEntity;
import com.indra.domain.service.IPricesService;
import com.indra.domain.service.PricesServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;



@SpringBootTest
class SpringBootJpaH2ApplicationTests {

	@Autowired
	PricesServiceImpl impl;
	@Autowired
	PricesController controller;



	@Autowired
	IPricesService service;

	//fecha de aplicacion de la oferta
	LocalDateTime appDateRequest = LocalDateTime.parse("2020-07-14T00:00:00");
	LocalDateTime startDate01 = LocalDateTime.parse("2020-06-14T00:00:00");

/*
* El siguiente test simula la ejecucion del controller lo que envia y deberia recibir.
* Me disculpo de ante mano por no testear otros metodos pero por motivos de tiempo no pude.
*
* */
	@Test
	public void testController() {
		PricesReq request = new PricesReq(1,35455,appDateRequest);
		List<PricesResponse> listExpect = new ArrayList<>();
		PricesResponse responseExpect = new PricesResponse();

		responseExpect.setProductId(35455);
		responseExpect.setBrandId(1);
		responseExpect.setPricefinal(new BigDecimal("36.50"));
		responseExpect.setDateApplication(startDate01);
		responseExpect.setRate("1");
		listExpect.add(responseExpect);
		List<PricesResponse> list = impl.getPrice(request);
		assertEquals(listExpect, list);
	}





}
