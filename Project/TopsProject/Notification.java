package TopsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v118.css.model.SelectorList;
import org.openqa.selenium.support.ui.Select;

public class Notification {

	public static void main(String[] args) {
		String url=("https://careercenter.tops-int.com/");
		WebDriver driver= DriverConnection.getDriver(url);
		WebElement mo= driver.findElement(By.id("mobile"));
		mo.sendKeys("7600859347");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("7600859347");
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		WebElement Nf=driver.findElement(By.xpath("//i[@class='fa-regular fa-bell']"));
		Nf.click();
		WebElement SA=driver.findElement(By.id("notificationFilter"));
		SA.click();
		
		
		
		/*WebElement dropdown2=driver.findElement(By.id("notificationFilter"));
		Select s1= new Select(dropdown2);
		s1.selectByValue("292631");
		*/
		WebElement dropdown3=driver.findElement(By.id("notificationFilter"));
		Select s2= new Select(dropdown3);
		s2.selectByValue("unread");
		
		WebElement viewdetetails = driver.findElement(By.linkText("View Details"));
		viewdetetails.click();
		
		
	}
	}



