package TopsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Certificate {

	public static void main(String[] args) throws InterruptedException {
		String url=("https://careercenter.tops-int.com/");
		WebDriver driver= DriverConnection.getDriver(url);
		WebElement mo = driver.findElement(By.id("mobile"));
		mo.sendKeys("7600859347");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("7600859347");
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		
		//WebElement certi = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
		//certi.click();
		WebElement certi = driver.findElement(By.id("courseJob"));
		certi.click();
		Thread.sleep(2000);
		WebElement accounts= driver.findElement(By.linkText("Accounts"));
		Actions action = new Actions(driver);
		action.moveToElement(accounts).build().perform();
	}

}
