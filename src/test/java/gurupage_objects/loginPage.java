package gurupage_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.testBase;

public class loginPage extends testBase {
	
	
	
	// all objects of login page 
	By username=By.xpath("//input[@name='login[username]']");
	By password=By.xpath("//input[@name='login[password]']");
	By signup_btn=By.xpath("//span[contains(text(),'Login')]");
	By accountbtn=By.xpath("//span[contains(text(),'Account')]");
	By loginlink=By.xpath("//a[contains(text(),'Log In')]");
	
	
	// constructer 
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	// Click on account buttoun  
		public void accountBtn()
		{
			driver.findElement(accountbtn).click();
		}
		
		
		// Click on account buttoun  
				public void loginlink()
				{
					driver.findElement(loginlink).click();
				}
				
		
	// set username 
	public void setUsername(String userid)
	{
		driver.findElement(username).sendKeys(userid);
	}
	
	
	// set password 
	public void setPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	// click on sign up button 
	public void clickSignup()
	{
		driver.findElement(signup_btn).click();
	}

}
