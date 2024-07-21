package com.synechron.selenium.SeleniumTraining.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtils {
	public WebDriver driver = null;

	public WebDriver getDriver() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		return driver;

	}

	public WebDriver getDriver(String type) {
		switch (type) {
		case "chrome": {

			driver = new ChromeDriver();
			break;
		}

		case "ff": {

			driver = new FirefoxDriver();
			break;
		}

		case "edge": {

			driver = new EdgeDriver();
			break;
		}

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		return driver;

	}

}
