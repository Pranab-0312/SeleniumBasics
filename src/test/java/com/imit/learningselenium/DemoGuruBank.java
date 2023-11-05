package com.imit.learningselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGuruBank {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Binary/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v2/");
		driver.findElement(By.name("uid")).sendKeys("mngr537299");
		driver.findElement(By.name("password")).sendKeys("zurajUn");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}
}
