package com.imit.learningselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PaymentGateway {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Binary/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/payment-gateway/purchasetoy.php");
		//driver.findElement(By.xpath("//nav[@id='nav']/a[2]")).click();
		//Thread.sleep(2000);
		Select quantity= new Select(driver.findElement(By.name("quantity")));
		quantity.selectByVisibleText("4");
		driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
		driver.findElement(By.id("card_nmuber")).sendKeys("4490940770211098");
		driver.findElement(By.id("month")).sendKeys("01");
		driver.findElement(By.id("year")).sendKeys("2021");
		driver.findElement(By.id("cvv_code")).sendKeys("618");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
