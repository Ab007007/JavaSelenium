package com.synechron.java.exceptions;

public class UncheckedExcceptiondDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Started");
		String str= null;
		try
		{
			System.out.println("Length of the String : " + str.length());
		}
		catch(NullPointerException ex)
		{
			System.out.println("Exception : " + ex.getMessage());
			System.out.println("Exception : String seesms to be null... please check the string");
		}
		System.out.println("Main Ended");
	}

}
