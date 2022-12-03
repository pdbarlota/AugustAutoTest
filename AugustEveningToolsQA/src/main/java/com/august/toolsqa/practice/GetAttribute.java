package com.august.toolsqa.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");

		//Step 2- Create object of the class 
		ChromeDriver driver=new ChromeDriver(); //browser will get 
		
		//step 3 -
		driver.navigate().to("https://www.myntra.com/login?referer=https://www.myntra.com/");
	
		driver.manage().window().maximize();
		
		WebElement mobileNumbertxt=driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
				mobileNumbertxt.sendKeys("12345");
		
		System.out.println(mobileNumbertxt.getAttribute("value"));
		
		if (mobileNumbertxt.getAttribute("value").length()>0) {
			System.out.println("test case is pass");
		} else {
			System.out.println("test case is failed");
		}

	}

}
