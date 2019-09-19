package guru_tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import base.testBase;
import gurupage_objects.loginPage;

public class loginTest extends testBase{

	@Test
	public void login() throws IOException
	{
		setup();
		loginPage lp=new loginPage(driver);		
		lp.accountBtn();
		lp.loginlink();
		lp.setUsername("sagar01qa@gmail.com");
		lp.setPassword("sagar123");
		lp.clickSignup();
		
		
	}
		
	
}
