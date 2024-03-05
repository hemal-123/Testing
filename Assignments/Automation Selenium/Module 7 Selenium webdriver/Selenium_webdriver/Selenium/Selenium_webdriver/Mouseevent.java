package Selenium.Selenium_webdriver;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Connection.Driverconnection;

public class Mouseevent {

	
		public static void main(String[] args) {
			
			String url=("https://demo.guru99.com/test/newtours/register.php");
			WebDriver driver= Driverconnection.getDriver(url);
			WebElement registerbtn = driver.findElement(By.linkText("Flights"));
			Actions action = new Actions(driver);
			action.moveToElement(registerbtn).build().perform();
			registerbtn.click();
			
		}
	}


