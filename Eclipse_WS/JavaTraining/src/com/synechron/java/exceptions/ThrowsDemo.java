package com.synechron.java.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo 
{

	
	public static void readFile(String name) throws FileNotFoundException, IOException
	{
		File f = new File(name);
		FileInputStream fis = new FileInputStream(f);
		fis.read();
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main Started here");
		try
		{
			readFile("files//abcd.txt");
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("Exception : " + ex.getMessage());
			System.out.println("Exception : File does not exist");
		}
		catch(IOException ex)
		{
			System.out.println("Exception : Error while reading file");
		}
		
		
		System.out.println("Main Ended here");
		
	}
	
	
	
	

}
