package com.synechron.java.exceptions;

public class InsufficientBalanceException extends Exception
{
	
	public InsufficientBalanceException() {
		System.out.println("Insufficient Balance ");
	}

	
	public InsufficientBalanceException(double balance)
	{
		System.out.println("Your account balance is " + balance + " please withdraw with in the balance" );
	}
	
	
	@Override
	public String getMessage() {
		
		return "Account balance is too low!!!!";
	}
}
