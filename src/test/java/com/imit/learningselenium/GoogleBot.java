package com.imit.learningselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleBot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prana\\eclipse-workspace\\SeleniumBasics\\Binary\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.google.com"); //Website url to visit
		driver.findElement(By.name("q")).sendKeys("https://www.amazon.in"); //By.name used for google searchbox & sendKeys for input text
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.className("VuuXrf")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
	}

}
