package TopsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	public  static void main(String[] args) {
		
		String url=("https://careercenter.tops-int.com/");
		WebDriver driver= DriverConnection.getDriver(url);
		WebElement mo= driver.findElement(By.id("mobile"));
		mo.sendKeys("7600859347");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("7600859347");
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
	}

}
