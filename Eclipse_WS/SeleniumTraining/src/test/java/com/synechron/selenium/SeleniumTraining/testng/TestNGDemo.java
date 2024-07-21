package com.synechron.selenium.SeleniumTraining.testng;

import org.testng.annotations.Test;

public class TestNGDemo {
	
	@Test
	public void launch()
	{
		
	}

	
	@Test(dependsOnMethods  = "launch")
	public void login()
	{
		
	}
	
	@Test(dependsOnMethods = {"login"})
	public void createCustomer()
	{
		
	}
	@Test(dependsOnMethods = {"login","createCustomer"})
	public void logout()
	{
		
	}


}
