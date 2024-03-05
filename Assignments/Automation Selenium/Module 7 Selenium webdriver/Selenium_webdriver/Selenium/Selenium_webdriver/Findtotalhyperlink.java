package Selenium.Selenium_webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.Driverconnection;

public class Findtotalhyperlink {

	public static void main(String[] args) {
		String url= ("http://demo.guru99.com/test/web-table-element.php");
		WebDriver driver = Driverconnection.getDriver(url);
		List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Hyperlinks of the page : "  +  hyperlinks.size());
		for (WebElement alllink : hyperlinks) {
			System.out.println(alllink.getText()+  " - " + alllink.getAttribute("href"));
		
	}
	}

}
