package Junit;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Connection.Driverconnection;

public class FacebookLogin {
	
	

	@Test
	public void login() {
		String url= ("https://www.facebook.com/");
		WebDriver    driver   = Driverconnection.getDriver(url);
		
		
	    WebElement username=driver.findElement(By.id("email"));
	    username.sendKeys("lamhe@gmail.com");
	    
	   
	    WebElement password=driver.findElement(By.id("pass"));
	    password.sendKeys("lamhe");
	    
	    
		
		
		
		
	}

}
