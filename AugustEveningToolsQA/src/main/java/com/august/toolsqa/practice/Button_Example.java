package com.august.toolsqa.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_Example {

	public static void main(String[] args) {
		//step 1 -> Register the driver 
				System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");

				//Step 2- Create object of the class 
				ChromeDriver driver=new ChromeDriver(); //browser will get 
				
				//step 3 -
				driver.navigate().to("https://demoqa.com/buttons");
			
				driver.manage().window().maximize();
				
				driver.navigate().refresh();
				
				WebElement clickMebtn= driver.findElement(By.xpath("//button[text()='Click Me']"));
				
				System.out.println(clickMebtn.getText());
				
				//List<WebElement> listOfElements=driver.findElements(By.xpath("//but"));
				
				//System.out.println(listOfElements.size());
				
				//clickMebtn.click();
				
				driver.close();


	}

}
