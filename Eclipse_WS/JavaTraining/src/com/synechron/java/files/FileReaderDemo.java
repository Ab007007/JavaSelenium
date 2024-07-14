package com.synechron.java.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	
	public static void main(String[] args) {
		FileReader fr =null;
		BufferedReader br =null;
		String line = null;
		try
		{
			fr = new FileReader("files//newFile.txt");
			br = new BufferedReader(fr);
			
			while((line = br.readLine()) != null)
			{
				System.out.println(line);
			}
		}
		catch(FileNotFoundException fnfex)
		{
			System.out.println("Exception while reading file ");
		}
		catch(IOException ioex)
		{
			System.out.println("Exception while reading from file");
		}
		finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
