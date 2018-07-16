package com.bank.reports;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bank.model.Currency;
import com.bank.model.Trade;

public class TradeTest {
	
	private Trade t;
	
	@Before
	public void before(){
		this.t= new Trade();
	}
	
	@Test
	public void dateOfTradeTest(){
		Currency cur = new Currency("USD",0);
		this.t.setCur(cur);
		this.t.setSettlementDate("13 Jul 2018");
		assertEquals("13 Jul 2018",this.t.getSettlementDate());
		this.t.setCur(new Currency("SAR",0.10));
		this.t.setSettlementDate("12 Jul 2018");
		assertEquals("12 Jul 2018",this.t.getSettlementDate());
		this.t.setCur(new Currency("AED",0.10));
		this.t.setSettlementDate("12 Jul 2018");
		assertEquals("12 Jul 2018",this.t.getSettlementDate());
	}
	
}
