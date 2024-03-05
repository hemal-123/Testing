package TopsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Resumebuilder {

	public static void main(String[] args) throws InterruptedException {
		String url=("https://careercenter.tops-int.com/");
		WebDriver driver= DriverConnection.getDriver(url);
		WebElement mo = driver.findElement(By.id("mobile"));
		mo.sendKeys("7600859347");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("7600859347");
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		
		WebElement resume = driver.findElement(By.linkText("Resume Builder"));
		resume.click();
		
		//WebElement title = driver.findElement(By.id("title"));
	    //title.clear();
		//title.sendKeys("Automation");
		
		//WebElement contact = driver.findElement(By.id("contact"));
		//contact.clear();
		//contact.sendKeys("9712456789");
		
		//WebElement email  = driver.findElement(By.id("email"));
		//email .clear();
		//email .sendKeys("lamhe123@gmail.com");
		
		//WebElement add  = driver.findElement(By.id("address"));
		//add .clear();
		//add .sendKeys("galaxy app, naroda , ahemedabad");
		
		
		//WebElement link  = driver.findElement(By.id("linkedinLink"));
		//link.clear();
		// link.sendKeys("resume id");
		 
		//WebElement git  = driver.findElement(By.id("githubLink"));
		//git.clear();
	    //git.sendKeys("lamhe id");
			 
		//WebElement behance  = driver.findElement(By.id("behanceLink"));
		//behance .clear();
		//behance .sendKeys("abcdlink");
		
		//WebElement save = driver.findElement(By.id("personalDetailSubmit"));
		//save.click();
		
		//WebElement profile = driver.findElement(By.id("v-pills-profile-tab"));
		//profile.click();
		
		  WebElement summary  = driver.findElement(By.id("summeryContent"));
		  summary .clear();
	      summary.sendKeys("details");
		
		
		WebElement next = driver.findElement(By.id("personalDetailSubmit"));
		next.click();
			 
			 
		//WebElement skills = driver.findElement(By.id("v-pills-technical-tab"));
		//skills.click();
		
		//WebElement program = driver.findElement(By.id("programmingLanguages"));
		//program .clear();
		//program .sendKeys("javascript");
		
		WebElement database = driver.findElement(By.id("programmingLanguages"));
		database .clear();
		database .sendKeys("javascript");
		
		WebElement webserver = driver.findElement(By.id("webServers"));
		webserver .clear();
		webserver .sendKeys("apache");
		
		WebElement software = driver.findElement(By.id("webServers"));
		software .clear();
		software .sendKeys("jira");
		
		WebElement systems = driver.findElement(By.id("systems"));
		systems .clear();
		systems .sendKeys("windows");
		
		WebElement SN = driver.findElement(By.id("systems"));
		SN.click();
	}

}
