package Selenium.Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.service.DriverFinder;

import Connection.Driverconnection;

public class LinkTextandpartialLinkText {

	public static void main(String[] args) {

		String url = ("https://mysy.guj.nic.in/");
		WebDriver driver = Driverconnection.getDriver(url);
		WebElement partiallink = driver.findElement(By.partialLinkText("Student"));
		partiallink.click();

		WebElement forgotpass = driver.findElement(By.linkText("Forgot Password"));
		forgotpass.click();

	}

}
