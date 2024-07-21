package com.synechron.selenium.SeleniumTraining.testng;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups = "smoke")
	public void launch()
	{
		
	}

	
	@Test(groups = {"smoke" , "regression"})
	public void login()
	{
		
	}
	
	@Test(groups = {"smoke" , "regression"})
	public void createCustomer()
	{
		
	}
	@Test(groups = {"sanity" , "regression"})
	public void logout()
	{
		
	}


}
