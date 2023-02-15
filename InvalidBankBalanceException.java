package com.icici;

public class InvalidBankBalanceException extends Exception {
	
	private String message;
	
	InvalidBankBalanceException(String message){
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}
 
}
