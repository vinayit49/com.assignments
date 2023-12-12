package com.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
	}

}
