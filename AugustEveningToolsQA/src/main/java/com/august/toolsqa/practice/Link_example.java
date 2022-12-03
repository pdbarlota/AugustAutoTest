package com.august.toolsqa.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_example {

	public static void main(String[] args) {
		//step 1 -> Register the driver 
				System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");

				//Step 2- Create object of the class 
				ChromeDriver driver=new ChromeDriver(); //browser will get 
				
				//step 3 -
				driver.navigate().to("https://demoqa.com/links");
			
				driver.manage().window().maximize();
				
				WebElement HomeLink=driver.findElement(By.partialLinkText("Home"));
				
				HomeLink.click();

	}

}
