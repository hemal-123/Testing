package Selenium.Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.Driverconnection;

public class Radiobutton {

	public static void main(String[] args) {
		String url=("https://demo.guru99.com/test/radio.html");
		WebDriver driver= Driverconnection.getDriver(url);
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		radio1.click();

	}
	}


