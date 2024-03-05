package TopsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Currentopening {

	public static void main(String[] args) throws InterruptedException {
		String url=("https://careercenter.tops-int.com/");
		WebDriver driver= DriverConnection.getDriver(url);
		WebElement mo = driver.findElement(By.id("mobile"));
		mo.sendKeys("7600859347");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("7600859347");
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		
		WebElement key = driver.findElement(By.id("keyword"));
		key.sendKeys("JAVA");
		
		WebElement city = driver.findElement(By.id("select2-location-container"));
		city.click();
		
		WebElement input = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		input.sendKeys("Ahmedabad");
		
		WebElement search = driver.findElement(By.xpath("//input[@type='submit'])"));
		search.click();
		
		
	}

}
