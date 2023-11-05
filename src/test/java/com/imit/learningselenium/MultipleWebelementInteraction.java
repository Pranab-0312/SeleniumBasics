package com.imit.learningselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebelementInteraction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Binary/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://form-bot-anvsystems.pages.dev/");
		List<WebElement> elements = driver.findElements(By.xpath("//form/label[7]/label"));
		for(int i= 0;i<elements.size();i++) {
			String elementText= elements.get(i).getText();
			//System.out.println(elementText); // For printing al the text elements
			if(elementText.contains("Python")) {
				System.out.println("Passed!!");
				break;
			}
		}
		driver.quit();
	}

}
