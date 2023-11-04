package com.imit.learningselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FormBot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prana\\eclipse-workspace\\SeleniumBasics\\Binary\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://form-bot-anvsystems.pages.dev/");
		driver.findElement(By.name("firstname")).sendKeys("Pranab");
		driver.findElement(By.name("lastname")).sendKeys("Dash");
		driver.findElement(By.name("email")).sendKeys("test@mail.com");
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.name("phone")).sendKeys("123456789");
		Select s = new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("India");
		//driver.findElement(By.name("country")).sendKeys("India");
		driver.findElement(By.name("programming")).click();
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
