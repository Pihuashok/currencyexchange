package com.udemy.microservices.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.microservices.currencyexchangeservice.repository.ExchangeValueRepository;

@RestController
public class CurrencyController {
	
	@Autowired
	private Environment env;
	
	@Autowired
	ExchangeValueRepository repository;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable String from, @PathVariable String to){
		
		//ExchangeValue exchangeValue = new ExchangeValue(1000L, from, to, BigDecimal.valueOf(65));
		
		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		 return exchangeValue;
	
	}
	
	
	public void test(){
		System.out.println("Working ");
	}
	
	public void test2(){
		System.out.println("Working ");
	}
}
