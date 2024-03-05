package TopsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {

	public static void main(String[] args) throws InterruptedException {
		String url=("https://careercenter.tops-int.com/");
		WebDriver driver= DriverConnection.getDriver(url);
		WebElement mo = driver.findElement(By.id("mobile"));
		mo.sendKeys("7600859347");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("7600859347");
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();

		WebElement viewdetetails = driver.findElement(By.xpath("//i[@class='fa-solid fa-angle-down mx-md-2 me-2']"));
		viewdetetails.click();
		
		WebElement logout = driver.findElement(By.xpath("//a[@class='dropdown-item text-danger']"));
		logout.click();
	}

}
