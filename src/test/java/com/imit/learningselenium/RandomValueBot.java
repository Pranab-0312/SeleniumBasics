package com.imit.learningselenium;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class RandomValueBot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Binary/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://form-bot-anvsystems.pages.dev/");
		//for(int i=0; i<10; i++) {
			driver.findElement(By.name("firstname")).sendKeys(UUID.randomUUID().toString().substring( 0, 8));
			driver.findElement(By.name("lastname")).sendKeys(UUID.randomUUID().toString().substring( 0, 8));
			driver.findElement(By.name("email")).sendKeys(UUID.randomUUID().toString().substring( 0, 8)+ "@test.com");
			//driver.findElement(By.name("gender")).click();
			driver.findElement(By.xpath("//input[@value='female']")).click(); //relative xpath
			driver.findElement(By.name("phone")).sendKeys(UUID.randomUUID().toString().substring( 0, 10));
			Select s = new Select(driver.findElement(By.name("country")));
			s.selectByVisibleText("India");
			driver.findElement(By.name("programming")).click();
			driver.findElement(By.xpath("/html/body/div/div/form/label[7]/label[2]")).click(); //absolute xpath(not recommended)
			driver.findElement(By.xpath("//input[@value='Java']")).click(); //relative xpath
			driver.findElement(By.tagName("button")).click();
			
		//}
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
