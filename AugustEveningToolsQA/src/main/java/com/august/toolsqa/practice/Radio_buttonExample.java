package com.august.toolsqa.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_buttonExample {

	public static void main(String[] args) {
		//step 1 -> Register the driver 
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");

		//Step 2- Create object of the class 
		ChromeDriver driver=new ChromeDriver(); //browser will get 
		
		//step 3 -
		driver.navigate().to("https://demoqa.com/radio-button");
	
		driver.manage().window().maximize();
		
		WebElement impressiveRadioBtn=driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
		
		impressiveRadioBtn.click();

	}

}
