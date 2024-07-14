package com.synechron.java.string;

import java.util.Iterator;

public class StringPrograms {
	
	public static void main(String[] args) {
		String str = "Hello Everyone, How are you doing today";
		
		String alphaNumeric = "abc1234sdasf222";
		System.out.println("\n----------------String Reverse------------");
		reverseString(str);
	
		System.out.println("\n----------------Word Reverse------------");
		wordReverse(str);
		
		System.out.println("\n----------------Extract Char------------");
		extractCharFromAString(alphaNumeric);
		
		System.out.println("\n----------------Extract and sum Char-----------");
		extractAndSumDigits(alphaNumeric);
		
	}


	private static void extractAndSumDigits(String alphaNumeric) {
		char ch;
		int sum = 0;
		for (int i = 0; i < alphaNumeric.length(); i++)
		{
			ch = alphaNumeric.charAt(i);
			if(Character.isDigit(ch))
			{
				sum+= Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of digits in a given string " + sum);
	}


	private static void extractCharFromAString(String alphaNumeric) {
		char ch;
		for (int i = 0; i < alphaNumeric.length(); i++)
		{
			ch = alphaNumeric.charAt(i);
			if(Character.isDigit(ch))
			{
				System.out.println(ch);
			}
		}
	}


	private static void wordReverse(String str) {
		String[] wordrev = str.split(" ");
		
		for (int i = 0; i < wordrev.length; i++) 
		{
			reverseString(wordrev[i]);
			System.out.print(" ");
		}
	}


	private static void reverseString(String str) {
		for (int i = str.length()-1; i >= 0 ; i--) 
		{
			System.out.print(str.charAt(i));
		}
		
	}
	
	
	
}
