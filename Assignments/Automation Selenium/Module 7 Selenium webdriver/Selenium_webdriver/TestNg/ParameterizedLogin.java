package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Connection.Driverconnection;

public class ParameterizedLogin {

	@Parameters({"Email","Password"})
	@Test
	public void  login(String email,String password ) {
		String url=("https://www.facebook.com/");
		  WebDriver    driver   = Driverconnection.getDriver(url);
	WebElement emailfield =	driver.findElement(By.id("email"));
		emailfield.sendKeys(email);
		WebElement passwordfield=driver.findElement(By.id("pass"));
		passwordfield.sendKeys(password);
	}

}
