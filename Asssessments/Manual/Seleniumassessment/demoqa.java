package Seleniumassessment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;

public class demoqa {

	public static void main(String[] arg) throws InterruptedException {
		
		String url= "https://demoqa.com/automation-practice-form";
		WebDriver driver= Driverconnection.getDriver(url);
		
		WebElement name= driver.findElement(By.id("firstName"));
		name.sendKeys("lamhe");
		
		WebElement lastname= driver.findElement(By.id("lastName"));
		lastname.sendKeys("panchal");
		
		
		
		WebElement email= driver.findElement(By.id("userEmail"));
		email.sendKeys("lamhe@gmail.com");
		//Thread.sleep(2000);
		
		 WebElement gender= driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
	     gender.click();
	     ////input[@id="gender-radio-1"]
	     
	     
		
		WebElement mobile= driver.findElement(By.id("userNumber"));
		mobile.sendKeys("1234567890");
		
		 WebElement hobbies= driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
	     hobbies.click();
	     
	     WebElement subject= driver.findElement(By.xpath("//div[@class='subjects-auto-complete__indicators css-1wy0on6']"));
	     subject.sendKeys("software");
		
		//WebElement picture= driver.findElement(By.id("uploadPicture"));
		//picture.click();
		
		WebElement address= driver.findElement(By.id("currentAddress"));
		address.sendKeys("galxy naroda ahemedabad"); 
		
	    //driver.close();
	}
		
		}





					
