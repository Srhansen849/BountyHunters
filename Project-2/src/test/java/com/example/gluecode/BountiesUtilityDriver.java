package com.example.gluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BountiesUtilityDriver {
	
	public static WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://localhost:4200");
	}
	
	@After
	public void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}

}
