package com.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\INAVENKA\\eclipse-workspace\\com.assignments\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.bing.com/#! ");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("image")).click();
		List <WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("The number of links" +links.size());
		
		driver.findElement(By.name("q")).sendKeys("Capgemini");
		driver.findElement(By.id("Submit")).click();
		
		
		driver.quit();
		
		
		

	}

}
