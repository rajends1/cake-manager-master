package com.bank.reports;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bank.model.TradeType;

public class TradeTypeTest {

	private TradeType tt;
	
	@Before
	public void before(){
		this.tt = new TradeType(TradeType.TypeOfTrade.B);
	}
	
	@Test
	public void test() {
		assertEquals(TradeType.TypeOfTrade.B,this.tt.getTradeType());
		this.tt.setTradeType(TradeType.TypeOfTrade.S);
		assertEquals(TradeType.TypeOfTrade.S,this.tt.getTradeType());
	}

}
