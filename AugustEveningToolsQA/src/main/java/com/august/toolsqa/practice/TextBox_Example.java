package com.august.toolsqa.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox_Example {

	public static void main(String[] args) {
		//step 1 -> Register the driver 
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");

		//Step 2- Create object of the class 
		ChromeDriver driver=new ChromeDriver(); //browser will get 
		
		//step 3 -
		driver.get("https://demoqa.com/text-box");
		
		//we have to pass address of fullname textbox and then we have to perform operation
		
		//8 ways id name classname linked partilli xpath css tagname
		
		WebElement fullNametxt=driver.findElement(By.id("userName-label"));
		
		System.out.println(fullNametxt.getText());
		//textarea[@class="form-control"].sendKeys("this is demo");
		
		WebElement emailtxt= driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
		emailtxt.sendKeys("test@test.com");
		
		//if locator is finding more thaan one element --> it will perform operation on first element 
		WebElement currentAddresstxt=driver.findElement(By.xpath("//textarea[@class='form-control']"));
		currentAddresstxt.sendKeys("current address detaails");
		
	}
	
	

}
