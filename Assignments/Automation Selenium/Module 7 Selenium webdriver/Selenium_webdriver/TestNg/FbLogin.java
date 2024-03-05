package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Connection.Driverconnection;

public class FbLogin {

	@Test
	public void  login( ) {
		
		String url=("https://www.facebook.com/");
		  WebDriver    driver   = Driverconnection.getDriver(url);
	WebElement email =	driver.findElement(By.id("email"));
		email.sendKeys("lamhe@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("lamhe");
	}

}
