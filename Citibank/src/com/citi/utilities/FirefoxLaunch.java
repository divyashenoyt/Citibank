package com.citi.utilities;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	
	public static void main(String[] args) {
	
		
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://opensource.demo.orangehrm.com");

	}

}
