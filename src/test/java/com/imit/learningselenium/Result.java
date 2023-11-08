package com.imit.learningselenium;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Result {
		 public static void main(String[] args) throws InterruptedException, IOException {
				System.setProperty("webdriver.chrome.driver", "./Binary/chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get("http://bputexam.in/studentsection/resultpublished/studentresult.aspx");
				Long i;
				Select exam= new Select(driver.findElement(By.id("ddlSession")));
				exam.selectByValue("36");
				driver.findElement(By.id("dpStudentdob_dateInput")).sendKeys("1/1/2019");
				for(i=2205102001L; i<2205102116L; i++) {
					driver.findElement(By.id("txtRegNo")).sendKeys(Long.toString(i));
				driver.findElement(By.id("btnView")).click();
				driver.findElement(By.id("gvResultSummary_ctl02_lnkViewResult")).click();
				JavascriptExecutor js = ((JavascriptExecutor)driver);
				js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("//th[text()='Grade']")) );
				Thread.sleep(2000);
				driver.findElement(By.id("btnReset")).click();
			    WebElement element= driver.findElement(By.id("txtRegNo"));
				element.clear();
				
				}
				 driver.quit();
}
		
}