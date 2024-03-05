package TopsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Personaldetails {

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
		
		WebElement personaldetails = driver.findElement(By.linkText("Personal Details"));
		personaldetails.click();
		Thread.sleep(2000);
		
		
		
		WebElement HP= driver.findElement(By.xpath("//span[@id='select2-salutation-container']"));
		HP.click();
		
		WebElement box= driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		box.sendKeys("Ms");
		
		WebElement firstname= driver.findElement(By.name("first_name"));
		firstname.sendKeys("hemal");
		
		WebElement lastname= driver.findElement(By.id("lastName"));
		lastname.sendKeys("lamhe");
		

		WebElement email= driver.findElement(By.id("email"));
		email. sendKeys("lamhe@gmail.com");
		
		//WebElement Mobile= driver.findElement(By.id("mobile"));
		//Mobile.sendKeys("9725250467");
		
		//WebElement phone= driver.findElement(By.id("phone"));
		//phone.sendKeys("1234567890");
		
		//WebElement link= driver.findElement(By.id("linkedin_id"));
		//link.sendKeys("https://www.djfjf.com");
		
		
		
		WebElement gender= driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		gender.sendKeys("other");
		
		WebElement fathername= driver.findElement(By.name("father_name"));
		fathername.sendKeys("hashmukh");
		
		WebElement mothername= driver.findElement(By.name("mother_name"));
		mothername.sendKeys("jagruti ben");
		
		WebElement ga= driver.findElement(By.name("guardian_name"));
		ga.sendKeys("sahil");
		
		WebElement IA= driver.findElement(By.name("id_no"));
		IA.sendKeys("12345678");
		
		}
	}


