package com.synechron.java.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsDemo 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Main Started here");
	
		try
		{
			File f = new File("files//newException.txt");

			FileInputStream fis = new FileInputStream(f);
			
			fis.read();
			
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("Exception : File does not exist");
		}
		catch(IOException ex)
		{
			System.out.println("Exception : Error while reading file");
		}
		
		
		System.out.println("Main Ended here");
		
	}
	
	
	
	

}
