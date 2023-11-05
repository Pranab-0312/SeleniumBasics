package com.imit.learningselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UIinteraction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Binary/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.id("search2")).sendKeys("html");
		//driver.findElement(By.id("search2")).sendKeys(Keys.ENTER);
		
		Actions actions =new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[@title='Tutorials and References']")))
		.build()
		.perform();
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("//h5[text()='Get Certified']")) );
		Thread.sleep(5000);
		driver.quit();
	}

}
