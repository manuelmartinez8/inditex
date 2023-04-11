package com.indra;

import com.indra.adapter.request.PricesRequest;
import com.indra.domain.model.PricesEntity;
import com.indra.domain.service.PricesServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringBootJpaH2ApplicationTests {

	@Autowired
	PricesServiceImpl impl;
	LocalDateTime startDaterRequest = LocalDateTime.parse("2020-07-14T00:00:00");
	LocalDateTime startDate01 = LocalDateTime.parse("2020-06-14T00:00:00");
	LocalDateTime end_dateRequest = LocalDateTime.parse("2020-11-30T23:59:59");
	LocalDateTime end_date1 = LocalDateTime.parse("2020-12-31T23:59:59");
	PricesRequest pricesRequest = new PricesRequest(1,startDaterRequest,end_dateRequest,"1", 35455,"0",new BigDecimal(36.50),"EUR");
	PricesEntity pricesEntity = new PricesEntity(1, startDate01, end_date1,35455, "1", new BigDecimal(36.50), "EUR","1");
	@Test
	void contextLoads() {
	}

	@Test
	public void productoTest() {
		assertEquals(0, 0);
	}

	@Test
	public void ComparatorTest() {

		assertEquals(true, impl.comparateDate(pricesEntity, pricesRequest));

	}



}
