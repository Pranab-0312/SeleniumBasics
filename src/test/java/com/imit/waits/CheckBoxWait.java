package com.imit.waits;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CheckBoxWait {
	@Test
	public void CheckBoxDemo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Binary/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.findElement(By.id("checkbox")).click();
		Thread.sleep(11000);
		driver.findElement(By.id("ch")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	
}
