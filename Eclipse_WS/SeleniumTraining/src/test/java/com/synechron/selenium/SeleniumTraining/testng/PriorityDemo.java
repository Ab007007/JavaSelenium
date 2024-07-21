package com.synechron.selenium.SeleniumTraining.testng;

import org.testng.annotations.Test;

public class PriorityDemo {
	
	@Test(priority = 0)
	public void launch()
	{
		
	}

	
	@Test(priority = 1)
	public void login()
	{
		
	}
	
	@Test(priority = 2)
	public void createCustomer()
	{
		
	}
	@Test(priority = 3)
	public void logout()
	{
		
	}


}
