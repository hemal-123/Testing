package Fblogin;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Connection.Driverconnection;




public class Dataprovider {

		
		WebDriver driver;
		@Test(dataProvider =  "dp")
		
	
		public void  login(String email,String pass ) {
			String url=("https://www.facebook.com/");
			WebDriver driver= Driverconnection.getDriver(url);
			driver.findElement(By.id("email")).sendKeys(email);
			driver.findElement(By.id("pass")).sendKeys(pass);
		}
			
		@Test
		@DataProvider(name="dp")
		
			
				public  Object[][] loginData() {
					Object[][] obj = new Object[4][2];
							

					obj[0][0] = "correct@gmail.com";
					obj[0][1] = "correct password";
					
					obj[1][0] = "incorrect@gmail.com";
					obj[1][1] = "incorrect password";
					
					obj[2][0] = "incorrect@gmail.com";
					obj[2][1] = "incorrect password";
					
					obj[3][0] = "incorrect@gmail.com";
					obj[3][1] = "incorrect password";
					
					
					return obj;
	}

}
