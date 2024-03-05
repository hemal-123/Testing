package TopsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Changepassword {

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
		
		WebElement cd = driver.findElement(By.xpath("//a[contains(text(),'Password')]"));
		cd.click();
		
		WebElement cp = driver.findElement(By.id("current_password"));
		cp.sendKeys("hemal@1213");
		
		WebElement np = driver.findElement(By.id("new_password"));
		np.sendKeys("hemal@444");
		
		WebElement pc = driver.findElement(By.id("confirm_password"));
		pc.sendKeys("hemal@2134");
		
		WebElement cgp = driver.findElement(By.id("changePasswordSubmit"));
		cgp.click();
	}

}
