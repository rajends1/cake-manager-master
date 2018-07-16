package java.com.bank.model;

import com.bank.service.ITradeType;

/**
 * Class to define a bean of trade types to define if a trade is an incoming or outgoing
 * @author Suraj Rajendran
 *
 */
public class TradeType implements ITradeType {

	public TradeType(){
		
	}
	
	public TradeType(TypeOfTrade t){
		this.tradeType = t;
	}
	
	public enum TypeOfTrade {
	       S,B;
	};

	private TypeOfTrade tradeType;

	public TypeOfTrade getTradeType() {
		return tradeType;
	}

	public void setTradeType(TypeOfTrade tradeType) {
		this.tradeType = tradeType;
	}   
	
}
