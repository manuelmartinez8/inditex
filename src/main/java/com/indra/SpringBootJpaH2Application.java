package com.indra;

import com.indra.adapter.request.PricesRequest;
import com.indra.configuration.PricesConverter;
import com.indra.domain.model.BrandEntity;
import com.indra.domain.repository.BrandRepository;
import com.indra.domain.repository.PricesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@ComponentScan(basePackages = {"com.indra.domain.service", "com.indra.adapter.rest"})
@SpringBootApplication
public class SpringBootJpaH2Application {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootJpaH2Application.class, args);
		System.out.println("INICIO LA EJECUCION" );
	}

	@Bean
	public CommandLineRunner saveData(PricesRepository repository, BrandRepository brandRepository){
	return  (args)->{
		LocalDateTime now = LocalDateTime.now();

		BrandEntity brand = new BrandEntity(1, "ZARA");
		brandRepository.save(brand);


		LocalDateTime startDate1 = LocalDateTime.parse("2020-06-14T00:00:00");
		LocalDateTime startDate2 = LocalDateTime.parse("2020-06-14T15:00:00");
		LocalDateTime startDate3 = LocalDateTime.parse("2020-06-15T00:00:00");
		LocalDateTime startDate4 = LocalDateTime.parse("2020-06-15T16:00:00");

		LocalDateTime end_date1 = LocalDateTime.parse("2020-12-31T23:59:59");
		LocalDateTime end_date2 = LocalDateTime.parse("2020-06-14T18:30:00");
		LocalDateTime end_date3 = LocalDateTime.parse("2020-06-15T11:00:00");
		LocalDateTime end_date4 = LocalDateTime.parse("2020-12-31T23:59:59");

		PricesRequest prices1 = new PricesRequest(1,startDate1,end_date1,"1", 35455,"0",new BigDecimal(36.50),"EUR");
		PricesRequest prices2 = new PricesRequest(1,startDate2,end_date2,"2", 35455,"1",new BigDecimal(25.45),"EUR");
		PricesRequest prices3 = new PricesRequest(1,startDate3,end_date3,"3", 35455,"1",new BigDecimal(30.50),"EUR");
		PricesRequest prices4 = new PricesRequest(1,startDate4,end_date4,"4", 35555,"1",new BigDecimal(38.95),"EUR");

		repository.save(PricesConverter.priceRequestToEntity(prices1));
		repository.save(PricesConverter.priceRequestToEntity(prices2));
		repository.save(PricesConverter.priceRequestToEntity(prices3));
		repository.save(PricesConverter.priceRequestToEntity(prices4));
	};

	}

}
