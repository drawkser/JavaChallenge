package AccountWorld;

import java.util.Date;

public class CreditCard extends PaymentMethod{
	
/*
 * Attributes, the number attribute 
 * is an integer type because card numbers are always integers.
 */
	private int number;
	private Date expDate;
	private int maxInstallements;
	private Issuer issuer;
	
/*
 *  Methods 
 */
	
	public CreditCard(){
		
	}
	
	public void authorize()
	{
		
	}

}
