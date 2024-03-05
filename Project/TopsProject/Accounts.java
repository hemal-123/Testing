package TopsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Accounts {

	public static void main(String[] args) throws InterruptedException {
		String url=("https://careercenter.tops-int.com/");
		WebDriver driver= DriverConnection.getDriver(url);
		WebElement mo = driver.findElement(By.id("mobile"));
		mo.sendKeys("7600859347");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("7600859347");
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		
		WebElement accounts= driver.findElement(By.linkText("Accounts"));
		accounts.click();
		
		
		WebElement course = driver.findElement(By.id("courseJob"));
		Select courses = new Select(course);
		courses.selectByValue("295319");
		WebElement receipt1 = driver.findElement(By.xpath("//i[@class='fa-solid fa-download']"));
		receipt1.click();
	}

}
