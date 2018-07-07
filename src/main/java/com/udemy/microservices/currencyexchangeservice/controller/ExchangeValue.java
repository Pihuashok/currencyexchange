package com.udemy.microservices.currencyexchangeservice.controller;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
public class ExchangeValue {

	@Id
	private long Id;
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	@Column(name="currency_decimal")
	private BigDecimal dec;
	private int port;
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public ExchangeValue(long id, String from, String to, BigDecimal dec) {
		super();
		Id = id;
		this.from = from;
		this.to = to;
		this.dec = dec;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public ExchangeValue() {
		super();
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getDec() {
		return dec;
	}
	public void setDec(BigDecimal dec) {
		this.dec = dec;
	}
}