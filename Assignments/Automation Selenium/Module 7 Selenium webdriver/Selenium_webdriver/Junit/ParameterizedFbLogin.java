package Junit;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Connection.Driverconnection;
import basic.junit.DriverConnection;

@RunWith(Parameterized.class)
public class ParameterizedFbLogin {
	String email;
	String password;

	public ParameterizedFbLogin(String email,String password) {
	this.email= email;
	this.password= password;
 
	

	}

	WebDriver driver = null;

	@Before
	public void openbrowser() {
		String url = "https://www.facebook.com/";
		driver = Driverconnection.getDriver(url);

	}

	@Test
	public void loginTest() {

		WebElement emailele = driver.findElement(By.id("email"));
		emailele.sendKeys(email);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password);

	}

	@Parameters
	public static List<Object[]> data() {

		Object[][] o = new Object[4][2];
		o[0][0] = "incorrect@gmail.com";
		o[0][1] = "incorrect";

		o[1][0] = "incorrect@gmail.com";
		o[1][1] = "incorrect";

		o[2][0] = "incorrect@gmail.com";
		o[2][1] = "incorrect";

		o[3][0] = "incorrect@gmail.com";
		o[3][1] = "incorrect";

		return Arrays.asList(o);

	}
}