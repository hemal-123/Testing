package Selenium.Selenium_webdriver;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.Driverconnection;


public class Alerts {
	
	
	public static void main(String[] args) {

		
	
	    String url=("https://demo.guru99.com/test/delete_customer.php");
	    WebDriver    driver   = Driverconnection.getDriver(url);
        WebElement customerId = driver.findElement(By.xpath("//input[@type='text']"));
        customerId.sendKeys("12345");
        WebElement submitbtn = driver.findElement(By.name("submit"));
        submitbtn.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
        
        
        
	}

            
	}


