package TopsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		String url=("https://careercenter.tops-int.com/");
		WebDriver driver= DriverConnection.getDriver(url);
		WebElement mo = driver.findElement(By.id("mobile"));
		mo.sendKeys("7600859347");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("7600859347");
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();

		
		
		WebElement mycourse = driver.findElement(By.linkText("Diploma In Software Testing And Automation"));
		Actions action = new Actions(driver);
		action.moveToElement(mycourse).build().perform();

		mycourse.click();
		WebElement  assign = driver.findElement(By.linkText("Assignment"));
		assign.click();
		
		
	}

}
