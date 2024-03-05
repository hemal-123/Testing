package Selenium.Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Connection.Driverconnection;

public class Dropdown {

	
		public static void main(String[] args) {
		
		String url=("https://demo.guru99.com/test/newtours/register.php");
		 WebDriver driver = Driverconnection.getDriver(url);
		 JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,750)");

			WebElement dropdown = driver.findElement(By.name("country"));

			Select s = new Select(dropdown);

			boolean result = s.isMultiple();
			System.out.println(result);
			s.selectByIndex(2);
	}

}
