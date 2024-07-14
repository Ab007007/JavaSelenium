package com.synechron.java.files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo {

	
	public static void main(String[] args) {
		
		FileWriter fw = null;
		try
		{
			fw = new FileWriter("files//newFile.txt",true);
			fw.write("I'm writing from java program\n");
		}
		catch(IOException ex)
		{
			System.out.println("Exception while writing to file!!!");
		}
		finally {
			try 
			{
				fw.close();
			}
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
