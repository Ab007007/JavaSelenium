package com.synechron.java.files;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	
	public static void main(String[] args) {
		
		File f = new File("files/newFile.txt");
		try
		{
			if(!f.exists())
			{
				f.createNewFile();
				System.out.println("New File is created!!!");
			}
			else
				System.out.println("File Already Exist");
			
			
			System.out.println("Absolute File path " + f.getAbsolutePath());
			
			System.out.println("File Execute Permission " + f.canExecute());

			System.out.println("File Read Permission " + f.canRead());
			
			System.out.println("File Write Permission " + f.canWrite());
			
			System.out.println("List all files and folders in c drive");
			
			File f1 =  new File("C:\\");
			File[] files = f1.listFiles();
			
			for (File file : files) 
			{
				if(file.isFile())
					System.out.println("File : " + file.getName());
				else
					System.out.println("Directory : " + file.getName());
			}
			
		}
		catch(IOException ioex)
		{
			ioex.printStackTrace();
		}
		
	}
}
